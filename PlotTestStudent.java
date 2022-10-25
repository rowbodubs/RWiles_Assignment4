/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Plot test
 * Due: 10/24/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Rowan Wiles
*/
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022
 * 
 */
public class PlotTestStudent {
	private Plot plot1, plot5;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(4, 4, 7, 7);
		plot5 = new Plot(4, 4, 4, 4);
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot5 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot5)); // plot5 is entirely inside plot1
	}
	@Test
	public void testEncompasses() {
		assertTrue(plot1.encompasses(plot5)); // plot5 is entirely inside plot1
	}
	
	@Test
	public void testToString() {
		assertEquals("4,4,4,4",plot5.toString());	
	}
	@Test
	public void testgetX() { //return x
		assertEquals(4, plot5.getX());
	}
	@Test
	public void testgetY() { //return y
		assertEquals(4, plot5.getY());
	}
	@Test
	public void testgetDepth() { //return depth
		assertEquals(4, plot5.getDepth());
	}
	@Test
	public void testgetWidth() { //return width
		assertEquals(4, plot5.getWidth());
	}
	public void testsetX(int x1) { //set x
	}
	public void testsetY(int y1) { //set y
	}
	public void testsetWidth(int width1) { //set width
	}
	public void testsetDepth(int depth1) { //set depth
	}
}