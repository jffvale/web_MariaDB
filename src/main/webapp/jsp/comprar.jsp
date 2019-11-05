<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
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
	            <th>marca</th>
	            <th>unidade</th>
	            <th>qtde</th>
	            <th>preço/unidade</th>
	        </tr>
	        <tr>
	            <td>001</td>
	            <td>Arroz Tipo 1</td>
	            <td>Fantástico</td>
	            <td>pacote</td>
	            <td>   1 Kg</td>
	            <td>R$  4,50</td>
	        </tr>
        </tbody>
    </table>

    <h1>COMPRA CONFIRMADA</h1>
<!--
        <br>
    <form action="buy">
		<button name="button">CONFIRMAR COMPRA</button>
	</form>
-->
    <br>
    <form action="register">
		<button name="button">TELA CADASTRAR</button>
	</form>

	<br>
    <form action="stock">
		<button name="button">ESTOQUE</button>
	</form>

	 <br>
	 <form action="home">
		<button name="button">HOME</button>
	</form>

	</body>
</html>