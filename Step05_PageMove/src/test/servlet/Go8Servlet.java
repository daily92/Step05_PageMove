package test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go8")
public class Go8Servlet extends	HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/go8  요청 처리 중...");
		
		// 요청 전달자 객체 얻어오기
		//RequestDispatcher + ctrl + space
		RequestDispatcher rd= request.getRequestDispatcher("view1.jsp");
		
		// view1.jsp 페이지(서블릿) 에 응답을 위임한다.
			//요청은 이 서블릿이 받지만, 응답은 이 서블릿에서 직접 하지 않고, jsp 페이지("view1.jsp")에게 대신하게 응답을 미룬 것
			//단, 응답할 때 필요한 객체 전달해줘야 해	rd.forward(request, response);
			//그러나 .forward 는 주소창에 변화가 없어
			//=> 즉, 클라이언트는 jsp 페이지("view1.jsp") 의 존재를 알 수 없지. 마치 저 서블릿이 응답하는 것처럼 보여.
			//ex.만약 DB 에 있는 내용 가지고 응답할 때, 서블릿이 DB 에 있는 데이터 추출 등 처리("business logic") 다 해놓고, 
			//그것을 jsp 에게 넘겨주면서, "응답"은 너가 해! 클라이언트에게 응답(출력)  /분업하는 거
		rd.forward(request, response);
	}
}
