<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List , com.training.project.sportyshoes.entity.Product"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form method="post">
		<h1 style="text-align: center;">Products List</h1>
		<table
			style="margin-left: auto; margin-right: auto; border: 1px solid black;">
			<tr>
				<th style="border: 1px solid black;">Id</th>
				<th style="border: 1px solid black;">Product Name</th>
				<th style="border: 1px solid black;">Price</th>
				<th style="border: 1px solid black;">Status</th>

			</tr>
			<c:forEach items="${prod}" var="prod">
				<tr>
					<td style="border: 1px solid black;">${prod.id}</td>
					<td style="border: 1px solid black;">${prod.p_name}</td>
					<td style="border: 1px solid black;">${prod.price}</td>
					<td style="border: 1px solid black;"><a href="book">Book</a></td>
					
				</tr>
			</c:forEach>
		</table>
	
		
	</form>


</body>
</html>