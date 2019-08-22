/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
cantinaApp.controller("CadastroContaController", function($scope){
    
	$scope.buscaevalidaCPF = function(responsavel){
		var cpf = getStringSomenteNumeros(responsavel.cpf);
		if(cpf.length == 11){
			alert("Buscar no BD se existe o CPF cadastrado.");
			//se tiver cadastrado emitir um alerta avisando e jogar para a tela de login
		} else if(cpf.length > 11){
			cpf = cpf.substring(0,11);
		}
		responsavel.cpf = cpf;
	};
	
	
    $scope.salvarResponsavel = function(responsavel){
        alert(responsavel.cpf + ' - '+ responsavel.nome);
    };
    
});
