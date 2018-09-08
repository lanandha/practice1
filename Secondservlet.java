

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Secondservlet
 */
public class Secondservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Secondservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("userName");
		String address = request.getParameter("userAddress");
		out.println("<html>");
		out.println("<h1>" + "User Details" + "</h1>");
		out.println("<p>The Name you entered was: " + name + "</p>");
		out.println("<p> The Address you entered was: " + address + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String name = request.getParameter("userName");
				String address = request.getParameter("userAddress");
				out.println("<html>");
				out.println("<h1>" + "User Details" + "</h1>");
				out.println("<p>The Name you entered was: " + name + "</p>");
				out.println("<p> The Address you entered was: " + address + "</p>");
		//doGet(request, response);
	}
}

