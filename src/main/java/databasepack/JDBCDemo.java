package databasepack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {
	public static void main(String[] args) {
		String username = "root";
		String password = "rootmysql123";
		String address = "jdbc:mysql://localhost:3306/dilipdb1";
		String  createTable = "create table QEA25QE027 (employee_id INT AUTO_INCREMENT PRIMARY KEY, employee_name VARCHAR(50), role VARCHAR(20))"
;		
		String insertData = "insert into QEA25QE027 (employee_name, role) VALUES(?, ?)";
		String getData = "select * from QEA25QE027";
		
		try {
			//make connection to mysql db
			Connection connection = DriverManager.getConnection(address, username, password);
			//create a statement
			PreparedStatement prepareSt = connection.prepareStatement(getData);
//			prepareSt.setString(1, "Naresh");
//			prepareSt.setString(2, "Tester");
			ResultSet result = prepareSt.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString("employee_name") + " " + result.getString("role"));
			}
			
			prepareSt.close();
			connection.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
