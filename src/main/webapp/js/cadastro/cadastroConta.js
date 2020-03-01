/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
cantinaApp.controller("CadastroContaController", 
		function($scope, $http){
	
	var self = this;
    
	$scope.buscaevalidaCPF = function(responsavel, event){
		if(event == undefined || event.keyCode == 13){
			$http({
	            method: 'GET',
	            url: 'http://localhost:8080/cantina/cadastroConta/buscaValidaCPF/123'
	        }).then(function successCallback(response){
	            alert(response);
	            alert(responde.data);
	        }, function errorCallback(response){
	            //self.ocorreuErro();
	        });
		} else {
			var cpf = getStringSomenteNumeros(responsavel.cpf);
			if(cpf.length > 11){
				cpf = cpf.substring(0,11);
			}
			responsavel.cpf = cpf;
		}
	};
	
	
    $scope.salvarResponsavel = function(responsavel){
        alert(responsavel.cpf + ' - '+ responsavel.nome);
    };
    
});
