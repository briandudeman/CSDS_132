package files.projects.project_5;

import org.junit.Test;

import files.projects.project_3.Point;
import files.projects.project_3.Square;
import junit.framework.Assert;

public class SnowFlakeFractalTester {
    
    /**
     * tests the getBaseShape method of Fractal
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetPointsSquare() {
        Square square = new Square(new Point(1.0, 1.0), 10.0);
        SnowFlakeFractal fractal = new SnowFlakeFractal(square, 0);
        Assert.assertEquals("not accessing the baseShape field", square, fractal.getBaseShape());
    }

}
