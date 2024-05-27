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
<div class="alert alert-success" role="alert">
  Zoorionak as Ganado, ${ganador.nombre}!,
</div>
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
			<tr>
				<th scope="row">${ganador.id}</th>
				<td>${ganador.nombre}</td>
				<td>${ganador.fuerza}</td>
				<td>${ganador.experiencia}</td>
				<td>${ganador.foto}</td>
				<td>${ganador.getArma().nombre}</td>
				<td>${ganador.getEscudo().nombre}</td>
			</tr>
		</tbody>
	</table>
	<div class="d-grid gap-2">
		<a class="btn btn-primary"
			href="http://localhost:8080/Caballeros/VerCaballeros">Home</a>
	</div>
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