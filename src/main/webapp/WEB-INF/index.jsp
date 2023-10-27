<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h2>Liste abonnes</h2>
			<ol>
				<c:forEach items="${abonnes}" var="abonne">
						<a href="ModifierAbonne?id=${abonne.id }">
							<li>${abonne.prenom} ${abonne.nom}</li> 
						</a>
						<a href="SupprimerAbonne?id=${abonne.id }"><button>supprimer</button></a>
				</c:forEach>
			</ol>
	<a  href="AjouterAbonne"><h2>Ajouter un abonne</h2></a>
	
	
	<h2>Liste Tapis</h2>
			<ol>
				<c:forEach items="${tapis}" var="tapis">
							<li>${tapis.nom}</li> 
				</c:forEach>
			</ol>
	<a  href="AjoutTapis"><h2>Ajouter un tapis</h2></a>
	<a  href="AjouterCourse"><h2>Ajouter une course</h2></a>
</body>
</html>