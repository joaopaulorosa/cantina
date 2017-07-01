/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var cantinaApp = angular.module("CantinaApp", []);

cantinaApp.controller("LoginController", function($scope){
    
    $scope.doLogin = function(usuario){
        alert(usuario.nome + ' - '+ usuario.senha);
    };
});

