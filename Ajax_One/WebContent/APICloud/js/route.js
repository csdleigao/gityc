angular.module('webApp',['ngRoute'])
	            .config(['$routeProvider', function($routeProvider){
	                $routeProvider
	                .when('/home',{templateUrl:'tpl/home.html'})
	                .when('/function',{templateUrl:'tpl/function.html'})
	               
	                .otherwise({redirectTo:'/home'});
	            }]);