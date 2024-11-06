/**
 * this class represents a triangle and extends polygon
 * 
 * @author Brian LewConklin
 */

package projects.project_3.main;

public class Triangle extends Polygon {
    
    /**
     * the constructor, passes points to Polygon
     * @param points the array of points of the triangle
     */
    public Triangle(Point[] points) {
        super(points);
    }

    /**
     * gets the center of the triangle more specifically than the method it overrides in gonInterface
     * @return the Point object representing the center
     */
    @Override
    public Point getCenter() {
        // these variable just simplify the equations at the end of this method
        double x1 = this.getLines()[0].getFirstPoint().getX();
        double y1 = this.getLines()[0].getFirstPoint().getY();
        
        double x2 = this.getLines()[1].getMidPoint().getX();
        double y2 = this.getLines()[1].getMidPoint().getY();
        
        double x3 = this.getLines()[1].getFirstPoint().getX();
        double y3 = this.getLines()[1].getFirstPoint().getY();
        
        double x4 = this.getLines()[2].getMidPoint().getX();
        double y4 = this.getLines()[2].getMidPoint().getY();

        double x = ((x1*y2 - y1*x2)*(x3-x4) - (x1-x2)*(x3*y4-y3*x4))/((x1-x2)*(y3-y4)-(y1-y2)*(x3-x4));
        double y = ((x1*y2 - y1*x2)*(y3-y4) - (y1-y2)*(x3*y4-y3*x4))/((x1-x2)*(y3-y4)-(y1-y2)*(x3-x4));

        return new Point(x, y);
    }
}
