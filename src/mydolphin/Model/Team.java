package mydolphin.Model;

import java.util.ArrayList;

public class Team {
	String teamName;
	ArrayList<Member> teamMembers;

	public Team(String name) {
		this.teamName = name;
		teamMembers = new ArrayList<>();
	}

	public String getTeamName() {
		return teamName;
	}

	public ArrayList<Member> getTeamMembers() {
		return teamMembers;
	}

	public void addMemberToTeam(Member member) {
		teamMembers.add(member);
	}
	
}
