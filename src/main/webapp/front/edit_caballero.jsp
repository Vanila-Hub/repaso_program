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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
	<c:choose>
		<c:when test="${msg=='no_valid_data'}">
			<div class="alert alert-primary bg-danger text-white" role="alert">Tienes
				campos sin relllenar o el nombre esta repetido</div>
		</c:when>
	</c:choose>
<form action="/Caballeros/Edit_caballero" method="post">
		<input value="${caballero.id}" name="id_caballero" class="d-none">
		<div class="mb-3">
			<nav class="navbar bg-body-tertiary"></nav>
		</div>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Nombre</label> <input
				type="text" class="form-control" placeholder="${caballero.nombre}" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="nombre" value="${caballero.nombre}">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Fuerza</label>
			<input type="text" class="form-control" value="${caballero.fuerza}" id="exampleInputPassword1"
				name="fuerza">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Experiencia</label>
			<input type="text" class="form-control" value="${caballero.experiencia}" id="exampleInputPassword1"
				name="experiencia">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Foto</label> <input
				type="text" class="form-control" value="${caballero.foto}" id="exampleInputPassword1"
				name="foto">
		</div>
		<div class="mb-3">
			<select class="form-select" aria-label="Default select example"
				name="arma">
				<c:forEach items="${armas}" var="arma">
					<option value="${arma.id_arma}">${arma.nombre}</option>
				</c:forEach>
				<option value="${caballero.getArma().id_arma}" selected>${caballero.getArma().nombre}</option>
			</select>
		</div>

		<div class="mb-3">
			<select class="form-select" aria-label="Default select example"
				name="escudo">
				<c:forEach items="${escudos}" var="escudo">
					<option value="${escudo.id_escudo}">${escudo.nombre}</option>
				</c:forEach>
				<option value="${caballero.getEscudo().id_escudo}" selected>${caballero.getEscudo().nombre}</option>
			</select>
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

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