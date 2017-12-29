rentalApp.controller('DaftarController',
        function($scope, $http, $window) {

    $scope.daftarMobil = [];
    
    $scope.updateDaftar = function() {
        $http.get('/daftar-mobil').then(sukses, gagal);

        function sukses(response) {
            console.log(response.data);
            $scope.daftarMobil = response.data;
        };

        function gagal(response) {};
    };

    $scope.tambah = function() {
        $window.location.href = "/tambah-ui";
    }

    $scope.updateDaftar();

});