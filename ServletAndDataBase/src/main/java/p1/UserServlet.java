package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/adduser")
public class UserServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		String uname = req.getParameter("uname");
		String uadd = req.getParameter("uadd");
		String mobile = req.getParameter("mobile");
		boolean ans = DBConnect.addUser(uname, uadd, mobile);
		if(ans)
			out.print("User Added Successfully!");
		else
			out.print("User Added Failed!");
	}
}
