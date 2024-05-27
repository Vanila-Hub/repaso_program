<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>
	<c:choose>
		<c:when test="${msg=='no_valid_data'}">
			<div class="alert alert-primary bg-danger text-white" role="alert">Tienes
				campos sin relllenar o el nombre esta repetido</div>
		</c:when>
	</c:choose>

	<div class="container-fluid">
		<form class="d-flex" role="search" method="get"
			action="/Caballeros/Getcaballero">
			<input class="form-control me-2" type="search" placeholder="Search"
				aria-label="Search" name="busqueda">
			<button class="btn btn-outline-success" type="submit">Search</button>
		</form>
	</div>
	
	<div class="d-grid gap-2">
		<a class="btn btn-primary"
			href="http://localhost:8080/Caballeros/AsignarPJ1">Luchar</a>
		<div class="form-floating">
		<form action="/Eliminarcaballeros" method="get">
			<textarea class="form-control" placeholder="iDS A ELIMINAR"
				id="floatingTextarea2" style="height: 100px" name="ids"></textarea>
			<button class="btn btn-outline-success" type="submit">Eliminar</button>
		</form>
		</div>
	</div>
	<form action="/Caballeros/CrearCaballero" method="post">

		<div class="mb-3">
			<nav class="navbar bg-body-tertiary"></nav>
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Nombre</label> <input
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="nombre">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Fuerza</label>
			<input type="text" class="form-control" id="exampleInputPassword1"
				name="fuerza">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Experiencia</label>
			<input type="text" class="form-control" id="exampleInputPassword1"
				name="experiencia">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Foto</label> <input
				type="text" class="form-control" id="exampleInputPassword1"
				name="foto">
		</div>
		<div class="mb-3">
			<select class="form-select" aria-label="Default select example"
				name="arma">
				<option selected>Armas</option>
				<c:forEach items="${armas}" var="arma">
					<option value="${arma.id_arma}">${arma.nombre}</option>
				</c:forEach>
			</select>
		</div>

		<div class="mb-3">
			<select class="form-select" aria-label="Default select example"
				name="escudo">
				<option selected>Escudos</option>
				<c:forEach items="${escudos}" var="escudo">
					<option value="${escudo.id_escudo}">${escudo.nombre}</option>
				</c:forEach>
			</select>
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Nombre</th>
				<th scope="col">Fuerza</th>
				<th scope="col">Experiencia</th>
				<th scope="col">Foto</th>
				<th scope="col">Arma</th>
				<th scope="col">Escudo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${caballeros}" var="caballero">
				<tr>
					<th scope="row">${caballero.id}</th>
					<td>${caballero.nombre}</td>
					<td>${caballero.fuerza}</td>
					<td>${caballero.experiencia}</td>
					<td>${caballero.foto}</td>
					<td>${caballero.getArma().nombre}</td>
					<td>${caballero.getEscudo().nombre}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
		integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
		crossorigin="anonymous"></script>
</body>
</html>