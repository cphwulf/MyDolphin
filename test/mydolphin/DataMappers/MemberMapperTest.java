/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.DataMappers;

import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.Model.Member;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class MemberMapperTest {
	
	public MemberMapperTest() {
	}
	
	@Before
	public void setUp() {
		//{compete=true, Disciplin2=200_Fri, Disciplin1=50_Medley, year=2000, Disciplin0=100_Fri, active=true, email=r@d.dk, Name=Kurt}
	}
	/*

	@Test
	public void testWriteMemberToDB_HashMap() {
		System.out.println("writeMemberToDB");
		HashMap<String, String> params = new HashMap<String,String>(){{
			put("Compete", "true");
			put("Active", "true");
			put("Compete", "true");
			put("Name", "Kurt");
			put("Disciplin0", "100_Fri");
			put("Disciplin1", "50_Medley");
			put("Disciplin2", "200_Fri");
			}};
		MemberMapper instance = new MemberMapper();
		int expResult = 0;
		int result = instance.writeMemberToDB(params);
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetAllMembersFromDB() throws Exception {
		System.out.println("getAllMembersFromDB");
		MemberMapper instance = new MemberMapper();
		ArrayList<Member> expResult = null;
		ArrayList<Member> result = instance.getAllMembersFromDB();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetMemberFromDBbyEmail() {
		System.out.println("getMemberFromDBbyEmail");
		String email = "";
		MemberMapper instance = new MemberMapper();
		Member expResult = null;
		Member result = instance.getMemberFromDBbyEmail(email);
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetMembersFromDBLike() {
		System.out.println("getMembersFromDBLike");
		String field = "";
		String filter = "";
		MemberMapper instance = new MemberMapper();
		ArrayList<Member> expResult = null;
		ArrayList<Member> result = instance.getMembersFromDBLike(field, filter);
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testWriteMemberToDB_Member() {
		System.out.println("writeMemberToDB");
		Member member = null;
		MemberMapper instance = new MemberMapper();
		instance.writeMemberToDB(member);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetAllMembersFromDBBasic() throws Exception {
		System.out.println("getAllMembersFromDBBasic");
		MemberMapper instance = new MemberMapper();
		ArrayList<Member> expResult = null;
		ArrayList<Member> result = instance.getAllMembersFromDBBasic();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}
*/

	@Test
	public void testGetMemberById() {
		System.out.println("getMemberById");
		int id = 94;
		MemberMapper instance = new MemberMapper();
		Member expResult = null;
		Member result = instance.getMemberById(id);
		assertEquals(expResult, result);
	}
	
}
