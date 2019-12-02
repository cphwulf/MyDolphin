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
	public ArrayList<Member> getMembersByFilter(String field, String filter){
		ArrayList<Member> filteredmembers = new ArrayList<>();
		filteredmembers = memberMapper.getMembersFromDBLike(field, filter);
		return filteredmembers;
	}

	public int writeMemberToStorage(HashMap params) {
		int retVal = 0;
		retVal = memberMapper.writeMemberToDB(params);
		return retVal;
	}
	
}
