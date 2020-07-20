<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
</head>
<body>
<center>
<h1><font color="red">注册页面</font></h1>
<form action="${pageContext.request.contextPath }/regist.action" method="post" id="form1">
	账号：<input id="username" name="username"><span id="a1"></span><br>
	密码：<input type="password" id="password" name="password"><span id="a2"></span><br>
	重新输入<input type="password" id="npassword" name="npassword"><span id="a3"></span><br>
	性别：<input type="radio" id="sex" name="sex" value="男" checked="checked">男
	<input type="radio" id="sex" name="sex" value="女" >女<br>
	年龄：<input type="text" name="age"><br>
	<input type="button" value="注册" onclick="fn1()">
</form>
</center>

<script type="text/javascript">
$("#username").blur(function() {
	var username=$(this).val();
	
	if(username.length<=0){
		$("#a1").text("用户名不能为空");
	}else {
		$.post("findByUsername.action",{username:username},function(data){
			if(data=="0"){
				$("#a1").text("用户名不能重复")
			}else {
			
				$("#a1").text("√")	
			}
		});
		
	}
})
$("#password").blur(function() {
	var password=$(this).val();
	if (password.length<=0) {
		$("#a2").text("密码不能为空");
	} else {
		$("#a2").text("√");
	}
})
$("#npassword").blur(function() {
	var npassword=$(this).val();
	var password=$("#password").val();
	if (npassword.length<=0) {
		$("#a3").text("重复密码不能为空");
	} else {
		if(npassword==password){
		$("#a3").text("√");
		}
			else {
				$("#a3").text("两次密码不一致");
			}
	}
})

function fn1() {
	var a1=$("#a1").text();
	var a2=$("#a2").text();
	var a3=$("#a3").text();
	if(a1=="√" && a2=="√" && a3=="√" ){
		$("#form1").submit();
	}else {
		alert("请重新输入")
	}
}
</script>
</body>
</html>