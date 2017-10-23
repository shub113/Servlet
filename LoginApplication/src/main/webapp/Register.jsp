<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript" src="javaScript/Validation.js"></script>
<style>
	#a1{
		top:50px;
		width: 500px;
		min-height:300px;
	}
	#card{
		width:500px;
		height:500px;
	}
	.error{
		color:red;
		font-style: italic;
		visibility: hidden;
	}
</style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>

</head>
<body Style="background-color:#8a2be2">
<div class="container-fluid">
	<form action="Register" method="post" autocomplete="on" onsubmit="return mobileCheck()" name="f1">
	<div class="row" >
	
	<div class="col-sm-7">
	</div>
	
	<div class="col-sm-5" id="a1" >
	<div class="w3-panel w3-card" id="card" Style="background-color:white ">
	<h1>Sign UP</h1>
		<br/><br/>
		<label id="see">Name</label><br/> 
		<input type="text" name="fname" id = "id1" onblur="emptyName()" placeholder="first name*" autofocus required>&nbsp;&nbsp;
		<input type="text" name="lname" id="id2"  placeholder="last name"><br/>
		<span id="id7" class="error">First name is required</span><br/>
		
		<label>choose username*</label><br/>
		<input type="text" name="username" onblur="checkAvailablity()" pattern="[a-zA-Z0-9]+@[a-zA-z]+\.[A-Za-z]{2,3}$" title="Wrong email pattern" id="id3" placeholder="@gmail.com" required >
		<span id="id8" style="color:green" ></span><br/><br/>
		
		<div class="row"><div class="col-sm-4">
		<label>Password* </label></div>
		 <input type="password" id="id4" onblur="passwordCheck()" name="password" required><br/>
		 <span id="id9" class="error">Password must be 6 character</span>
		</div>
		
		<div class="row"><div class="col-sm-4"> 
		<label>Confirm Password* </label> </div>
		<input type="password" id="id5" name="cpassword" onblur="passwordMatch()" required><br/>
		<span id="11" class="error">Password does not match</span><br/>
		</div>
		
		<div class="row"><div class="col-sm-4"> 
		<label>Mobile number*  </label></div><input  name="mobile"  id="id6" onblur="mobileCheck()" required><br/>
		<span id="id10" class="error">10 digit number required</span>
		</div>
		<br/><input type="submit" value="Register"/>
	</div></div>
	</div>
	</form>
</div>
</body>
</html>