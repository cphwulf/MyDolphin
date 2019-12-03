package mydolphin.Model;
import java.time.*;
public class Member implements MemberI{
	int id;
	String name;
	String email;
	int year;
	int gender;
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

	public Member(int id, String name, String email, int year, boolean active) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.year = year;
		this.active = active;
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
		this.id=memberid;
	}
	@Override
	public String toString() {
		return "Model.Member{" +
			"memberID=" + id +
			", name='" + name + '\'' +
			", email='" + email + '\'' +
			", birthYear=" + year +
			", isActive=" + active +
			", isCompetitive=" + compete +
			'}';
	}
	
}
