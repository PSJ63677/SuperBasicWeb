package com.kh.checkbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBoxServlet
 */
@WebServlet("/showResult.do")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String [] values = request.getParameterValues("place");
		request.setAttribute("places", values);
		RequestDispatcher view = request.getRequestDispatcher("/checkbox/checkResult.jsp");
		view.forward(request, response);

//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.println("<html><head><title>관광지 선택 결과</title></head>");
//		out.println("<body>");
//		for(String value : values) {
//			out.println(value + ", ");
//		}
//		out.println("</body></html>");
	}

}
