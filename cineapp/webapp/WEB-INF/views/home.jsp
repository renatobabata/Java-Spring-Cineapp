<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem vindo a Cineapp</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	
	<%--
	<h1>Lista de filmes</h1> 
	<ol>
		<c:forEach items="${filmes }" var="filme">
			<li>${filme}</li>
		</c:forEach>
	</ol>
	--%>


	<div class="panel panel-default">
		<div class="panel-heading">Lista de filmes</div>
		<div class="panel-body">

			<table class="table table-hover ">
				<thread>
				<tr>
					<th>Id</th>
					<th>Título</th>
					<th>Duração</th>
					<th>Classicação</th>
					<th>Gênero</th>
					<th>Data de Lançamento</th>
					<th>Status</th>
				</tr>
				</thread>
				<tbody>
					<c:forEach items="${filmes}" var="filme">
						<tr>
							<td>${filme.id}</td>
							<td>${filme.titulo}</td>
							<td>${filme.duracao}min.</td>
							<td>${filme.classificacao}</td>
							<td>${filme.genero}</td>
							<td>${filme.dataLancamento}</td>
							<td>${filme.status}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>



</body>
</html>