/**
 * this interface is for regular polygons 
 * 
 * @author Brian LewConklin
 */
package projects.project_3;

public interface NGon extends gonInterface{
    
    /**
     * abstract method to get the side length
     * @return the side length as a double
     */
    public double getSideLength();

    /**
     * abstract method to get the number of sides
     * @return the side length as an int
     */
    public int getNumSides();

    /**
     * abstract method to set the side length
     * @param newSideLength side length as a double
     */
    public void setSideLength(double newSideLength);

    /**
     * default method to get the points of the NGon
     * @return the array of points of the Ngon
     */
    @Override
    default Point[] getPoints() {
        Point[] points = new Point[this.getNumSides()]; // the points to return
        // the first 2 points are found by getting the distance to the side directly below the center point and 
        // the x coordinates of that point
        double startY = this.getCenter().getY() - (this.getNumSides() / (2 * Math.tan(Math.PI / this.getNumSides())));
        points[0] = new Point(this.getCenter().getX() - (this.getSideLength() / 2), startY);
        points[1] = new Point(this.getCenter().getX() + (this.getSideLength() / 2), startY);
        
        // use the formula provided in notes to get the points
        for (int i = 2; i < points.length; i++) {
            points[i] = new Point(points[i-1].getX() + Math.cos((Math.PI * (this.getNumSides() - 2)) / this.getNumSides()), points[i-1].getY() + Math.sin((Math.PI * (this.getNumSides() - 2)) / this.getNumSides()));
        }
        return points;
    }



}