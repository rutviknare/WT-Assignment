import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ebookshop
 */
@WebServlet("/ebookshop")
public class ebookshop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ebookshop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><head><title>Practical-5</title></head><body bgcolor=lightpink>");
		
		out.print("<h1 align=center>Display the Table Content</h1>");
		out.print("<table border=4 align=center widh=300pt height=60% bgcolor=lightblue >");
		out.print("<tr bgcolor=grey><th>BookId</th><th>Book Title</th><th>Book Author</th><th>Book Price</th><th>Quantity</th></tr>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
            
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/practical_5", "root", "Rutviknjr11@");  
            
			Statement stmt = con.createStatement();  
            
			ResultSet rs = stmt.executeQuery("select * from ebookshop");
            
			while(rs.next()) {
				
				out.print("<tr><td>");
				out.print(rs.getInt("book_id"));
				out.print("</td>");
				out.print("<td>");
	            out.print(rs.getString("book_title"));
	            out.print("</td>");
	            out.print("<td>");
	            out.print(rs.getString("book_author"));
	            out.print("</td>");
	            out.print("<td>");
	            out.print(rs.getString("book_price"));
	            out.print("</td>");
	            out.print("<td>");
	            out.print(rs.getInt("quantity"));
	            out.print("</td>");
	            out.print("</tr>");

	        }
			
			}catch(SQLException e) {
			out.print("sql Exception.....");
			
		}catch(Exception err) {
			out.print("exception....");
		}
		out.print("</table>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
