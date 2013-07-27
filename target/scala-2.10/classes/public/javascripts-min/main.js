require.config({
    paths: {
        jquery: 'jquery-1.9.0.min',
        angular: 'angular.min',
        angularresource: 'angular-resource.min',
        bootstrap: 'bootstrap.min'
    },
    baseUrl: 'assets/javascripts',
    shim: {
        'angular' : {'exports' : 'angular'},
        'angularMocks': {deps:['angular'], 'exports':'angular.mock'}
    },
    priority: [
        "angular"
    ]
});

require( [
    'jquery',
    'angular',
    'angularresource',
    'bootstrap',
    'app',
    'routes'
], function(angular, app, routes) {
    'use strict';
    angular.bootstrap(document, [app['name']]);
});