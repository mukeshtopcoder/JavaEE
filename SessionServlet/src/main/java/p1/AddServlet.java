package p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int a = Integer.parseInt( req.getParameter("num1") );
		int b = Integer.parseInt( req.getParameter("num2") );
		int c = a+b;
		HttpSession session = req.getSession();
		session.setAttribute("addition",c);
		res.sendRedirect("square");
	}
}
