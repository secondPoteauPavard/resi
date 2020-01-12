<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


<meta charset="UTF-8">
<title>Support</title>

<%@include file="nav.jsp" %>

</head>
<body>
<div>

<h1>Parametres du compte</h1>


<div class="container">
<form method="post">
<table border>
	<tr>
		Mes infos 
	</tr>
	<tr>
		<td>Nom</td>
		<td><input name="nom" type="text" value="<%= request.getAttribute("nom") %>" /></td>
	</tr>
	<tr>
		<td>Prenom</td>
		<td><input name="prenom" type="text" value="<%= request.getAttribute("prenom") %>" /></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input name="email" type="text" value="<%= request.getAttribute("email") %>" /></td>
	</tr>
	<tr>
		<td>Mot de passe</td>
		<td><input name="mdp" type="text" value="<%= request.getAttribute("mdp") %>" /></td>
	</tr>
	<tr>
		<td>Téléphone</td>
		<td><input name="tel" type="text" value="<%= request.getAttribute("tel") %>" /></td>
	</tr>
</table>
<button class="btn btn-lg btn-primary btn-block" type="submit">Modifier</button>
</form>
</div>



</div>

<br><br><br><br><br><br><br><br><br><br><br><br>

</body>

<%@include file="footer.jsp" %>

</html>