package Task9;

import java.sql.Connection;
import java.sql.Statement;


public class QuestionTwo {
	public static void main(String[] args) {
		Connection connection = MyDatabaseConnection.getConnection();
		try {
			Statement statement = connection.createStatement();
			String insertQuery = "create table employee(empcode int, empname varchar(255),emppage int, empsalary int)";
			 System.out.println("Table Created......");
			int executeUpdate = statement.executeUpdate(insertQuery);
			if(executeUpdate > 0) {
				System.out.println("Record Inserted Successfully");
			}else {
				System.out.println("No Record placed yet......");
			}
			 String insertQuery1 = "insert into employee value(101, 'Jenny', 25 , 10000)";
			int executeUpdate1 = statement.executeUpdate(insertQuery1);
			if(executeUpdate1 > 0) {
				System.out.println("Record 1 Inserted Successfully");
			}else {
				System.out.println("Internal Server Error");
			}
			 String insertQuery2 = "insert into employee value(102, 'Jacky', 30 , 20000)";
				int executeUpdate2 = statement.executeUpdate(insertQuery2);
				if(executeUpdate2 > 0) {
					System.out.println("Record 2 Inserted Successfully");
				}else {
					System.out.println("Internal Server Error");
				}
				 String insertQuery3 = "insert into employee value(103, 'Joe', 20 , 40000)";
					int executeUpdate3 = statement.executeUpdate(insertQuery3);
					if(executeUpdate3 > 0) {
						System.out.println("Record 3 Inserted Successfully");
					}else {
						System.out.println("Internal Server Error");
					}
					String insertQuery4 = "insert into employee value(104, 'John', 40 , 80000)";
					int executeUpdate4 = statement.executeUpdate(insertQuery4);
					if(executeUpdate4 > 0) {
						System.out.println("Record 4 Inserted Successfully");
					}else {
						System.out.println("Internal Server Error");
					}
					String insertQuery5 = "insert into employee value(105, 'Shameer', 25 , 90000)";
					int executeUpdate5 = statement.executeUpdate(insertQuery5);
					if(executeUpdate5 > 0) {
						System.out.println("Record 5 Inserted Successfully");
					}else {
						System.out.println("Internal Server Error");
					}
			statement.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}

