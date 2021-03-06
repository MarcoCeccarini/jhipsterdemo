'use strict';

angular.module('jhipsterdemoApp')
    .factory('Attivita', function ($resource) {
        return $resource('api/attivita/:id', {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    });
