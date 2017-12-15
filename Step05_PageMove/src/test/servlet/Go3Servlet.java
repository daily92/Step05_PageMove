package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go3")
public class Go3Servlet extends	HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/go3  요청 처리 중...");
		
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
		
		// 상대 경로
		//response.sendRedirect("test/result3.jsp");
		// 절대 경로 (ContextPath 읽어오기)
			// ContextPath 읽어오기
		String cPath= request.getContextPath();

			// 절대 경로 이동
		response.sendRedirect(cPath+"/test/result3.jsp");
		//response.sendRedirect("/Step05_PageMove/test/result3.jsp");
	}
}
