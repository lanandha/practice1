import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class DatabaseServlet extends HttpServlet {
Connection con;
PreparedStatement st;
Statement stmt;
ResultSet rs;
public void init(ServletConfig config) throws ServletException {
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.5.73:1521:oracle","cse1515004","cse1515004");
System.out.println("Connected..");
} catch (Exception e) {
System.out.println("Error in connection.."); }}
public void doGet(HttpServletRequest req, HttpServletResponse
res) throws ServletException, IOException {
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
//Displaying records
try {
stmt = con.createStatement();
rs = stmt.executeQuery("select * from book01");
pw.println("Displaying Book Records...");
while (rs.next()) {
pw.println("<p>" + rs.getInt(1) + " " + rs.getString(2) + " "
+rs.getString(3));
}
} catch (Exception e) {
System.out.println("Error..." + e);
}
}
}