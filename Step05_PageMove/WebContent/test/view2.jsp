<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test/view2.jsp</title>
</head>
<body>
	<h3>/test/go9 요청을 받은 서블릿에서 forward 이동된 페이지 입니다.</h3>
	<%
		/*
			forward 이동 하기 전에 
				request.setAttribute("myName", xx);
			해서 담은 데이터를
				request.getAttribute("myName");
			해서 얻어낼 수 있다.
			단, 원래 type 으로 casting 해야 사용할 수 있음
		*/
		// request 에 담긴 값 얻어내기
			//원래 String type 인데, request.getAttribute 하면 Object type 으로 리턴돼서 다시 String type 으로 casting
		String myName=(String)request.getAttribute("myName");
	%>
	<p> 우리 강아지 이름은 <strong><%=myName %></strong> 이야!</p>
</body>
</html>