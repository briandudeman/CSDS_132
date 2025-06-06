/**
 * tests the Triangle class
 */

package files.projects.project_3;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTester {
    
    /**
     * tests the getCenter() method
     */
    @Test
    public void testGetCenter() {
        Triangle triangle = new Triangle(new Point[] {new Point(-1.0, 0.0), new Point(1.0, 0.0), new Point(0.0, 1.0)});
        Assert.assertEquals("the x coordinate of the center are not correct", 0.0, triangle.getCenter().getX(), .0000001);
        Assert.assertEquals("the y coordinate of the center are not correct", 0.33333333333, triangle.getCenter().getY(), .0000001);
    }
}
