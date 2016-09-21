function Events($scope, $http) {
//	$http.get('http://localhost:8070/EventTracker/events.json').    //the same as below 
	$http.get('events.json').
	success(function(data) {
			$scope.events = data;
		});
}