
<!DOCTYPE html>
<html>
<%@ include file="/fragment/head.jsp" %>

<head>
<style>
body {
background-color: cyan; 
}
</style>
</head>
<body>

    <div class="container">

	  <form style="margin-top:40px" method="POST" action="<c:url value='/login'/>">
	  <div class="form-group">

	    Pseudo : <input type="text" class="form-control" id="formGroupExampleInput" value="admin" name="userName">
	  </div>
	  <div class="form-group">

	    Password : <input type="password" class="form-control" id="formGroupExampleInput2" value="password"  name="password">
	  </div>
	     <button type="submit" class="btn btn-success" style="background-color: blue; margin-top:20px;">Authenticate</button>
	     <br>
	     ${error}
	     
<c:if test="${!empty erreur}">

	    <span style="color:yellow;">
	    <c:out value="${erreur}"></c:out>
	    
	    
	     <span>

</c:if>


	</form>

	   <form style="margin-top : 10px" method = "POST" action="<c:url value='/ShowRecompense'/>">
	     <button type="submit" class="btn btn-success" style="background-color: blue;">Check Reward</button>	
	   	</form>
	   	
	   	<form style="margin-top : 10px" method = "POST" action="<c:url value='/'/>">
	     <button class="btn btn-success" style="background-color: blue;">Back to homepage</button>
	   	</form>
	</div>


</body>
</html>