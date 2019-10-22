import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)

	    		throws ServletException, IOException {
	      
	        response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("contact email is--> Servlet1" +getServletContext().getInitParameter("contactEmail"));
	        out.println("<br>");
	        out.println("contact email is--> " +getServletContext().getInitParameter("adminEmail"));

}
	 protected void doPost(HttpServletRequest request,

   	      HttpServletResponse response)

   	throws ServletException, IOException {
		 response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        out.println("contact email is--> Servlet1" +getServletContext().getInitParameter("contactEmail"));
	        out.println("<br>");
	        out.println("contact email is--> " +getServletContext().getInitParameter("adminEmail"));

	 }}
