package mydolphin.Model;

/**
 *
 * @author thor
 */
public class Fee {
	
	static int JUNIORFEE = 1000;
	static int SENIORFEE = 1600;
	static int OLDBOYSFEE = 1200;
	static int PASSIVEFEE = 500;
	private int feeID;
	private int memberID;
	private int feeYear;
	private int amount;
	
	public Fee(int feeID, int memberid, int feeYear, int amount) {
		this.feeID = feeID;
		this.memberID = memberid;
		this.feeYear = feeYear;
		this.amount = amount;
	}
	public Fee(int memberid, int feeYear, int amount) {
		this.memberID = memberid;
		this.feeYear = feeYear;
		this.amount = amount;
	}
	
	public int getFeeID() {
		return feeID;
	}
	
	public void setFeeID(int feeID) {
		this.feeID = feeID;
	}
	
	public int getMemberID() {
		return memberID;
	}
	
	public void setMemberID(int memberid) {
		this.memberID = memberid;
	}
	
	public int getFeeYear() {
		return feeYear;
	}
	
	public void setFeeYear(int feeYear) {
		this.feeYear = feeYear;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Fee{" +
			"feeID=" + feeID +
			", member=" + memberID +
			", feeYear=" + feeYear +
			", amount=" + amount +
			'}';
	}
}
