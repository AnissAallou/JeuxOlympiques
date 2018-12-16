
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rewards</title>
<style> 
head, body, thead, tbody, table {
background-color: red; 
}
</style>
</head>
<%@ include file="/fragment/head.jsp"%>
<body>


<table class="table table-striped table-dark">
   <caption><h1 style="color:red;">Athletes & rewards</h1></caption>
  <thead>
	   <tr>

	      <th scope="col" style="color: black; background-color: red;">Ahletes</th>
	      <th scope="col" style="color: black; background-color: red;">Grade Medal</th>
	      <th scope="col" style="color: black; background-color: red;">Game</th>
	      <th scope="col" style="color: black; background-color: red;">Action</th>
	    
	   </tr>
 	</thead>
 	 <tbody>
   <c:forEach items="${Athlete}" var="athlete" varStatus="status">
        <c:if test="${!empty athlete.medals}">
	     	<tr>
	      <td rowspan="${fn:length(athlete.medals)} scope="row"><c:out value="${athlete.nom}"/></td>
	   
	       <c:forEach items="${athlete.medals}" var="medaille">
	   
	      <td>	 Médaille :  ${medal.gradeMedal}</td>
	    
	    
	   <td>	${medal.game}</td>
	   <td>
	     	 <a href="<c:url value='/login'/>">Delete</a></td>

	   </tr>    
	     	</c:forEach>	   
	</c:if>
   	</c:forEach>	  	 
	 </tbody>

</table>
	
<a href="<c:url value='/deconnection'/>"><button type=submit class="btn btn-danger" style="background-color: red;">Logout</button></a><br>
<a href="<c:url value='/login'/>"><button class="btn btn-success" style="background-color: blue; margin-top:5px;">Back to rewards</button></a><br>
<a href="<c:url value='/'/>"><button class="btn btn-success" style="background-color: blue; margin-top:5px;">Back to homepage</button></a>
		
</body>
</html>