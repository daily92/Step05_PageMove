<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h3>인덱스 페이지 입니다.</h3>
	
	<h4>Redirect 이동</h4>
	<ul>
		<li><a href="go1">go1</a></li>
		<li><a href="go2">go2</a></li>
		<li><a href="go3">go3</a></li>
		<li><a href="test/go4">test/go4</a></li>
		
		<li><a href="test/go5.jsp">test/go5.jsp</a></li>
		<li><a href="test/go6.jsp">test/go6.jsp</a></li>
		<li><a href="test/go7.jsp">test/go7.jsp</a></li>	
	</ul>
	
	<h3>forward 이동</h3>
	<ul>
		<li><a href="go8">go8</a></li>
		<li><a href="test/go9">test/go9</a></li>
	</ul>
</body>
</html>