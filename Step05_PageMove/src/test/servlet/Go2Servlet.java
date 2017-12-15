package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go2")
public class Go2Servlet extends	HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("/go2  요청 처리 중...");
		
		/*
		 * 	  [ redirect 이동하라는 응답하기 ]
		 * 
		 *    - 클라이언트에게 새로운 요청을 하라고 강제하는 응답
		 */
		//응답 자체가 응답을 다시 하라고 하는 
		//'이런 경로("result2.jsp")로 요청을 다시 해' 라고 강제
		//얘도 / 로 시작하지 않으므로, 상대경로
		//원래 누르면 http://localhost:8888/Step05_PageMove/go2.jsp 여야하는데,
		//	http://localhost:8888/Step05_PageMove/result2.jsp
		response.sendRedirect("result2.jsp");
	}
}
