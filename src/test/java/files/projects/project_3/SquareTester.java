/**
 * tests the Square class
 */

package files.projects.project_3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SquareTester {

    /**
     * tests the setWidth() method
     */
    @Test
    public void testSetWidth() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        square.setWidth(100.0);
        assertEquals("cannot set the correct width", 100.0, square.getWidth(), .0000001);
        assertTrue("width and height are not the same", square.getWidth() == square.getHeight());
    }

    /**
     * tests the setHeight() method
     */
    @Test
    public void testSetHeight() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        square.setHeight(100.0);
        assertEquals("cannot set the correct height", 100.0, square.getHeight(), .0000001);
        assertTrue("width and height are not the same", square.getWidth() == square.getHeight());
    }

    /**
     * tests the getSideLength() method
     */
    @Test
    public void testGetSideLength() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        assertEquals("cannot get the correct side length", 5.0, square.getSideLength(), .0000001);
    }

    /**
     * tests the setSideLength() method
     */
    @Test
    public void testSetSideLength() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        square.setSideLength(11.0);
        assertEquals("cannot set the correct side length", 11.0, square.getSideLength(), .0000001);
    }

    /**
     * tests the getNumSides() method
     */
    @Test
    public void testGetNumSides() {
        Square square = new Square(new Point(1000.0, 1000.0), 5.0);
        assertEquals("cannot get the correct number of sides", 4, square.getNumSides());
    }
}
