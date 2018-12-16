
<!DOCTYPE html>
<html>
<%@ include file="/fragment/head.jsp"%>

<style>
body {
	background-color: cyan;
}
</style>

<body>


	<%
		session = request.getSession();

		String pseudo = (String) session.getAttribute("pseudo");
	%>
	<h1 style="text-align: center;">
		Hello
		<%=pseudo%></h1>

	<div style="text-align: right;">
		<a href="<c:url value='/deconnection'/>">
			<button type=submit class="btn btn-danger" style="background-color: red;">Logout</button>
		</a>
	 <form style="margin-top : 50px" method = "POST" action="<c:url value='/ShowRecompense'/>">
	     <button type="submit" class="btn btn-success" style="background-color: blue;">Check Reward</button>
	   	</form> 
	   	
	</div>	   	
		<div class="container">

			<form style="margin-top: 50px;" method="POST" action="<c:url value='/login'/>">
				<div class="form-group" style="text-align:left;">


					<label for="pet-select">Athlete</label>
					<select name="athlete" id="pet-select">
						<option value="">Roberto Carlos</option>
						<option value="">Cristiano Ronaldo</option>
						<option value="">Lionel Messi</option>
						<option value="">Andrea Pirlo</option>
						<option value="">Zlatan Ibrahimovic</option>
						<c:forEach items="${athlete}" var="athlete">
							<option value="${athlete.nom}">${athlete.nom}
								${athlete.prenom}</option>

						</c:forEach>

					</select> 
	
					
					<label for="pet-select">Game</label>
					<select name="game" id="pet-select">
					
					<option value="">Saut en hauteur</option>
					<option value="">Saut en longueur</option>
					<option value="">100 mètres</option>
					<option value="">100 mètres</option>
					<option value="">Lancer de poids</option>
					
						<c:forEach items="${Games}" var="game">
							<option value="${Game.key}">${Game.nom}</option>
						</c:forEach>

					</select> 
					
					<label for="pet-select">Medal</label>
						<select name="medal" id="pet-select">
						
						<option value="">Médaille d'Or</option>
						<option value="">Médaille d'Argent</option>
						<option value="">Médaille de Bronze</option>

						<c:forEach items="${Medal}" var="medaille">
							<option value="${Medal.name}">${Medal.name}</option>
						</c:forEach>
					</select>

				</div>
				
				<button type="submit" class="btn btn-success">Add</button>
<hr>
				<span style="color:red; text-align:center;">${errorAddMedal}</span>



			</form>


		</div>



		<br>
		
	  
</body>
</html>