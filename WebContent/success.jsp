<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  	<%
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
   	<base href="<%=basePath%>"> 

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>id</th>
		<th>name</th>
		<th>age</th>
		<th>pwd</th>
	</tr>
	<tr>
		<td>${user.id}</td>
		<td>${user.name }</td>
		<td>${user.age }</td>
		<td>${user.pwd }</td>
	</tr>
</table>
</body>
</html>