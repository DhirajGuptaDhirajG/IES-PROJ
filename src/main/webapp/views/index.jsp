<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>IES</title>
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


<div class="bs-example">
    <ul class="nav nav-pills mb-5">
        <li class="nav-item">
            <a href="#" class="nav-link active">Home</a>
        </li>
        <li class="nav-item">
            <a href="/citizens" class="nav-link">Application-Registration</a>
        </li>
       <!--  <li class="nav-item">
            <a href="#" class="nav-link">Data Collection</a>
        </li> -->
        <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Data Collection
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="/DataCollect">Create Case</a>
          <a class="dropdown-item" href="#">View Cases</a>
        </div>
      
        
        <li class="nav-item dropdown ml-auto">
            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Admin</a>
            <div class="dropdown-menu dropdown-menu-right">
                <a href="/registers" class="dropdown-item">Create Account</a>
                <a href="/viewAccount" class="dropdown-item">View Account</a>
                <div class="dropdown-divider"></div>
                <a href="/createPlan"class="dropdown-item">Create Plan</a>
                 <a href="/viewPlanss"class="dropdown-item">View Plan</a>
            </div>
        </li>
        <li class="nav-item">
            <a href="#" class="nav-link">Logout</a>
        </li>
    </ul>
    <hr>
    
    </div>
    <div class="fixed-bottom">
    <!-- Footer -->
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
