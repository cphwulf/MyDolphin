/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.DataMappers;

import java.util.ArrayList;
import mydolphin.Model.Disciplin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class DisciplinMapperTest {
	
	public DisciplinMapperTest() {
	}
	
	@Before
	public void setUp() {
	}

	@Test
	public void testGetAllDisciplins() {
		System.out.println("getAllDisciplins");
		DisciplinMapper instance = new DisciplinMapper();
		ArrayList<Disciplin> expResult = null;
		ArrayList<Disciplin> result = instance.getAllDisciplins();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}
	
}
