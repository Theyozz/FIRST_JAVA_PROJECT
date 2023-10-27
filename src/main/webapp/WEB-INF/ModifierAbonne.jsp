<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
		<h1>Modifier cet abonne : ${abonne.prenom}  ${abonne.nom}</h1>
		<input type="text" name="PRENOM_ABONNE" value="${abonne.prenom }" placeholder="Modifier le prenom">
		<input type="text" name="NOM_ABONNE" value="${abonne.nom }" placeholder="Modifier le nom">
		<button type="submit">Valider</button>
	</form>
	<a href="index">Retour à l'accueil</a>
</body>
</html>