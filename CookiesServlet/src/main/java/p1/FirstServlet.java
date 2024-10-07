package p1;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int a = Integer.parseInt( req.getParameter("num1") );
		int b = Integer.parseInt( req.getParameter("num2") );
		int c = a+b;
		Cookie cookie1 = new Cookie("Addition",c+"");
		res.addCookie(cookie1);
		res.sendRedirect("square");
	}
}
