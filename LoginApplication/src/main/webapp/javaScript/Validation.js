function passwordMatch(){
	var span4= document.getElementById("id11");
	var pass=document.getElementById("id4").value;
	var cpass=document.getElementById("id5").value;
	if(pass!=cpass){
		alert("password does not match");
		//span4.setAttribute("style","visibility:visible");
		return false;
	}
}
function emptyName(){
	var span1=document.getElementById("id7");
	var firstName= document.getElementById("id1").value;
	if(firstName=="" || firstName==null){
		span1.setAttribute("style","visibility:visible");
		return false;
	}
}
function passwordCheck(){
	var span2=document.getElementById("id9");
	var password= document.getElementById("id4").value;
	if(password.length<6){
		span2.setAttribute("style","visibility:visible");
		return false;
	}
}
function mobileCheck(){
	var span3=document.getElementById("id10");
	var mobile= document.getElementById("id6").value;
	if(mobile.length<10){
		span3.setAttribute("style","visibility:visible");
		return false;
	}
}
function checkAvailablity(){
	jQuery.ajax({
		url:"Check",
		data:'username='+$("#id3").val(),
		type:"post",
		success:function(data){
			$("#id8").html(data);
		},
		error: function(){}
	});
}
function register(){
	jQuery.ajax({
		url:"Register",
		data:{
			fname:$("#id1").val(),
			lname:$('#id2').val(),
			username:$("#id3").val(),
			password:$("#id4").val(),
			mobile:$("#id6").val(),
		},
		type:"post",
		success:function(data){
			alert(data);
		},
		error: function(){}
	});
}