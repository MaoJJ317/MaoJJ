<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1><font color="red">登陆页面</font></h1>
<form action="${pageContext.request.contextPath}/login.action" method="post">
${msg}<br>
	用户账号：<input id="username" name="username"><br>
	用户密码：<input type="password" id="password" name="password"><br>
	<input type="submit" value="登录">
	<a href="${pageContext.request.contextPath}/toRegist.action">注册</a>
</form>
</center>
</body>
</html>