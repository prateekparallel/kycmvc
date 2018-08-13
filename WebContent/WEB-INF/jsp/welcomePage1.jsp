<%@page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<h1>
<%
   Collection coll = ((Map)request.getAttribute("welcomeMessage")).values();
   request.setAttribute("coll", coll);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table border="1">
<c:forEach var="name" items="${coll}">
  <tr><td><h1>${name}</h1></td></tr>
</c:forEach>
</table>


${welcomeMessage}
</h1>
</body>
</html>