var app = angular.module("App", [ "ngRoute" ]);


app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "template/choose.jsp",
	}).when("/bookTable", {
		templateUrl : "template/bookTable.jsp",
		controller : "bookTableController"
	}).when("/orderFood", {
		templateUrl : "template/orderFood.jsp",
		controller : "orderFoodController"
	});
});

// app.run(['$rootScope', '$state',function($rootScope, $state){
//
// $rootScope.$on('$stateChangeStart',function(){
// $rootScope.stateIsLoading = true;
// });
//
//
// $rootScope.$on('$stateChangeSuccess',function(){
// $rootScope.stateIsLoading = false;
// });
// }]);
app.controller("bookTableController", function($scope,$http) {
	$scope.tables=[];
	$scope.placeOrder=(table)=>{
		$http.post("/OnlineRestaurantBooking/order/table/", table, { "headers":{ "Accept":"*/*", "Content-Type" :"application/json" } } )
	    .then(function(response) {
	    	alert("order placed");
	    });
	};
	$scope.initialize=()=>{
		 $http.get("/OnlineRestaurantBooking/table/1")
		    .then(function(response) {
		    	$scope.tables=response.data;
		    	$scope.loadingRooms=false;
		    });
	}; 
}).directive('mySharedScope', function() {
	  return {
		  restrict: 'E',
		    template: '<div>Name: {{1}} Address: {{2}}</div>'
		  };
		});
app.controller("orderFoodController", function($scope,$http) {
	$scope.tables=[];
	$scope.placeOrder=(food)=>{
		$http.post("/OnlineRestaurantBooking/order/food/", food,{ "headers":{ "Accept":"*/*", "Content-Type" :"application/json" } } )
	    .then(function(response) {
	    	alert("order placed");
	    });
	};
	$scope.initialize=()=>{
		 $http.get("/OnlineRestaurantBooking/food/1")
		    .then(function(response) {
		    	$scope.tables=response.data;
		    	$scope.loadingRooms=false;
		    });
	};
});
