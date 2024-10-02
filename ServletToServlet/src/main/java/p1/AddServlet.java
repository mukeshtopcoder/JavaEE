package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a+b;
		out.print("Addition : "+c);
		res.sendRedirect("square?number="+c);
	}
}
