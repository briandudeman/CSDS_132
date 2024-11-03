package projects.project_3.tests;


import org.junit.Test;
import static org.junit.Assert.*;


import projects.project_3.main.*;

public class SquareTester {

    @Test
    public void testSetWidth() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        square.setWidth(100.0);
        assertEquals("cannot set the correct width", 100.0, square.getWidth(), .0000001);
        assertTrue("width and height are not the same", square.getWidth() == square.getHeight());
    }

    @Test
    public void testSetHeight() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        square.setHeight(100.0);
        assertEquals("cannot set the correct height", 100.0, square.getHeight(), .0000001);
        assertTrue("width and height are not the same", square.getWidth() == square.getHeight());
    }

    @Test
    public void testGetSideLength() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        assertEquals("cannot get the correct side length", 5.0, square.getSideLength(), .0000001);
    }

    @Test
    public void testSetSideLength() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        square.setSideLength(11.0);
        assertEquals("cannot set the correct side length", 11.0, square.getSideLength(), .0000001);
    }

    @Test
    public void testGetNumSides() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        assertEquals("cannot get the correct number of sides", 4, square.getNumSides());
    }
}
