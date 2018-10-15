// var mainapp = angular.module('mainApp', []);
//         mainapp.controller("studentController", function($scope,$http) {
//        	 
//        	 $http.get("http://localhost:8080/values").then(function(response) {
//                $scope.items = response.data;
//            }); 
//         });

angular.module('hello', [])
  .controller('home', function($scope) {
    $scope.greeting = {id: '123', content: 'Hello World!'}
})