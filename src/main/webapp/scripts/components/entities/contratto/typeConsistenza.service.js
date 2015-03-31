'use strict';

angular.module('jhipsterdemoApp')
    .factory('TypeConsistenza', function ($resource) {
        return $resource('api/typeconsistenza/:id', {}, {
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
