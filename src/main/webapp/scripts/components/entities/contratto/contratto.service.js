'use strict';

angular.module('jhipsterdemoApp')
    .factory('Contratto', function ($resource, $sce) {
        return $resource('api/contrattos/:id', {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    data.decorrenzaDate = new Date(data.decorrenzaDate);
                    data.scadenzaDate = new Date(data.scadenzaDate);
                    return data;
                }
            },
            'update': { method:'PUT' },
            'pdf': {  
            	url : 'api/contrattos/:id/pdf',
                method: 'GET',
                headers: {
                    accept: 'application/pdf'
                },
                responseType: 'arraybuffer',
                cache: true,
                transformResponse: function (data) {
                    var pdf;
                    if (data) {
                        pdf = new Blob([data], {
                            type: 'application/pdf'
                        });
                    }
                    var pdfUrl = URL.createObjectURL(pdf);
                    //window.open(pdfUrl);
                    var content = $sce.trustAsResourceUrl(pdfUrl);
                    return content;
                    /* return {
                        response: pdf
                    }; */
                }
            }             
        });
    });
