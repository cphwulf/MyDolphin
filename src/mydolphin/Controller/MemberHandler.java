package mydolphin.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.DataMappers.MemberMapper;
import mydolphin.Model.Member;

public class MemberHandler {
	MemberMapper memberMapper;
	
	public MemberHandler() {
		memberMapper = new MemberMapper();
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
