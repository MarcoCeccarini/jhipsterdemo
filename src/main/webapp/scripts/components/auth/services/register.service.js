'use strict';

angular.module('jhipsterdemoApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


