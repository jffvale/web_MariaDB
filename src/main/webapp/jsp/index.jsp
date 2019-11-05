<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>HTML Projeto Lab Eng de Software</title> 
		<meta name="description" content="Aprendendo a fazer uma página Web">
		<meta http-equiv="content-type" content="text/html" charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <form action="register">
		<button name="button">CADASTRAR PRODUTO</button>
	</form>

	<br>
    <form action="stock">
		<button name="button">ESTOQUE</button>
	</form>

	</body>
</html>