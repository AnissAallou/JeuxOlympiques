<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="/fragment/head.jsp" %>
<style>
body {
background-color: cyan;
}
</style>
</head>
<body>
<h1 style="text-align: center; color:blue;"><strong>Tu es chez Aziz</strong></h1>
<div style="text-align: center;">
<a href="<c:url value='/login'/>">
<button id ="btn" type="button" class="btn btn-primary" style="background-color:red;">Login</button>
</a>



 </div>
</body>
</html>