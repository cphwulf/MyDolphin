/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.Controller;

import java.util.ArrayList;
import mydolphin.Model.Member;
import mydolphin.DataMappers.FeeMapper;
import mydolphin.Model.Fee;

/**
 *
 * @author thor
 */
public class FeeHandler {
	ArrayList<Fee> feeMembersInDept;
	ArrayList<Member> membersInDept;
	ArrayList<Fee> memberPaymentsYear;

	public ArrayList<Fee> membersInDept() {
		feeMembersInDept = new ArrayList<>();
		FeeMapper feeMapper = new FeeMapper();
		feeMembersInDept = feeMapper.getAllFees();
		return feeMembersInDept;
	}

	public ArrayList<Member> getAllMembersYear(int year) {
		membersInDept = new ArrayList<>();
		memberPaymentsYear = new ArrayList<>();
		FeeMapper feeMapper = new FeeMapper();
		memberPaymentsYear = feeMapper.getAllFeesYear(year);
		// now loop and get member for each
		membersInDept = (ArrayList<Member>) memberPaymentsYear.clone();
		return membersInDept;
	}
	
}
