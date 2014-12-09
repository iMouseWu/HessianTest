package service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		System.out.println("调用doGet方法");
		response.setContentType("text;html;charset=utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username=" + username);
		System.out.println("password=" + password);
		System.out.println("servlet test success....");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		String filename = request.getParameter("filename");
		System.out.println(filename);
		// doGet(request, response);
	}

}
