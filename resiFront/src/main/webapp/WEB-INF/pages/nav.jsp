<script src="js/nav.js"></script>
<link rel="stylesheet" type="text/css" href="style/nav.css">

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/resiFront/index"><img id="logo" src="img/logo.png" alt="logo"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="/resiFront/support">Support</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="/resiFront/index" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Pages
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="/resiFront/inscription">Inscription</a>
          <a class="dropdown-item" href="/resiFront/connection">Connection</a>
          <a class="dropdown-item" href="/resiFront/fonctionnement">Fonctionnement</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="/resiFront/contact">Nous contacter</a>
        </div>
      </li>
    </ul>
    
    <c:if test= "${empty sessionScope.success}"> 
 	<div id="wrapperBtn">
      	<button id="btnInscription" type="button" onClick="btnInscription()" class="btn btn-light">Inscription</button>
        <button id="btnConnection" type="button" onClick="btnConnection()" class="btn btn-light">Connection</button>
    </div>
    </c:if>


	<c:if test="${sessionScope.isConnectClient=='Y'}">
		<div class="btn-group">
			<button id="btnMonCompte" type="button"
				class="btn btn-light dropdown-toggle" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false">Mon Compte</button>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="/resiFront/parametres">Paramètres</a> 
				<a class="dropdown-item" href="/resiFront/gestionMaison">Gestion maison</a> 
				<a class="dropdown-item" href="/resiFront/historique">Historique</a> 
				<a class="dropdown-item" href="/resiFront">Rechercher</a>

				<div class="dropdown-divider"></div>
				<a class="dropdown-item" href="/resiFront/deconnection">Deconnection</a>
			</div>
	</c:if>




</div>
</nav>