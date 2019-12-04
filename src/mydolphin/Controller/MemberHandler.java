package mydolphin.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.DataMappers.MemberMapper;
import mydolphin.Model.Member;

public class MemberHandler {
	MemberMapper memberMapper;
	ArrayList<Member> members;
	ArrayList<Member> basicmembers;
	
	public MemberHandler() throws SQLException {
		memberMapper = new MemberMapper();
		basicmembers = memberMapper.getAllMembersFromDBBasic();
		members = memberMapper.getAllMembersFromDB();
	}
	
	public ArrayList<Member> getAllMembers() throws SQLException{
		ArrayList<Member> members = new ArrayList<>();
		members = memberMapper.getAllMembersFromDB();
		return members;
	}
	
	public ArrayList<Member> getAllMembersBasic() throws SQLException{
		ArrayList<Member> members = new ArrayList<>();
		members = memberMapper.getAllMembersFromDB();
		return members;
	}

	public void showAllMembers() {
		for (Member member : members) {
			System.out.println(member);
		}
	}
	
	public Member getMembersById(int id){
		Member member = null;
		member = memberMapper.getMemberById(id);
		return member;
	}
	
	public Member getMembersByIdList(int id){
		Member member = null;
		for (Member member1 : basicmembers) {
			if (member1.getMemberid() == id) {
				member = member1;
				return member;
			}
		}
		return member;
	}
	
	public ArrayList<Member> getMembersByFilter(String field, String filter){
		ArrayList<Member> filteredmembers = new ArrayList<>();
		filteredmembers = memberMapper.getMembersFromDBLike(field, filter);
		return filteredmembers;
	}
	
	public int writeMemberToStorage(HashMap<String,String> params) {
		ArrayList<String> keys = new ArrayList<>();
		for (int i = 0; i < params.size(); i++) {
			String tmpKey = "Disciplin" + i;
			keys.add(params.get(tmpKey));
		}
		for (String key : keys) {
			
		}
		
		int retVal = 0;
		retVal = memberMapper.writeMemberToDB(params);
		return retVal;
	}
	
}
