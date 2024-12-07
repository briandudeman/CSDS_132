package files.projects.project_5;

import java.util.Arrays;

import org.junit.Test;

import files.projects.project_3.EquilateralTriangle;
import files.projects.project_3.Point;
import files.projects.project_3.Square;
import junit.framework.Assert;

public class SnowFlakeFractalTester {
    
    /**
     * tests the getPointSquare method of SnowFlakeFractal
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetPointsSquare() {
        Square square = new Square(new Point(0.0, 0.0), 5.0);
        SnowFlakeFractal fractal = new SnowFlakeFractal(square, 0);
        Assert.assertEquals("the fractal with level 0 is not the same as the base shape ", square.getPoints(), fractal.getPoints());

        fractal = new SnowFlakeFractal(square, 1);
        Assert.assertEquals("the fractal does not have the same number of points", 16, fractal.getPoints().length);
       
        for (int i = 0; i < fractal.getPoints().length; i++) {
            Assert.assertNotNull("one of the points is null", fractal.getPoints()[i]);
        }

        Point[] firstFourth = Arrays.copyOfRange(fractal.getPoints(), 0, fractal.getPoints().length / 4);
        for (int i = 0; i < fractal.getPoints().length / 4; i++) {
            firstFourth[i] = new Point(firstFourth[i].getX(), firstFourth[i].getY());
        }

        for (int i = 1; i < 4; i++) {
            fractal.rotate((Math.PI / 2));            
            for (int j = 0; j < fractal.getPoints().length / 4; j++) {
                Point[] rotatedArray = Arrays.copyOfRange(fractal.getPoints(), (fractal.getPoints().length / 4) * i, (fractal.getPoints().length / 4) * i + fractal.getPoints().length / 4);
                Assert.assertTrue("the fractal with level 1 is not symmetrical ", firstFourth[j].equals(rotatedArray[j]));
            }
        }
        
        // for level 3
        fractal = new SnowFlakeFractal(square, 3);
        Assert.assertEquals("the fractal does not have the same number of points", 256, fractal.getPoints().length);
       
        for (int i = 0; i < fractal.getPoints().length; i++) {
            Assert.assertNotNull("one of the points is null", fractal.getPoints()[i]);
        }

        firstFourth = Arrays.copyOfRange(fractal.getPoints(), 0, fractal.getPoints().length / 4);
        for (int i = 0; i < fractal.getPoints().length / 4; i++) {
            firstFourth[i] = new Point(firstFourth[i].getX(), firstFourth[i].getY());
        }

        for (int i = 1; i < 4; i++) {
            fractal.rotate((Math.PI / 2));            
            for (int j = 0; j < fractal.getPoints().length / 4; j++) {
                Point[] rotatedArray = Arrays.copyOfRange(fractal.getPoints(), (fractal.getPoints().length / 4) * i, (fractal.getPoints().length / 4) * i + fractal.getPoints().length / 4);
                Assert.assertTrue("the fractal with level 3 is not symmetrical ", firstFourth[j].equals(rotatedArray[j]));
            }
        }


    }

    /**
     * tests the getPointSquare method of SnowFlakeFractal
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetPointsETriangle() {
        EquilateralTriangle eTriangle = new EquilateralTriangle(new Point(0.0, 0.0), 5.0);
        SnowFlakeFractal fractal = new SnowFlakeFractal(eTriangle, 0);
        Assert.assertEquals("the fractal with level 0 is not the same as the base shape ", eTriangle.getPoints(), fractal.getPoints());

        fractal = new SnowFlakeFractal(eTriangle, 1);
        Assert.assertEquals("the fractal does not have the same number of points", 12, fractal.getPoints().length);
       
        for (int i = 0; i < fractal.getPoints().length; i++) {
            Assert.assertNotNull("one of the points is null", fractal.getPoints()[i]);
        }

        Point[] firstFourth = Arrays.copyOfRange(fractal.getPoints(), 0, fractal.getPoints().length / 3);
        for (int i = 0; i < fractal.getPoints().length / 3; i++) {
            firstFourth[i] = new Point(firstFourth[i].getX(), firstFourth[i].getY());
        }

        for (int i = 1; i < 3; i++) {
            fractal.rotate((Math.PI / 2));            
            for (int j = 0; j < fractal.getPoints().length / 3; j++) {
                Point[] rotatedArray = Arrays.copyOfRange(fractal.getPoints(), (fractal.getPoints().length / 3) * i, (fractal.getPoints().length / 3) * i + fractal.getPoints().length / 3);
                Assert.assertTrue("the fractal with level 1 is not symmetrical ", firstFourth[j].equals(rotatedArray[j]));
            }
        }
        
        // for level 3
        fractal = new SnowFlakeFractal(eTriangle, 3);
        Assert.assertEquals("the fractal does not have the same number of points", 256, fractal.getPoints().length);
       
        for (int i = 0; i < fractal.getPoints().length; i++) {
            Assert.assertNotNull("one of the points is null", fractal.getPoints()[i]);
        }

        firstFourth = Arrays.copyOfRange(fractal.getPoints(), 0, fractal.getPoints().length / 3);
        for (int i = 0; i < fractal.getPoints().length / 3; i++) {
            firstFourth[i] = new Point(firstFourth[i].getX(), firstFourth[i].getY());
        }

        for (int i = 1; i < 3; i++) {
            fractal.rotate((Math.PI / 2));            
            for (int j = 0; j < fractal.getPoints().length / 3; j++) {
                Point[] rotatedArray = Arrays.copyOfRange(fractal.getPoints(), (fractal.getPoints().length / 3) * i, (fractal.getPoints().length / 3) * i + fractal.getPoints().length / 3);
                Assert.assertTrue("the fractal with level 3 is not symmetrical ", firstFourth[j].equals(rotatedArray[j]));
            }
        }


    }

}
