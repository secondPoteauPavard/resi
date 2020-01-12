<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="style/index.css">
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>



<meta charset="UTF-8">
<title>Accueil</title>

<%@include file="pages/nav.jsp" %>

</head>



<body>

	<div class="container" id="divTexte">
		<div id="divGrosTitre">
			<h1 id="h1Titre">Trouvez le logement idéal</h1>
		</div>
		<div id="divSousTitre">
			<p>Plus de 150 partenaires en France</p>
			<p class="lead">Trouvez un logement maintenant</p>
		</div>
	</div>
	
<div id="divRecherche" class="container">
	<form>
	  <div  class="form-row">
	    <div class="col">
	      <input type="text" class="form-control" placeholder="Lieu">
	    </div>
	    <button id="btnRechercher" type="button" class="btn btn-light">Rechercher</button>
	  </div>
	</form>
</div>


<br><br><br><br><br><br><br><br><br><br><br><br>

</body>

<%@include file="pages/footer.jsp" %>

</html>












