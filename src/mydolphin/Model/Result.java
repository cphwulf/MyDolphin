package mydolphin.Model;
public abstract class Result implements ResultI{
	private String date;
	private int result;
	private String eventdate;
	private SwimArt swimart;
	private SwimDistance swimdistance;
	private Member member;
	
	
	public Result(String date, SwimArt swimArt, SwimDistance swimDistance, int result) {
		this.date = date;
		this.result = result;
		this.swimart =swimArt;
		this.swimdistance =swimDistance;
	}
	
	public Result() {
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public int resToInt(String resString) {
		/*
		Tre tilfælde:
		02:04:44 blir til (2*60*100) + (4*100) + 44 = 12444
		04:44 blir
		44
		*/
		int resultTime = 0;
		String[] resArr = resString.split(":");
		try {
			int minInt = Integer.parseInt(resArr[0]);
			int secInt = Integer.parseInt(resArr[1]);
			int hundInt = Integer.parseInt(resArr[0]);
			resultTime = (minInt*60*100)+(secInt*100)+hundInt;
			
		} catch (Exception e) {
			System.out.println("Wrong format" + e);
		}
		return resultTime;
	}
	
	public String resToString(int result) {
		/*
		12444 blir til
		2: (60 * 100 da vi gemmer i hundrede-dele
		04: (resten er 100-dele sekunder så det giver 4 af dem
		44: og de sidste 100-dele
		*/
		int minutes = result / (60 * 100);
		result = result % (60 * 100);
		int seconds = result / 100;
		result = result % 100;
		int hundreds = result;
		return String.format("%02d:%02d:%02d", minutes, seconds, hundreds);
	}
}
