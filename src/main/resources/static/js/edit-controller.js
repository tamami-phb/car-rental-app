rentalApp.controller('EditController', 
        function($scope, $http, $window) {
    
    $scope.car = {};

    $scope.init = function() {
        var param = $window.location.search.split("&");
        for(i=0; i<param.length; i++) {
            var data = param[i].split("=");
            console.log(data);
            switch(i) {
                case 0: $scope.car.id = data[1];
                case 1: $scope.car.nopol = data[1];
                case 2: $scope.car.merkTipe = data[1];
            }
        }
    }

    $scope.simpan = function() {
        $http.post("/api/tambah", $scope.car)
            .then(sukses, gagal);

        function sukses(response) {
            $window.location.href = "/";    
        };

        function gagal(response) {
            console.log(response);
        };
    }

    $scope.batal = function() {
        $window.location.href = "/";
    }

    $scope.init();

});