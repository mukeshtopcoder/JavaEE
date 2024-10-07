package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		Cookie[] cookies = req.getCookies();
		PrintWriter out = res.getWriter();
//		 Retrieve All Values
		for(int i=0;i<cookies.length;i++) {
			out.println("\n"+cookies[i].getName()+" : "+cookies[i].getValue());
		}
		int num=0;
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().equals("Addition"))
				num=Integer.parseInt( cookies[i].getValue() );
		}
		out.print("Square : "+num*num);
	}
}
