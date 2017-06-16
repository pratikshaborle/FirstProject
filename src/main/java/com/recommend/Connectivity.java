package com.recommend;
import java.sql.*;  

public class Connectivity { 
public static void main(String args[]){  
try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","oracle123");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
 

//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from login");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2));  

/*
PreparedStatement pstmt=null;
Scanner sc =new Scanner(System.in);

	pstmt=con.prepareStatement("insert into signup values(?,?,?)");
	System.out.println("Enter username.: ");
	String username=sc.next();
	System.out.println("Enter Contact no: ");
	long contact=sc.nextLong();
	System.out.println("Enter password: ");
	String password=sc.next();
	
	
	pstmt.setString(1,username);
//	pstmt.setLong(2,contact);
	pstmt.setLong(2,Long.parseLong("contact"));

	pstmt.setString(3,password);
	
	pstmt.executeUpdate();
	System.out.println("Record Added");
	
	pstmt.close();
	sc.close();
 */

//step5 close the connection object  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
