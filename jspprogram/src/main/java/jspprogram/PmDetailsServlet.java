package jspprogram;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (loadOnStartup = 6, urlPatterns = "/click")
public class PmDetailsServlet extends HttpServlet {

	public PmDetailsServlet() {
		System.out.println("PmDetailsServlet Const");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String country = req.getParameter("country");
		String marry = req.getParameter("marry");
		String party = req.getParameter("party");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String period = req.getParameter("period");
		String time = req.getParameter("time");
		
		req.setAttribute("name", name);
		req.setAttribute("country", country);
		req.setAttribute("married", marry);
		req.setAttribute("party", party);
		req.setAttribute("age", age);
		req.setAttribute("gender", gender);
		req.setAttribute("period", period);
		req.setAttribute("time", time);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Success.jsp");
		dispatcher.forward(req, resp);
	}
	
}
