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
	<form action="/Caballeros/Luchar" method="post">

		<div class="mb-3">
		<input name="pj1" value="${pj1}" class="d-none">
			<c:forEach items="${caballeros}" var="caballero">
				<c:choose>
					<c:when test="${caballero.id==pj1}">
						<div class="form-check form-check-inline d-flex flex-row g-2 d-none">
					<input class="form-check-input" type="radio"
						id="${caballero.id}"
						value="${caballero.id}"> <label class="form-check-label"
						for="${caballero.id}" >${caballero.nombre}</label>
				</div>
					</c:when>
					<c:otherwise>
					<div class="form-check form-check-inline d-flex flex-row g-2">
					<input class="form-check-input" type="radio"
						name="pj2" id="${caballero.id}"
						value="${caballero.id}"> <label class="form-check-label"
						for="${caballero.id}">${caballero.nombre}</label>
				</div>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
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