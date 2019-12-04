/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.DataMappers;

import java.util.ArrayList;
import mydolphin.Model.Fee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class FeeMapperTest {
	
	public FeeMapperTest() {
	}
	
	@Before
	public void setUp() {
	}

	@Test
	public void testGetAllFeesYear() {
		System.out.println("getAllFeesYear");
		int year = 2018;
		FeeMapper instance = new FeeMapper();
		ArrayList<Fee> expResult = null;
		ArrayList<Fee> result = instance.getAllFeesYear(year);
		assertEquals(expResult, result);
	}
	
}
