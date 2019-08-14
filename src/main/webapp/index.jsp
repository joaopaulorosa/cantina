<%-- 
    Document   : index
    Created on : 19/01/2018, 22:50:36
    Author     : joao
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <%@ include file="/jsp/design/head.jsp" %>
    <head>
    	<style type="text/css">
    	.jumbotron {
			width: 400px;
		}
		.fonteLinks {
			font-size: 12px;
			font-family: sans-serif;
			font-style: oblique;
		}
    	</style>
    </head>
    <body ng-app="CantinaApp" ng-controller="LoginController">
        <div class="logoCantina centroPagina">
            <img src="/cantina/imagens/logo_cantina.jpg" class="logoCantina centroPagina"/>
        </div>
        <div class="jumbotron centroPagina">
        	<div style="width: 95%;" class="centroPagina">
	            <input type="text" class="form-control centroPagina" ng-model="usuario.nome" placeholder="Usuário" onkeyup="doClick(event);"/>
	            <input type="password" class="form-control centroPagina" ng-model="usuario.senha" placeholder="Senha" onkeyup="doClick(event);"/>
	            <br/>
	            <button class="btn btn-primary btn-block centroPagina" id="btnLogin" ng-click="doLogin(usuario)">Login</button>
	            <br/>
	            <div>
		            <table style="width: 100%;">
			            <tr>
				            <td align="center" width="50%"><a href="footer.html" class="fonteLinks">Esqueci minha senha</a></td>
				            <td align="center" width="50%"><a href="jsp/telas/cadastro/cadastroConta.jsp" class="fonteLinks">Quero me cadastrar</a></td>
			            </tr>
		            </table>
	        	</div>
        	</div>
        </div>
    </body>
   	<%@ include file="/jsp/design/footer.jsp" %>
    <script type="text/javascript">
    	doClick = function(event){
    		if (event.keyCode === 13) {
   			   event.preventDefault();
   			   document.getElementById("btnLogin").click();
  			}
    	};
    </script>
</html>
