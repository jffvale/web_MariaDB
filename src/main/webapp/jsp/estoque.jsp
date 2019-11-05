<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType = "text/html" pageEncoding = "UTF-8" %>
<%@ page import = "java.util.*" %>
<%@ page import = "model.Mercadoria" %>
<html lang="pt-br">
	<head>
		<title>HTML Projeto Lab Eng de Software</title> 
		<meta name="description" content="Aprendendo a fazer uma página Web">
		<meta http-equiv="content-type" content="text/html" charset="UTF-8">
	</head>

	<body>
	<h1>Mercearia Joseense</h1>
	<p>Insira o código da mercadoria</p>
	
	<form action="search">
		<label for="Código">cod: </label>
		<input type="text" id="nome" />
		<button name="button">BUSCAR</button>
	</form>
	<br>
	<table>
		<tbody>
			<tr>
	            <th>Cód</th>
	            <th>nome</th>
	            <th>marca do produto</th>
	            <th>quantidade</th>
	            <th>un. medida</th>
	            <th>preço/unidade</th>
	            <th>qtde estoque</th>
	            <th>embalagem</th>
	        </tr>
			<%
                List<Mercadoria> Mercadorias = (List<Mercadoria>) request.getAttribute("mercadoria");
                for ( Mercadoria mi : Mercadorias ){
                    out.print("<tr>");
                    out.print("<td>" + mi.getId() + "</td>");
                    out.print("<td>" + mi.getNome() + "</td>");
                    out.print("<td>" + mi.getMarca() + "</td>");
                    out.print("<td>" + mi.getQtde_unit() + "</td>");
                    out.print("<td>" + mi.getUn_medida() + "</td>");
                    out.print("<td>" + "R$ " + String.format("%.2f", mi.getPreco_unit()) + "</td>");
                    out.print("<td>" + mi.getQtde_estoque() + "</td>");
                    out.print("<td>" + mi.getUn_emb() + "</td>");
                    out.print("</tr>");
                }
            %>

        </tbody>
    </table>


    <br>
    <form action="register">
		<button name="button">TELA CADASTRAR</button>
	</form>

	 <br>
	 <form action="home">
		<button name="button">HOME</button>
	</form>

	</body>
</html>