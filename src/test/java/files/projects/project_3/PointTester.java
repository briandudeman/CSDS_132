/**
 * this class tests the Point class
 */

package files.projects.project_3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PointTester {
    
    // the point that all of the tests uses
    private Point point = new Point(1, 1);

    /**
     * tests the getX() method
     */
    @Test
    public void testGetX() {
        assertEquals("Not getting X", 1.0, point.getX(), .000001);
    }

    /**
     * tests the getY() method
     */
    @Test
    public void testGetY() {
        assertEquals("Not getting Y", 1.0, point.getY(), .000001);
    }

    /**
     * tests the setX() method
     */
    @Test
    public void testSetX() {
        point.setX(-1000.0);
        assertEquals("Not setting X", -1000.0, point.getX(), .000001);
    }

    /**
     * tests the setY() method
     */
    @Test
    public void testSetY() {
        point.setY(-1000.0);
        assertEquals("Not setting Y", -1000.0, point.getY(), .000001);
    }

    /**
     * tests the rotateAoout() method
     */
    @Test
    public void testRotateAbout() {
        this.point = new Point(1, 0);
        point.rotateAbout(new Point(0, 0), (5*Math.PI) / 2);
        // uses assertArrayEquals to compare the x and y coordinates
        assertArrayEquals("Failed to rotate point", new double[] {0.0, 1.0},
            new double[] {point.getX(), point.getY()}, .000001);
    }

}

