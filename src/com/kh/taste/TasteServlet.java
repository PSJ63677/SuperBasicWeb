package com.kh.taste;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TasteServlet
 */
// front 폼태그 액션에 적힌 값
@WebServlet("/tasteResult.do")
public class TasteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TasteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // front 폼태그 메소드에 get으로 적어서 doGet동작함
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전송버튼 누르면 동작하는 영역
		// 서블릿은 request를 이용해서 front 값을 모두 받아올 것임
		String userName = request.getParameter("person-name");	// form input[name=person-name]
		String userColor = request.getParameter("color");	// form input[name=color]
		String userPet = request.getParameter("pet");	// form select[name=pet]
		String [] userFoods = request.getParameterValues("food");	// form input[name=food]
		
		request.setAttribute("name", userName);
		request.setAttribute("color", userColor);
		request.setAttribute("pet", userPet);
		request.setAttribute("foods", userFoods);
		
		request.getRequestDispatcher("/taste/tasteResult.jsp").forward(request, response);
	}
	
}