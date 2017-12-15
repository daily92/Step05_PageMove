<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("/test/go5.jsp 요청 처리 중...");

	// jsp 기본 객체 response 이용해서 redirect 이동 시키기
	//상대 경로 (지금 현재 위치가 test 이므로 그냥 result5.jsp 하면 됨) 
	//html 로 응답하는 게 아니고 여기서는 새로운 응답하게 하는 게 응답임!
		//redirect 하면 /test/result5.jsp 로 감!
		//404로 가지 않으려면, test 폴더 안에 result5.jsp 있어야겠지?
	response.sendRedirect("result5.jsp");
%>
