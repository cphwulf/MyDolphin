package mydolphin.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	private static DBConnector instance;
	private Connection connection;
	private String url;
	private String username = "root";
	private String password = "root123";
	private String database = "runners2";
	
	private DBConnector() throws SQLException {
		url = "jdbc:mysql://localhost:3306/";
		url += database;
		url += "?serverTimezone=UTC&allowPublicKeyRetrieval=true&";
		url += "useSSL=false";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException ex) {
			System.out.println("Database Connection Creation Failed : " + ex.getMessage());
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public static DBConnector getInstance() throws SQLException {
		if (instance == null) {
			instance = new DBConnector();
		} else if (instance.getConnection().isClosed()) {
			instance = new DBConnector();
		}
		
		return instance;
	}
}