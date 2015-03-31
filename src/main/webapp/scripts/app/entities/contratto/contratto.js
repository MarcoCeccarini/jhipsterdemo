'use strict';

angular.module('jhipsterdemoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('contratto', {
                parent: 'entity',
                url: '/contratto',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'jhipsterdemoApp.contratto.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/contratto/contrattos.html',
                        controller: 'ContrattoController'
                    }
                },
                onEnter: function($rootScope, $timeout, $stateParams) {
                    //used $timeout to load after controller gets initialized
                    //so that $on event should get define before broadcasting
                    $timeout(function() {
                        $rootScope.$broadcast('broadcast.init.all');
                    })
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('contratto');
                        return $translate.refresh();
                    }]
                }
            })
            .state('contrattoDetail', {
                parent: 'entity',
                url: '/contratto/:id',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'jhipsterdemoApp.contratto.detail.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/contratto/contratto-detail.html',
                        controller: 'ContrattoDetailController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('contratto');
                        return $translate.refresh();
                    }]
                }
            })
            .state('contrattoDetailEdit', {
                parent: 'entity',
                url: '/contrattoedit/:id',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'jhipsterdemoApp.contratto.detail.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/contratto/contratto-detail-edit.html',
                        controller: 'ContrattoController'
                    }
                },
                onEnter: function($rootScope, $timeout, $stateParams) {
                    //used $timeout to load after controller gets initialized
                    //so that $on event should get define before broadcasting
                    $timeout(function() {
                        $rootScope.$broadcast('broadcast.init.one', $stateParams.id);
                    })
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('contratto');
                        return $translate.refresh();
                    }]
                }
            });
    });
