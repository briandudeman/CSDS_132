/**
 * this class extends polygon and represents a rectangle which the class Square inherits
 * 
 * @author Brian LewConklin
 */

package projects.project_3.main;

public class Rectangle extends Polygon{
    
    // the center point of the rectangle
    private Point center;

    // the width of the rectangle as a double
    private double width;

    // the height of the rectangle as a double
    private double height;

    /**
     * the constructor, sets the center, height, and width, as well as passes the points of the rectangle to its
    * super class
    * @param center the center of the rectangle as a Point
    * @param height the height of the rectangle as a double
    * @param width the width of the rectangle as a double
    */
    public Rectangle(Point center, double height, double width) {
        super(new Point[] {new Point(center.getX() - .5*Math.abs(width), center.getY() + .5*Math.abs(height)), new Point(center.getX() + .5*Math.abs(width), center.getY() + .5*Math.abs(height)), new Point(center.getX() + .5*Math.abs(width), center.getY() - .5*Math.abs(height)), new Point(center.getX() - .5*Math.abs(width), center.getY() - .5*Math.abs(height))});
        this.center = center;
        this.width = Math.abs(width);
        this.height = Math.abs(height);
    }

    /**
     * gets the width
    * @return the width of the rectangle as a double
    */
    public double getWidth() {
        return this.width;
    }

    /**
     * sets the width
    * @param newWidth the width of the rectangle as a double
    */
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    /**
     * gets the height
    * @return the height of the rectangle as a double
    */
    public double getHeight() {
        return this.height;
    }
    
    /**
     * sets the height
    * @param newWidth the height of the rectangle as a double
    */
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }
}