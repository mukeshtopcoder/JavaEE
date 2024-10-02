package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/square")
public class SquareServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		int num = Integer.parseInt(req.getParameter("number"));
		out.print("Addition : "+num);
		out.print("\nSquare : "+num*num);
	}
}
