/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.Controller;

import java.util.ArrayList;
import mydolphin.Model.Fee;
import mydolphin.Model.Member;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class FeeHandlerTest {
	
	public FeeHandlerTest() {
	}
	
	@Before
	public void setUp() {
	}

	@Test
	public void testMembersInDept() {
		System.out.println("membersInDept");
		FeeHandler instance = new FeeHandler();
		ArrayList<Fee> expResult = null;
		ArrayList<Fee> result = instance.membersInDept();
		assertEquals(expResult, result);
	}
	
}