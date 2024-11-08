/**
 * this abstract class represents a polygon and is extended by rectangle and triangle
 * 
 * @author Brian LewConklin
 */

package projects.project_3;

public abstract class Polygon implements gonInterface{

    // the points of the polygon
    public Point[] points;

    /**
     * the constructor, sets the points of the polygon
     * @param points the points of the polygon to be set
     */
    public Polygon(Point[] points){
        this.points = points;
    }

    /**
     * gets the points of the polygon
     * @return an array of points representing the points of the polygon
     */
    @Override
    public Point[] getPoints() {
        return this.points;
    }

}