<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script
src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery
.min.js"></script>
<!-- script>
$(document).ready(function(){
    $(".view-btn").click(function(){
        $(this).text($(this).text() == 'Deactivate' ? 'Activate' : 'Deactivate');
    });
});

</script> -->
<script>
$(document).ready(function () {
    $("#change-text").click(function () {
        $("#toggle-text").fadeOut(function () {
            $("#toggle-text").text(($("#toggle-text").text() == 'Deactivate') ? 'Activate' : 'Deactivate').fadeIn();
        })
    })
});
</script>
<!-- <script type="text/javascript">
Enable = function(val)
{
    var sbmt = document.getElementById("send"); //id of button

    if (val.checked == true)
    {
        sbmt.disabled = false;
    }
    else
    {
        sbmt.disabled = true;
    }
}    
</script> -->
</head>
<body>
<h2>View Accounts Here</h2>


	//<a href="/">+Add New Accounts</a>
	<table border="1">
		<tr>
			<th>SR.NO.</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>SSN</th>
			<th>Phone</th>
			<th>Role</th>
			<th>Status</th>
		</tr>

		<c:forEach items="${users}" var="user">

			<tr>
				<td>${user.id}</td>
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.email}</td>
				<td>${user.pwd}</td>
				<td>${user.dob}</td>
				<td>${user.gender}</td>
				<td>${user.ssn}</td>
				<td>${user.phone}</td>
				<td>${user.role}</td>
				<td>${user.status}</td> 
				<td><a href="editUser?id=${user.id}" >Edit</a></td>
				<td><a href="changeStatus?id=${user.id}" id="toggle-text">Deactivate</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
