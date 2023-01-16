package com.kh.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalServlet
 */
@WebServlet("/operating.do")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CalServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstNum = request.getParameter("first-num");
		String opCode = request.getParameter("op-code");
		String secondNum = request.getParameter("second-num");
		// 프론트에서 백엔드로 데이터가 넘어옴(서버로 데이터가 넘어왔음)
		int result = 0;
		// 두 개의 값을 연산한 결과값을 사용자에게 전송
		result = Integer.parseInt(firstNum) + Integer.parseInt(secondNum);
		// 스트림을 통해서 페이지를 만들어 응답함
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>계산결과</title></head>");
		out.println("<body>result : ");
		out.println("<strong>"+result+"</strong>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
