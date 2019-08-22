/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var cantinaApp = angular.module("CantinaApp", []);

getStringSomenteNumeros = function(string){
	return string.replace(/[^0-9]/g,'');
};
