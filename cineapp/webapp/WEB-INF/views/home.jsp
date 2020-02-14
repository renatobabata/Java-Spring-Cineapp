<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bem vindo a Cineapp</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>



<spring:url value="/resources" var="urlPublic"/> 
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
		<div class="panel-heading"> Lista de filmes </div>
		<div class="panel-body">

			<table class="table table-striped table-bordered table-hover ">
				<thread>
				<tr>
					<th>Id</th>
					<th>Título</th>
					<th>Duração</th>
					<th>Classicação</th>
					<th>Gênero</th>
					<th>Data de Lançamento</th>
					<th>Status</th>
					<th>Imagem</th>
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
							<td><fmt:formatDate value="${filme.dataLancamento}" pattern="dd-MM-yyyy"/></td>
							<td>
								<c:choose>
									<c:when test="${filme.status=='ativo'}">
										<span class="label label-success">Ativo</span>
									</c:when>
									<c:otherwise>
										<span class="label label-danger">Inativo</span>
									</c:otherwise>
								</c:choose>
							  </td>
							<td><img src="${urlPublic}/imagens/${filme.imagem}" width="80" height="100"></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>



</body>
</html>