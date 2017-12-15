package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/go4")
public class Go4Servlet extends	HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/test/go4  요청 처리 중...");
		// 상대 경로 Redirect 이동 응답 (html 로 응답하는 게 아니라, 새로운 요청 다시 하게 하는 게 응답)
		//redirect 하면 /test/result4.jsp 로 감!
		//404로 가지 않으려면, test 폴더 안에 result4.jsp 있어야겠지?
		response.sendRedirect("result4.jsp");
	}
}
