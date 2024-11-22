/**
 * this class tests EquilateralTriangle
 * 
 * @author Brian LewConklin
 */

package files.projects.project_3.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import files.projects.project_3.main.EquilateralTriangle;
import files.projects.project_3.main.Point;
 

 
 public class EquilateralTriangleTester {
     
     /**
      * tests the getSideLength() method
      */
     @Test
     public void testGetSideLength() {
         EquilateralTriangle eTriangle = new EquilateralTriangle(new Point(0.0, 0.0), 1);
         assertEquals("cannot get the correct side length", 1.0, eTriangle.getSideLength(), .0000001);
     }
 
     /**
      * tests the setSideLength() method
      */
     @Test
     public void testSetSideLength() {
         EquilateralTriangle eTriangle = new EquilateralTriangle(new Point(0.0, 0.0), 1);
         eTriangle.setSideLength(11.0);
         assertEquals("cannot set the correct side length", 11.0, eTriangle.getSideLength(), .0000001);
     }
 
     /**
      * tests the testGetNumSides() method
      */
     @Test
     public void testGetNumSides() {
         EquilateralTriangle eTriangle = new EquilateralTriangle(new Point(0.0, 0.0), 1);
         assertEquals("cannot get the correct number of sides", 3, eTriangle.getNumSides());
     }
 }
 