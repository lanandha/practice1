

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Firstservle
 */
public class Firstservle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Firstservle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest req,HttpServletResponse res)
    		   throws ServletException,IOException
    		   {
    		     res.setContentType("text/html");
    		     PrintWriter pwriter=res.getWriter();
    		     String name=req.getParameter("uname");
    		     pwriter.println("User Details Page:");
    		     pwriter.println("Hello "+name);
    		     pwriter.close();
    		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		{
		     response.setContentType("text/html");
		     PrintWriter pwriter=response.getWriter();
		     String name=request.getParameter("uname");
		     pwriter.println("User Details Page:");
		     pwriter.println("Hello "+name);
		     pwriter.close();
		  }
		//doGet(request, response);
	}

}
