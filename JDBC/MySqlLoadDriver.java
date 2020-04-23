import java.sql.*;
public class MySqlLoadDriver{
	public static void main(String[] args){
	System.out.println("Copyright 2004, R.g.Baldwin");
	Connection con=null;
	try{
			//load the mysql jdbc driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("MYSQL JDBC driver loaded ok.");
	}
	catch(Exception e){
	System.out.println("exception:"+e.getMessage());
	}
	}
}