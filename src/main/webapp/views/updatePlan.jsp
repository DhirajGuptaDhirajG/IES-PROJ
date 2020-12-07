<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
 
	<h2>Plan Info Form</h2>
	
	<font color='green'>${succMsg}</font>
	<font color='red'>${errMsg}</font>
	<form:form action="savePlan" method="POST" modelAttribute="plan">
		<table>
			<tr>
				<td>Plan Name</td>
				<td><form:input path="planName" /></td>
				<form:hidden path="pid"/>
			</tr>
			<tr>
				<td>Plan Description:</td>
				<td><form:input path="planDesc" /></td>
			</tr>
			<tr>
				<td>Start Plan Date:</td>
				<td><form:input path="planStartDate" /></td>
			</tr>
			<tr>
				<td>End Plan Date:</td>
				<td><form:input path="planEndDate" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="UpdatePlan" /></td>
			</tr>
		</table>
	</form:form>
	<a href="viewPlans">View All Plans</a>
</body>
</html>