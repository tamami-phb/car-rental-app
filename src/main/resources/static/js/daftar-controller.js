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

    $scope.edit = function(mobil) {
        //console.log(mobil.id);
        //console.log(mobil.nopol);
        //console.log(mobil.merkTipe);
        $window.location.href = "edit-ui?id=" + mobil.id +
                "&nopol=" + mobil.nopol + 
                "&merkTipe=" + mobil.merkTipe;
    }

    $scope.hapus = function(mobil) {
        $http.delete('/api/hapus/' + mobil.id).then(sukses, gagal);

        function sukses(response) {
            $scope.updateDaftar();        
        }

        function gagal(response) {}
    }

    $scope.updateDaftar();

});