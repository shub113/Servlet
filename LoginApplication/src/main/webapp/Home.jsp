<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="CSS/Design">
<style>
	#a2{
		top:80px;
		width: 500px;
		min-height:300px;
	}
	#card{
		width:400px;
		height:400px;
	}
	.text-line {
    background-color: transparent;
    color: #000000;
    outline: none;
    outline-style: none;
    border-top: none;
    border-left: none;
    border-right: none;
    border-bottom: solid #0000FF 1px;
    padding: 3px 10px;
}
</style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>


	
</head>
<body Style="background-color:#6495ed">
<div class="container-fluid">
	<form action="Signin" method="post" autocomplete="on" >
	<div class="row" >
	
		<div class="col-sm-4">
		</div>
	
		<div class="col-sm-5" id="a2" >
		<div class="w3-panel w3-card" Style="background-color:white" id="card" >
		
		<h1><b>Sign In</b></h1><br/>
	
		Email <br/>
		<div class="row"><div class="col-sm-10">
		<input type="text" class="text-line" name="username" autofocus pattern="[A-Za-z0-9]+@[A-Za-z0-9]+\.[A-Za-z]{2,3}$" required  title="Enter proper email id"><br/><br/>
		</div></div>
		Password </br><input type="password" class="text-line" name="password" required ><br/><br/>
		<input type="submit" value="SignIn"><br/><br/>
		<a href="Register.jsp"> Create new account</a>
		</div></div>
	
		<div class="col-sm-3">
		</div>
	
	</div>
	</form>
</div>

</body>
</html>