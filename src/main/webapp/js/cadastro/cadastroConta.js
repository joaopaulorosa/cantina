/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
cantinaApp.controller("CadastroContaController", 
		function($scope, $http){
	
	var self = this;

	$scope.buscaevalidaCPF = function(responsavel, event){
		if(responsavel == undefined){
			return;
		}
		if(event == undefined || event.keyCode == 13){
			$http({
	            method: 'GET',
	            url: 'validaCPF/'+ responsavel.cpf
	        }).then(function successCallback(response){
	            if(!response.data){
	            	alert('O CPF informado é inválido. Verifique e tente novamente.');
	            	return;
	            }
	            $http({
	            	method: 'GET',
	            	url: 'buscaCPF/'+ responsavel.cpf
	            }).then(function successCallback(response){
	            	if(response.data != undefined && response.data != ''){
	            		alert('Este CPF já está em uso.');
	            	}
	            }, function errorCallback(response){
	            	alert('Erro ao tentar buscar o CPF.');
	            });
	        }, function errorCallback(response){
	            alert('Erro ao tentar validar o CPF.');
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
