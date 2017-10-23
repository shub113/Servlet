<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
</head>
<body>
	<%
	
	HttpSession session1= request.getSession();
	String name= (String) session.getAttribute("name");
	response.setHeader("Cache-Control","no-cache");
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	response.setDateHeader("Expires",0);
	 if(name==null || name==""){
		response.sendRedirect("Home.jsp");
	} 
	%>
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" ><h3>Welcome <%=name %></h3></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Signoutt">Logout</a></li>
    </ul>
  </div>
</nav>
	
</body>
</html>