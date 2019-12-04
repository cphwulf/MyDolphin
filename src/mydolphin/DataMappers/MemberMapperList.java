/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mydolphin.DataMappers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.Model.Member;

/**
 *
 * @author thor
 */
public class MemberMapperList implements MemberMapperI{
	public int writeMemberToDB(HashMap<String,String> params) {
		return 0;
	}
	public ArrayList<Member> getAllMembersFromDBBasic() throws SQLException {
		return null;
	}
	public ArrayList<Member> getAllMembersFromDB() throws SQLException {
		return null;
	}
	public Member getMemberFromDBbyEmail(String email) {
		return null;
	}
	public ArrayList<Member> getMembersFromDBLike(String field, String filter) {
		return null;
	}
	public void writeMemberToDB(Member member) {}
	public Member  getMemberById(int id) {
		return null;
	}
	
	
}
