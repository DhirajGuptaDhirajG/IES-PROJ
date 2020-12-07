<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function deleteConfirm(){
	 confirm("Are You Sure, You Want To Delete");
}
</script>
</head>
<body>
	<h2>View Plans Here</h2>
	<!-- <a href="/">+Add New Contacts</a> -->
	<table border="1">
		<tr>
			
			<th>Plan Name</th>
			<th>Plan Description</th>
			<th>Start Plan Date</th>
			<th>End Plan Date</th>
		</tr>

		<c:forEach items="${plans}" var="p">

			<tr>
				
				<td>${p.planName}</td>
				<td>${p.planDesc}</td>
				<td>${p.planStartDate}</td>
				<td>${p.planEndDate}</td>
				<td><a href="editPlan?pid=${p.pid}">Edit</a> 
				<a href="deletePlan?pid=${p.pid}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>