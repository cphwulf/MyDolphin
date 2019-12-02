package mydolphin.DataMappers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.Util.DBConnector;

public class EmployeeMapper {
	
	public HashMap<String,String> getAllEmployees(){
		
		HashMap<String,String> employees = new HashMap<>();
		
		String sql = "select * from employee";
		try (Connection con = DBConnector.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(sql))  {
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()){
				String email = resultSet.getString("email");
				String password = resultSet.getString("password");
				employees.put(email, password);
			}
		} catch (SQLException e) {
			System.out.println("Fejl i connection til database");
			e.printStackTrace();
		}
		return employees;
	}
	
}
