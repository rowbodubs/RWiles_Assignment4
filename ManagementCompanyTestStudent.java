/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Management Company test
 * Due: 10/24/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
	Property sampleProperty;
	ManagementCompany mangementCo ; 
	
	@Before
	public void setUp() throws Exception {
		mangementCo= new ManagementCompany("Name", "666",3);
	}

	@After
	public void tearDown() throws Exception {
		mangementCo=null;
	}

	@Test
	public void testAddProperty() {
		sampleProperty = new Property ("1", "2", 3, "4",0,0,7,8);		 
		assertEquals(mangementCo.addProperty(sampleProperty),0,0);	//property has been successfully added to index 0
	}
	
	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property ("1", "2", 3, "4",0,0,7,8);		 
		assertEquals(mangementCo.addProperty(sampleProperty),0,0);	
		assertEquals(mangementCo.getPropertiesCount(), 1);
	}

	@Test
	public void testToString() {
		//assertEquals("12,12,6,6", mangementCo.toString());
	} ///////////
	@Test
	public void testgetName() {
		assertEquals("Name",mangementCo.getName());
	}
	@Test
	public void testgetTaxID() {
		assertEquals("666",mangementCo.getTaxID());
	}
	@Test
	public void testgetMgmFeePer() { 
		assertEquals(3,mangementCo.getMgmFeePer());
	}
	@Test
	@SuppressWarnings("deprecation")
	public void testgetProperties() { ///////////////
		
		assertEquals(,mangementCo.getProperties());
	}
	@Test
	public void testgetPlot() { ////////////////
		assertEquals(new Plot(0,0,10,10),mangementCo.getPlot());
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testgetTotalRent() { //////////////////
		assertEquals(0,mangementCo.getTotalRent());
	}
	@Test
	public void testgetHighestRentPropperty() {
		
	}
	@Test
	public void testremoveLastProperty() {
		
	}
	@Test
	public void testisPropertiesFull() {
		assertFalse(mangementCo.isPropertiesFull());
	}
	@Test
	public void testgetPropertiesCount() {
		assertEquals(0,mangementCo.getPropertiesCount());
	}
	@Test
	public void testisManagementFeeValid() {
		assertTrue(mangementCo.isManagementFeeValid());
	}
}
