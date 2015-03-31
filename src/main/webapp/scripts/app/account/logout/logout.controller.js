'use strict';

angular.module('jhipsterdemoApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
