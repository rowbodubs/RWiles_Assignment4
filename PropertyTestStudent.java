/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Property test
 * Due: 10/24/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class represents GFA test cases for a Property object.
 *
 * @author Farnaz Eivazi
 * @version 7/11/2022
 */
class PropertyTestStudent {
	Property propertyOne;

	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property("name", "city", 69.42, "Wes Banco");
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("name", propertyOne.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(69.42, propertyOne.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, propertyOne.getPlot().getX());
		assertEquals(0, propertyOne.getPlot().getY());
		assertEquals(1, propertyOne.getPlot().getWidth());
		assertEquals(1, propertyOne.getPlot().getDepth());
	}

	@Test
	public void testToString() {
		assertEquals("name,city,Wes Banco,69.42",propertyOne.toString());	
	}//////////////
	@Test
	public void testgetCity() {
		assertEquals(propertyOne.getCity(),"city");
	}
	@Test
	public void testgetOwner() {
		assertEquals(propertyOne.getOwner(),"Wes Banco");
	}
}
