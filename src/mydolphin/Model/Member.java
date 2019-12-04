package mydolphin.Model;
import java.time.*;
public class Member implements MemberI, Comparable<Member>{
	int memberid;
	String name;
	String email;
	int year;
	int gender;
	int debts;
	boolean active;
	boolean compete;
	
	public Member() {
		System.out.println("creating ..");
	}
	
	public Member(String name, String email, int year, int gender, boolean active) {
		this.name = name;
		this.email = email;
		this.year = year;
		this.gender = gender;
		this.active = active;
	}

	public Member(int memberid, String name, String email, int year, boolean active) {
		this.memberid = memberid;
		this.name = name;
		this.email = email;
		this.year = year;
		this.active = active;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public boolean isCompete() {
		return compete;
	}

	public void setCompete(boolean compete) {
		this.compete = compete;
	}
	
	
	public void setCompete(Boolean bool) {
		this.compete = bool;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getGender() {
		return gender;
	}
	
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public int getFee() {
		if (this.active) {
			return Fee.PASSIVEFEE;
		} else if (getAge() >= 65) {
			return Fee.OLDBOYSFEE;
		} else if (getAge() < 18) {
			return Fee.JUNIORFEE;
		} else {
			return Fee.SENIORFEE;
		}
	}
	
	@Override
	public int getAge() {
		int nowYear = Year.now().getValue();
		return year - nowYear;
	}
	
	public boolean isCompetitor() {
		return this.compete;
	}
	
	public void setId(int memberid) {
		this.memberid=memberid;
	}
	@Override
	public String toString() {
		return "Model.Member{" +
			"memberID=" + memberid +
			", name='" + name + '\'' +
			", email='" + email + '\'' +
			", birthYear=" + year +
			", isActive=" + active +
			", isCompetitive=" + compete +
			'}';
	}

	@Override
	public int compareTo(Member o) {
		int retVal = 0;
		if (this.getAge() > o.getAge()) {
			retVal = 1;
		} else if (this.getAge() < o.getAge()) {
			retVal = -1;
		} else {
			retVal = 0;
		} 
		return retVal;
	}
	
}
