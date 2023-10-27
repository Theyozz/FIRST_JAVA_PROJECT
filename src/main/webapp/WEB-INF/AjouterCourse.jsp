<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Ajouter une course</h2>
	<form method="POST">
		<input type="number" placeholder="Durée en minute" name="DUREE">
		<input type="number" placeholder="Distance en mètres" name="DISTANCE">
		<select>
			<c:forEach items="${abonnes}" var="abonne">
				<option value="${abonne.id }" name="ID_ABONNE">${abonne.nom }</option>
			</c:forEach>
		</select>
		<select>
			<c:forEach items="${tapis}" var="tapis">
				<option value="${tapis.id }" name="ID_TAPIS">${tapis.nom }</option>
			</c:forEach>
		</select>
		<button type="submit">Valider</button>
	</form>
</body>
</html>