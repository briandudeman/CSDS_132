/**
 * this class represents a 2d point on a grid
 * 
 * @author Brian LewConklin
 */

package files.projects.project_3;


public class Point {
    
    // the x coordinate of the point
    private double x;

    // the y coordinate of the point
    private double y;

    /**
     * the constructor, takes an x coordinate and a y coordinate and sets the fields
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * gets the x coordinate
     * @return the x coordinate as a double
     */
    public double getX() {
        return this.x;
    }

    /**
     * gets the y coordinate
     * @return the y coordinate as a double
     */
    public double getY() {
        return this.y;
    }

    /**
     * sets the x coordinate
     * @param x the x coordinate as a double
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * sets the y coordinate
     * @param y the y coordinate as a double
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * rotates this point about an axis of another point
     * @param p the point to be rotated about
     * @param angle the angle the point should be rotated by
     */
    public void rotateAbout(Point p, double angle) {
        double xr = (this.getX() - p.getX()) * Math.cos(angle) - (this.getY() - p.getY()) * Math.sin(angle);
        double yr = (this.getX() - p.getX()) * Math.sin(angle) + (this.getY() - p.getY()) * Math.cos(angle);

        this.setX(p.getX() + xr);
        this.setY(p.getY() + yr);

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point)o;
            return ((this.getX() >= (p.getX() - .01) && (this.getX() <= (p.getX() + .01))) && (this.getY() >= (p.getY() - .01) && (this.getY() <= (p.getY() + .01))));
        }
        return false;
    }


}
