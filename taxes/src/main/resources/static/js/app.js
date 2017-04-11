var myapp = angular.module("myapp1",[]);
myapp.controller("AppController",function($scope,$http){
	
 $scope.pageEntreprises=[];
	$http.get("http://localhost:8080/listEntreprises?page=0&size=10")
	.success(function(data){
		$scope.pageEntreprises=data;
	})
	.error(function(err){
		Console.log(err);
	});
	
});
