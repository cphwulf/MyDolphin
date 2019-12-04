/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mydolphin.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import mydolphin.Model.Member;
import mydolphin.DataMappers.FeeMapper;
import mydolphin.Model.Fee;

/**
 *
 * @author thor
 */
public class FeeHandler {
	ArrayList<Fee> feeMembersInDept;
	TreeMap<Member,Integer> membersInDept;
	ArrayList<Fee> memberPaymentsYear;
	
	public FeeHandler() {
		
	}
	
	public ArrayList<Fee> membersInDept() {
		feeMembersInDept = new ArrayList<>();
		FeeMapper feeMapper = new FeeMapper();
		feeMembersInDept = feeMapper.getAllFees();
		return feeMembersInDept;
	}
	
	//public TreeMap<Member,Integer> getAllMembersYear(int year, MemberHandler mh) {
	public void getAllMembersYear(int year, MemberHandler mh) {
		membersInDept = new TreeMap<Member,Integer>();
		//HashMap<Member,Integer> membersInDept = new HashMap<Member,Integer>();
		memberPaymentsYear = new ArrayList<>();
		FeeMapper feeMapper = new FeeMapper();
		memberPaymentsYear = feeMapper.getAllFeesYear(year);
		
		// now loop and get member for each
		for (Fee  fee: memberPaymentsYear) {
			Member tmpMember = mh.getMembersByIdList(fee.getMemberID());
			int tmpFee = tmpMember.getFee();
			int actAmount = fee.getAmount();
			if (tmpFee < actAmount) {
				try {
				membersInDept.put(tmpMember, actAmount);
				} catch (Exception e) {
					System.out.println("Error: " + e.getCause().getCause() );
				}
				//treemap.put(counter, "year");
				System.out.println("In dept: " + tmpMember.getName() + " with "+ (tmpFee - actAmount));
			} else {
				System.out.println("Ok");
			}
		}
		//return membersInDept;
	}
	
}
