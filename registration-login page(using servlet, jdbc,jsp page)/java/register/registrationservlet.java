package register;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrationservlet
 */
@WebServlet("/registrationservlet")
public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String uname=request.getParameter("name");	
	String uemail=request.getParameter("email");	
	String upwd=request.getParameter("password");	
	String umobile=request.getParameter("contact");	
	RequestDispatcher rd=null;
	
	try {
		
		 String url = "jdbc:mysql://localhost:3306/java?useSSL=true";
 		 String user1 = "root";
 		 	String pass1 = "root";
 		 	Connection 		con=DriverManager.getConnection(url,user1,pass1);
 		 	String sql = "INSERT INTO users (uname,upwd, uemail,umobile)VALUES (?,?,?,?)";
 		 	
 		 	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1,uname);
	ps.setString(2, upwd);
	ps.setString(3, uemail);
	ps.setString(4, umobile);
	int rowCount =ps.executeUpdate();
	rd=request.getRequestDispatcher("register.jsp");
	if(rowCount>0) {
		request.setAttribute("status", "success");
	}else {
		request.setAttribute("status", "fail");
	}
	rd.forward(request, response);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}
