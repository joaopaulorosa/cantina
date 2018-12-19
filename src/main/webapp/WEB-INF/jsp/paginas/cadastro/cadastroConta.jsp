<%-- 
    Document   : cadastroConta
    Created on : 19/01/2018, 23:11:06
    Author     : joao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cantina Tia Sandra</title>
        <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
        <style>
            .tamanhoPagina {
                width: 800px;
            }
            .form-control{
                margin-bottom: 5px;
            }
            .logoCantina{
                width: 200px;
                margin-top: 20px;
            }
            .btn-primary{
                width: 95%;
            }
            .centroPagina{
                margin-left: auto;
                margin-right: auto;
            }
            .infoCadastro{
                font: 14px inherit bold;
                margin-left: 10px;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="lib/angular/angular.js"></script>
        <script src="js/cantina.js"></script>
    </head>
    <body ng-app="CantinaApp" ng-controller="CadastroContaController">
        <div class="logoCantina centroPagina">
            <img src="imagens/logo_cantina.jpg" class="logoCantina centroPagina"/>
        </div>
        <div class="centroPagina" align="center">
            <b>
                (SANDRA MARLENE DA SILVA ROSA M.E.)<br><br>
            <u>AUTORIZAÇÃO PARA ABERTURA DE CONTA</u>
            </b>
        </div>
        <br>
        <br>
        <div class="tamanhoPagina centroPagina">
            <div class="centroPagina infoCadastro">
                <b>DADOS DO RESPONSÁVEL FINANCEIRO:</b>
            </div>
            <div class="centroPagina">
                <table width="100%" cellpadding="0" cellspacing="0">
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <input type="text" class="form-control" style="width:50%; " ng-model="responsavel.cpf" placeholder="CPF"/>
                        <input type="text" class="form-control" ng-model="responsavel.nome" placeholder="Nome"/>
                    </table>
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <input type="text" class="form-control" ng-model="responsavel.email" placeholder="E-mail"/>
                        <input type="text" class="form-control" ng-model="responsavel.emailAlternativo" placeholder="E-mail Alternativo"/>
                    </table>
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <input type="text" class="form-control" style="width:50%;" ng-model="responsavel.cepEndereco" placeholder="CEP"/>
                        <input type="text" class="form-control" ng-model="responsavel.logradouroEndereco" placeholder="Endereço"/>
                    </table>
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <tr><td width="60%"></td><td width="40%"></td></tr>
                        <tr>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.complementoEndereco" placeholder="Complemento"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.bairroEndereco" placeholder="Bairro"/>
                            </td>
                        </tr>
                    </table>
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <tr><td width="60%"></td><td width="10%"></td><td width="30%"></td></tr>
                        <tr>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.cidadeEndereco" placeholder="Cidade"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.ufEndereco" placeholder="UF"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.paisEndereco" placeholder="País"/>
                            </td>
                        </tr>
                    </table>
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <tr><td width="10%"></td><td width="30%"></td><td width="10%"></td><td width="30%"></td><td width="20%"></td></tr>
                        <tr>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.dddTelefone" placeholder="DDD Tel"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.telefone" placeholder="Telefone"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.dddCelular" placeholder="DDD Cel"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.celular" placeholder="Celular"/>
                            </td>
                            <td>
                                &nbsp;<input type="checkbox" ng-model="responsavel.possuiWhatsAppCelular"/> Possui WhatsApp
                            </td>
                        </tr>
                    </table>
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <input type="text" class="form-control" ng-model="responsavel.profissao" placeholder="Profissão"/>
                        <input type="text" class="form-control" ng-model="responsavel.nomeEmpresa" placeholder="Nome da Empresa"/>
                        <input type="text" class="form-control" ng-model="responsavel.enderecoEmpresa" placeholder="Endereço Comercial"/>
                    </table>
                    <table width="100%" cellpadding="0" cellspacing="0">
                        <tr><td width="10%"></td><td width="30%"></td><td width="15%"></td><td width="45%"></td></tr>
                        <tr>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.dddTelefoneEmpresa" placeholder="DDD Tel Comercial"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.telefoneEmpresa" placeholder="Telefone Comercial"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.ramalTelefoneEmpresa" placeholder="Ramal Comercial"/>
                            </td>
                            <td>
                                <input type="text" class="form-control" ng-model="responsavel.emailEmpresa" placeholder="E-mail Comercial"/>
                            </td>
                        </tr>
                    </table>
                </table>
                <br>
                <button class="btn btn-primary btn-block centroPagina" ng-click="salvarResponsavel(responsavel);">Salvar</button>
            </div>
        </div>
    </body>
</html>