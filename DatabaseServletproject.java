import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class DatabaseServletproject extends HttpServlet {
Connection con;
PreparedStatement st;
Statement stmt;
ResultSet rs;
public void init(ServletConfig config) throws ServletException {
try {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("Jdbc:Odbc:vdsn2", "scott",
"tiger");
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
rs = stmt.executeQuery("select * from books");
pw.println("Displaying Book Records...");
while (rs.next()) {
pw.println("<p>" + rs.getInt(1) + " " + rs.getString(2) + " "
+rs.getString(3));
}
} catch (Exception e) {
System.out.println("Error..." + e);
} } }