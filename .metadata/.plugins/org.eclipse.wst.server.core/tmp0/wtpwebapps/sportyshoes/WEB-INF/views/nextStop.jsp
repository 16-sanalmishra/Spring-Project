<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.List , com.training.project.sportyshoes.entity.User"
	isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listing Users</title>
</head>
<body>
	<form action="showProduct" method="post">
	<h1 style="text-align: center;">Users List</h1>
	<table style="margin-left: auto; margin-right: auto; border: 1px solid black;">
		<tr>
			<th style= "border: 1px solid black;">Id</th>
			<th style= "border: 1px solid black;">Name</th>
			<th style= "border: 1px solid black;">Email</th>
			
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td style= "border: 1px solid black;">${user.id}</td>
				<td style= "border: 1px solid black;">${user.name}</td>
				<td style= "border: 1px solid black;">${user.email}</td>
				
			</tr>
		</c:forEach>
	</table>
	<br/>
	<div style="text-align:center">
	<input type="submit" value="View Products">
	</div>
	</form>
</body>
</html>