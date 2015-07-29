<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="com.ejemplo.tablasDTO.Employees" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejemplo Empleados </title>
</head>
<body>



<table>

<tr>
	<TH>Nombre</TH> <TH>Apellidos</TH> <TH>salary</TH>
	
</tr>
<tr>
	<c:forEach var="counter" items="${listaempleados}"> 
		<tr><td><c:out value="${counter.firstName}"/> </td>
		<td><c:out value="${counter.lastName}"/></td>
		<td><c:out value="${counter.salary}"/> </td></tr>
	</c:forEach>
</tr>

</table>



</body>
</html>