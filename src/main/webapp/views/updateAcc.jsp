<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bootstrap 4 Dropdowns within a Nav</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
	.bs-example{
    	margin: 20px;
    }
</style>
</head>
<body>

	<div align="center">
		<h3>Update Account Here</h3>
		<font color='green'>${SuccMsg}</font> <font color='red'>${FailMsg}</font>

		<form:form action="registerUser" method="POST" modelAttribute="userAcc">
			<table>
				
			<tr>
				<td>First Name:</td>
				<td><form:input path="firstName" /></td>
				<form:hidden path="id"/>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="pwd" /></td>
				<form:hidden path="pwd" />
			</tr>
			<tr>
				<td>DOB:</td>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="M" /> Male <form:radiobutton
						path="gender" value="F" />Female</td>
			</tr>
			<tr>
				<td>SSN:</td>
				<td><form:input path="ssn" /></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td>Role:</td>
				<td><form:select path="role" id="role">
						<form:option value="">-Select-</form:option>
						<form:option value="Case Worker">Case Worker</form:option>
						<form:option value="Admin">Admin</form:option>
					</form:select>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
	<a href="viewAccount">View Accounts</a>
	
	<footer class="page-footer font-small blue">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2020 Copyright:
    <a href="https://mdbootstrap.com/">IES-Intergrated Eligibility System.</a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer --></div>
</body>
</html>