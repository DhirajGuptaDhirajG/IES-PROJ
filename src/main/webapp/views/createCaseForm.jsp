<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<h2>Create Case</h2>

<%-- <form action="viewData">
<input type="text" name="id" placeholder="enter app id..">
<button>Find</button>
</form> --%>

<form:form action="viewData" method="POST" modelAttribute="data">
    <!-- <textarea rows="4" cols="50" path="id">Enter text here</textarea> -->
 <input type="submit" value="Echo"> --!>
 
<input type="text" name="id" placeholder="enter app id..">
<button>Find</button>
<table border="1">
			
		<%-- //<c:forEach items="${data}" var="data"> --%>

			<tr>
			<td>SR.NO.</td>
			<td><input type="text" id="id" name="id" value="${data.id}"/></td>
			</tr>
			<tr>
			
			<th>First Name</th>
			<td><input type="text" id="firstName" name="firstName" value="${data.firstName}"/></td>
			</tr>
			<tr>
			<td>Last Name</td>
			<td><input type="text" id="lastName" name="lastName" value="${data.lastName}"/></td>
			</tr>
			<tr>
			<td>Email</td>
			<td><input type="text" id="email" name="email" value="${data.email}"/></td>
			</tr>
			<tr>
			<tr>
			<td>Gender</td>
			<td><input type="text" id="gender" name="gender" value="${data.gender}"/></td>
			</tr>
			<tr>
			<td>DOB</td>
			<td><input type="text" id="dob" name="dob" value="${data.dob}"/></td>
			</tr>
			<tr>
			<td>SSN</td>
			<td><input type="text" id="ssn" name="ssn" value="${data.ssn}"/></td>
			</tr>
			<tr>
			<td>Phone</td>
			<td><input type="text" id="phone" name="phone" value="${data.phone}"/></td>
			</tr>
	<%-- //	</c:forEach> --%>
</table>
</form:form>
</body>
</html>