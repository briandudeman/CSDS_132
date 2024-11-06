/**
 * this class represents a square with a center and side length. it extends rectangle and implements NGon
 * 
 * @author Brian LewConklin
 */

 package projects.project_3.main;

 public class Square extends Rectangle implements NGon{
 
     // the side length of the square
     private double sideLength;
     
     /**
      * the constructor, passes the center and side length to its super class rectangle, with the side length being 
      * both the height and width of the rectangle
      * @param center the center of the square
      * @param sideLength the side length of the square
      */
     public Square(Point center, double sideLength) {
         super(center, Math.abs(sideLength), Math.abs(sideLength));
     }
 
     /**
      * sets the width as well as the height of the super to be the same thing
      * @param newWidth the new width and height
      */
     @Override
     public void setWidth(double newWidth) {
         super.setWidth(newWidth);
         super.setHeight(newWidth);
     }
 
     /**
      * sets the width as well as the height of the super to be the same thing
      * @param newWidth the new width and height
      */
     @Override
     public void setHeight(double newHeight) {
         super.setWidth(newHeight);
         super.setHeight(newHeight);
     }
 
     /**
      * sets the side length of the square
      * @param newSideLength the new side length of the square
      */
     @Override
     public void setSideLength(double newSideLength) {
         this.sideLength = newSideLength;
     }
 
     /**
      * gets side length of the square
      * @return the side length of the square as a double
      */
     @Override
     public double getSideLength() {
         return this.getWidth();
     }
 
     /**
      * gets the number of sides, so 4
      * @return the number of sides so 4 as an int
      */
     @Override
     public int getNumSides() {
         return 4;
     }
 }