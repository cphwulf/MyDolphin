package mydolphin.DataMappers;

import mydolphin.Util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.Model.Member;

public class MemberMapper {
	
	public int writeMemberToDB(HashMap<String,String> params) {
		//{compete=true, Disciplin2=200_Fri, Disciplin1=50_Medley, year=2000, Disciplin0=100_Fri, active=true, email=r@d.dk, Name=Kurt}
		int memberid = 0;
		ArrayList<String> keys = new ArrayList<>();
		for (int i = 0; i < params.size(); i++) {
			String tmpKey = "Disciplin" + i;
			keys.add(params.get(tmpKey));
		}

		try {
			Connection conn = DBConnector.getInstance().getConnection();
			//new Member(id,name,year,active,competitor);
			// initialisere JDBC-komponenter
			ResultSet result = null;
			PreparedStatement pstmt = null;
			// Queries
			String query = "INSERT INTO members (name,email,year,active,compete,gender)";
			query += " VALUES (?,?,?,?,?,?)";
			try {
				
				pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, params.get("Name"));
				pstmt.setString(2, params.get("Email"));
				pstmt.setInt(3, Integer.parseInt(params.get("year")));
				pstmt.setBoolean(4, Boolean.parseBoolean(params.get("active")));
				pstmt.setBoolean(5, Boolean.parseBoolean(params.get("compete")));
				pstmt.setInt(6,Integer.parseInt(params.get("gender")));
				pstmt.executeUpdate();
				result = pstmt.getGeneratedKeys();
				if (result.next()) {
					memberid = result.getInt(1);
					System.out.println("Inserted member " + params.get("Name") + " id " + memberid);
				} else {
					System.out.println("No  insert");
				}
			} catch (Exception e) {
				System.out.println("Error " + e);
				
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e);
		}
		
		return memberid;
		
	}
	
	
	public ArrayList<Member> getAllMembersFromDB() throws SQLException {
		ArrayList<Member> members = null;
		// connect til DB
		Connection conn = DBConnector.getInstance().getConnection();
		// initialisere JDBC-komponenter
		ResultSet result = null;
		Statement stmt = null;
		// Queries
		String query = "SELECT * FROM members";
		stmt = conn.createStatement();
		result = stmt.executeQuery(query);
		while(result.next()) {
			System.out.println("Member: " + result.getString("Name"));
		}
		
		// lave Member-objekter
		// sætte dem i listen
		
		return members;
		
	}
	public Member getMemberFromDBbyEmail(String email) {
		Member member = null;
		Connection conn = null;
		try {
			conn = DBConnector.getInstance().getConnection();
		} catch (Exception e) {
			System.out.println("Error conn" + e);
		}
		ResultSet result = null;
		Statement stmt = null;
		// Queries
		String query = "SELECT * FROM members WHERE email = \"" + email + "\"";
		try {
			stmt = conn.createStatement();
			result = stmt.executeQuery(query);
			if (result.next()) {
				member = new Member(
					result.getString("name"),
					result.getString("email"),
					result.getInt("year"),
					result.getInt("gender"),
					result.getBoolean("active")
				);
			} else {
				throw new Exception("Medlem findes ikke");
			}
		} catch (Exception e) {
			System.out.println("Q failed " + e);
		}
		return member;
	}
	
	public ArrayList<Member>  getMembersFromDBLike(String field, String filter) {
		ArrayList<Member> members = new ArrayList<>();
		Member member = null;
		Connection conn = null;
		try {
			conn = DBConnector.getInstance().getConnection();
		} catch (Exception e) {
			System.out.println("Error conn" + e);
		}
		ResultSet result = null;
		Statement stmt = null;
		// Queries
		String query = "SELECT * FROM members WHERE " + field + " LIKE \"%" + filter + "%\"";
		System.out.println("q: " + query);
		try {
			stmt = conn.createStatement();
			result = stmt.executeQuery(query);
			while (result.next()) {
				member = new Member(
					result.getString("name"),
					result.getString("email"),
					result.getInt("year"),
					result.getInt("gender"),
					result.getBoolean("active")
				);
				members.add(member);
			}
		} catch (Exception e) {
			System.out.println("Q failed " + e);
		}
		return members;
	}
	public void writeMemberToDB(Member member) {
		try {
			Connection conn = DBConnector.getInstance().getConnection();
			//new Member(id,name,year,active,competitor);
			// initialisere JDBC-komponenter
			int id = 0;
			ResultSet result = null;
			PreparedStatement pstmt = null;
			// Queries
			String query = "INSERT INTO members (name,email,year,active,compete,gender)";
			query += " VALUES (?,?,?,?,?,?)";
			try {
				
				pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, member.getName());
				pstmt.setString(2, member.getEmail());
				pstmt.setInt(3, member.getYear());
				pstmt.setBoolean(4, member.isActive());
				pstmt.setBoolean(5, member.isCompetitor());
				pstmt.setInt(6, member.getGender());
				pstmt.executeUpdate();
				result = pstmt.getGeneratedKeys();
				if (result.next()) {
					int memberid = result.getInt(1);
					System.out.println("Inserted member " + member.getName() + " id " + memberid);
					member.setId(memberid);
				} else {
					System.out.println("No  insert");
				}
			} catch (Exception e) {
				System.out.println("Error " + e);
				
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e);
		}
		
	}
	
}
