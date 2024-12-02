/**
 * tests the Rectangle class as well as the methods of gonInterface
 */

package files.projects.project_3;

import java.util.Arrays;

import org.junit.Assert;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class RectangleTester {
    
    /**
     * tests the rotate() method
     */
    @Test
    public void testRotate() {
        Rectangle rectangle = new Rectangle(new Point(0.0, 0.0), 5.0, 10.0);
        Point[] previousPoints = rectangle.getPoints();
        rectangle.rotate(Math.PI * 2);
        Assert.assertArrayEquals("points not rotated fully", previousPoints, rectangle.getPoints());
    
    }

    /**
     * tests the getLines() method
     */
    @Test
    public void testGetLines() {
        Rectangle rectangle = new Rectangle(new Point(0.0, 0.0), 5.0, 10.0);
        double[][] endpoints = new double[4][4]; // the endpoints to be populated
        // gets the endpoints using the getLines() method
        for (int i = 0; i < rectangle.getLines().length; i++) {
            endpoints[i][0] = rectangle.getLines()[i].getFirstPoint().getX();
            endpoints[i][1] = rectangle.getLines()[i].getFirstPoint().getY();

            endpoints[i][2] = rectangle.getLines()[i].getSecondPoint().getX();
            endpoints[i][3] = rectangle.getLines()[i].getSecondPoint().getY();

        }
        // uses deepToString to get the actual enpoints of each and compare
        assertTrue("the array:" + Arrays.deepToString(new double[][]  {{-5.0, 2.5, 5.0, 2.5}, {5.0, 2.5, 5.0, -2.5}, {5.0, -2.5, -5.0, -2.5}, {-5.0, -2.5, -5.0, 2.5}}) + " was not equal to " + Arrays.deepToString(endpoints), 
        Arrays.deepEquals(new double[][] {{-5.0, 2.5, 5.0, 2.5}, {5.0, 2.5, 5.0, -2.5}, {5.0, -2.5, -5.0, -2.5}, {-5.0, -2.5, -5.0, 2.5}}, endpoints));
    
    }

    /**
     * tests the getPoints() method
     */
    @Test
    public void testGetPoints() {
        Rectangle rectangle = new Rectangle(new Point(0.0, 0.0), -5.0, 10.0);
        double[][] points = new double[4][2];
        // doing the same thing as the last test 
        for (int i = 0; i < rectangle.getPoints().length; i++) {
            points[i][0] = rectangle.getPoints()[i].getX();
            points[i][1] = rectangle.getPoints()[i].getY();
        }
        assertArrayEquals("the points " + Arrays.deepToString(new double[][] {{-5.0, 2.5}, {5.0, 2.5}, {5.0, -2.5}, {-5.0, -2.5}}) + "and " + Arrays.deepToString(points) + "do not match", 
        new double[][] {{-5.0, 2.5}, {5.0, 2.5}, {5.0, -2.5}, {-5.0, -2.5}}, points);
    }

    /**
     * tests the setCenter() method
     */
    @Test
    public void testSetCenter() {
        Rectangle rectangle = new Rectangle(new Point(-1000.0, -1000.0), 5.0, 10.0);
        rectangle.setCenter(new Point(0.0, 0.0));
        assertEquals("the x coordinate of the center are not correct", 0.0, rectangle.getCenter().getX(), .0000001);
        assertEquals("the y coordinate of the center are not correct", 0.0, rectangle.getCenter().getY(), .0000001);
    }

    /**
     * tests the getCenter() method
     */
    @Test
    public void testGetCenter() {
        Rectangle rectangle = new Rectangle(new Point(1000.0, 1000.0), 5.0, 10.0);
        rectangle.setCenter(new Point(0.0, 0.0));
        assertEquals("cannot get the x coordinate", 0.0, rectangle.getCenter().getX(), .0000001);
        assertEquals("cannot get the y coordinate", 0.0, rectangle.getCenter().getY(), .0000001);
    }

    /**
     * tests the getWidth() method
     */
    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(new Point(1000.0, 1000.0), 5.0, 10.0);
        assertEquals("cannot get the correct width", 10.0, rectangle.getWidth(), .0000001);
    }

    /**
     * tests the getHeight() method
     */
    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(new Point(1000.0, 1000.0), 5.0, 10.0);
        assertEquals("cannot get the correct height", 5.0, rectangle.getHeight(), .0000001);
    }
    /**
     * tests the setWidth() method
     */
    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(new Point(1000.0, 1000.0), 5.0, 10.0);
        rectangle.setWidth(100.0);
        assertEquals("cannot set the correct width", 100.0, rectangle.getWidth(), .0000001);
    }

    /**
     * tests the setHeight() method
     */
    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle(new Point(1000.0, 1000.0), 5.0, 10.0);
        rectangle.setHeight(100.0);
        assertEquals("cannot set the correct height", 100.0, rectangle.getHeight(), .0000001);
    }
}
