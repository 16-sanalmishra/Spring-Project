<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<h1 style="text-align: center;">User Registration</h1><br><br>
	<form action="tosomewhere" method="post" style="text-align: center;">
		<table style="margin-left: auto; margin-right: auto; ">
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Pass:</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td /><br><br>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>

</body>
</html>