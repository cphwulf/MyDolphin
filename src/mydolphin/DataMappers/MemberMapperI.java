package mydolphin.DataMappers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.Model.Member;

/**
 *
 * @author thor
 */
public interface MemberMapperI {
	public int writeMemberToDB(HashMap<String,String> params) ;
	public ArrayList<Member> getAllMembersFromDBBasic() throws SQLException ;
	public ArrayList<Member> getAllMembersFromDB() throws SQLException ;
	public Member getMemberFromDBbyEmail(String email) ;
	public ArrayList<Member> getMembersFromDBLike(String field, String filter) ;
	public void writeMemberToDB(Member member) ;
	public Member  getMemberById(int id) ;
}
