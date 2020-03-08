package Product;
import java.io.*;
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String features = request.getParameter("features");
		String count = request.getParameter("count");
		//String date = request.getParameter("date");
	//	String image = request.getParameter("img");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  System.out.println("driver loaded");
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");  
			  System.out.println("connection established");
			//step3 create the statement object  
			//Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			 PreparedStatement pstmt = con.prepareStatement("INSERT INTO PRODUCT VALUES(?,?,?,?,?,?,?)");
			System.out.println("after ps");
			 
			 pstmt.setString(1, "");
			 pstmt.setString(2, request.getParameter("name"));
			 int a=Integer.parseInt(request.getParameter("price"));
			 
			 pstmt.setInt(3, a);
			 pstmt.setString(4, request.getParameter("features"));
			 pstmt.setInt(5, Integer.parseInt(request.getParameter("count")));
			// pstmt.setDate(6, .parse(request.getParameter("date"));
			 pstmt.setString(6, "");
			 pstmt.setString(7, "");
			// InputStream in = new FileInputStream("E:\\images\\cat.jpg");
			// pstmt.setBlob(7, in);
		      //Inserting Blob type
		      //InputStream in = new FileInputStream("E:\\images\\cat.jpg");
		      //pstmt.setBlob(2, in);
		      //Executing the statement
		      pstmt.execute();
		      System.out.println("Record inserted");
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}*/
		System.out.println("before try");
		try
		{
			System.out.println("in try");
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("After class");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","password");
		 
		 System.out.println("connection established");
		 
		//Statement stmt=con.createStatement();  
		  
		 PreparedStatement ps = con.prepareStatement("insert into product values (?,?,?,?,?)");
		 System.out.println("after ps");
         ps.setInt(1, Integer.parseInt(request.getParameter("id")));
         ps.setString(2, request.getParameter("name"));
         ps.setInt(3,Integer.parseInt(request.getParameter("price")));
         ps.setString(4,request.getParameter("features"));
         ps.setInt(5, Integer.parseInt(request.getParameter("count")));
         
         
      System.out.println("before execute");
        ps.executeUpdate();
		
		System.out.println("data inserted");
		  
		con.close();  
		
		  
		}catch(Exception e)
		{ 
			System.out.println(e);
			
		}  
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
