package register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String uemail=request.getParameter("email");
	String upwd=request.getParameter("password");

	
	
	try {
		
		 String url = "jdbc:mysql://localhost:3306/java";
 		 String user1 = "root";
 		 	String pass1 = "root";
 		 	Connection 	con=DriverManager.getConnection(url,user1,pass1);
String sql = "select * from users where uemail=? and upwd=?";
 		 	
 		 	PreparedStatement ps = con.prepareStatement(sql);
 		 	ps.setString(1,uemail);
 			ps.setString(2, upwd);
 		ResultSet rs =ps.executeQuery();
 			if(rs.next())
 			{
 				
 				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
 			 rd.forward(request, response);
 			}else {
 				
 				RequestDispatcher rd1=request.getRequestDispatcher("login.jsp");
 				
 				 rd1.forward(request, response);
 				
 			}
 			
	}catch(Exception e) {
		e.printStackTrace();
	}
	}

}
