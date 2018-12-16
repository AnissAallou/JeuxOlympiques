
<!DOCTYPE html>
<html>
<%@ include file="/fragment/head.jsp" %>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	


	<!-- API Google -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:500" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Titillium+Web:700,900" rel="stylesheet">
 
	<!-- feuille de style CSS -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />


</head>

<body>

	<div id="notfound">
		<div class="notfound">
			<div class="notfound-404">
				<h1>404</h1>
			</div>
			<h2>Not existing page</h2>
		<c:url value='/login'/>
			<a href="<c:url value='/'/>">Back to homepage</a>
		</div>
	</div>
</html>