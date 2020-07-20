<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1><font color="red">展示学生信息</font></h1>
<form action="" method="post">
	<table border="1">
		<tr>
			<td>学生姓名</td>
			<td>学生性别</td>
			<td>学生年龄</td>
			<td>学生头像</td>
			<td>学生班级</td>
			<td>学生住址</td>
			<td>操作</td>
		</tr>
		
	<c:forEach items="${list }" var="u">
		<tr>
			<td>${u.id }</td>
			<td>${u.name }</td>
			<td>${u.sex }</td>
			<td>${u.age }</td>
			<td>${u.pic }</td>
			<td>${u.dept }</td>
			<td>${u.address }</td>
			<td>
				<a href="${pageContext.request.contextPath }/del.action?id=${u.id}">删除</a>
				<a href="${pageContext.request.contextPath }/update.action?id=${u.id}">修改</a>
			</td>
		</tr>
	</c:forEach>
		
	</table>
</form>
</center>
</body>
</html>