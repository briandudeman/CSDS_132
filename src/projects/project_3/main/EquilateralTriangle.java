/**
 * represents an equilateral triangle with a given center and side length
 * 
 * @author Brian LewConklin
 */

package projects.project_3.main;

public class EquilateralTriangle extends Triangle implements NGon{
    
    // the center of the equilateral triangle
    private Point center;

    // the length of one of the sides
    private double sideLength;

    /**
     * the constructor which passes the points to the super class which is Triangle and sets the center and 
     * side lengths
     * @param center the center point of the equilateral triangle
     * @param sideLength the side length of the equilateral triangle
     */
    public EquilateralTriangle(Point center, double sideLength) {
        super(new Point[] {
            new Point(center.getX() - .5 * sideLength, center.getY() - 3 / (2 * Math.tan(Math.PI / 3))),
            new Point(center.getX() + .5 * sideLength, center.getY() - 3 / (2 * Math.tan(Math.PI / 3))),
            new Point(center.getX(), center.getY() + (Math.sqrt((Math.pow(sideLength, 2) - (Math.pow(sideLength, 2)) / 4)) -  3 / (2 * Math.tan(Math.PI / 3))))
        });

        this.center = center;
        this.sideLength = Math.abs(sideLength);
    }

    /**
     * sets the side length field
     * @param newSideLength the new side length to set
     */
    @Override
    public void setSideLength(double newSideLength) {
        this.sideLength = newSideLength;
    }

    /**
     * gets the side length field
     * @return the side length
     */
    @Override
    public double getSideLength() {
        return this.sideLength;
    }

    /**
     * gets the number of sides which is always 3
     * @return returns the number of sides which is 3
     */
    @Override
    public int getNumSides() {
        return 3;
    }
}
