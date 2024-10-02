package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int c = a+b;
		out.print("Addition : "+c);
		req.setAttribute("number", c);
		RequestDispatcher rd = req.getRequestDispatcher("square");
		rd.forward(req, res);
	}
}
