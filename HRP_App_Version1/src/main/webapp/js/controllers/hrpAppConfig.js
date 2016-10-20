 /*Created on 20-October-2016
      Author: Nageswara rao
      Copyright (c) 2016 by HR Platform. All Rights Reserved.*/ 

var hrpApp=angular.module('hrpApp',['ui.router','ngResource']);

hrpApp.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){
    // For any unmatched url, send to /home
    $urlRouterProvider.otherwise("/home")
     
    $stateProvider
            .state('home', {//State demonstrating Nested views
                url: "/home",
                templateUrl: "views/home/home.html",
                
            })
            .state('login', {//nested state [login is the nested state of login state]
                url: "/login",
                templateUrl: "views/home/Login.html",
               controller:'loginController'
            })
            .state('register', {//nested state [registration is the nested state of register state]
                url: "/register",
                templateUrl: "views/home/Registration.html",
                controller:'registrationController'
            }) 
}]);