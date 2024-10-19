package Task9;

import java.sql.Connection;
import java.sql.DriverManager;

	public class MyDatabaseConnection {
		public static Connection getConnection() {
			try {
				String url = "jdbc:mysql://localhost:3306/testdbone";
				String userName = "root";
				String password = "asap5you";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, userName, password);
				return connection;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	     public static void main(String[] args) {
	    	 Connection connection = getConnection();
	    	 if(connection!=null) {
	    		 System.out.println("connection created");
	    	 }else {
	    		 System.out.println("connection not created");
	    	 }
	     }
	}


