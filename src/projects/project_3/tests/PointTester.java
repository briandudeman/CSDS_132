package projects.project_3.tests;



import org.junit.Test;
import static org.junit.Assert.*;
import projects.project_3.main.Point;

public class PointTester {
    
    private Point point = new Point(1, 1);

    @Test
    public void testGetX() {
        assertEquals("Not getting X", 1.0, point.getX(), .000001);
    }

    @Test
    public void testGetY() {
        assertEquals("Not getting Y", 1.0, point.getY(), .000001);
    }

    @Test
    public void testSetX() {
        point.setX(-1000.0);
        assertEquals("Not setting X", -1000.0, point.getX(), .000001);
    }

    @Test
    public void testSetY() {
        point.setY(-1000.0);
        assertEquals("Not setting Y", -1000.0, point.getY(), .000001);
    }

    @Test
    public void testRotateAbout() {
        this.point = new Point(1, 0);
        point.rotateAbout(new Point(0, 0), (5*Math.PI) / 2);
        assertArrayEquals("Failed to rotate point", new double[] {0.0, 1.0},
            new double[] {point.getX(), point.getY()}, .000001);
    }

}

