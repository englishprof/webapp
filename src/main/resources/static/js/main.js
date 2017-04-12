angular.module('calendarClient', [])
.controller('CalendarEventReceiver', function($scope, $http) {
    $http.get('http://localhost:8080/calendar').
        then(function(response) {
            $scope.calendarEvent = response.data;
        });
});