/**
 * this class represents a line that uses 2 Points
 * 
 * @author Brian LewConklin
 */

package files.projects.project_3;

public class Line implements gonInterface{
    
    private Point p1; // the first point of the line
    private Point p2; // the second point of the line

    /**
     * one of the constructor of Line, it takes two Point classes
     * @param p1 the first Point
     * @param p2 the second Point
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * the second constructor of Line, it takes 4 points
     * @param x1 the x coordinate of the first point
     * @param y1 the y coordinate of the first point
     * @param x2 the x coordinate of the second point
     * @param y2 the y coordinate of the second point
     */
    public Line(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);

    }

    /**
     * gets the first Point object
     * @return the first Point object
     */
    public Point getFirstPoint() {
        return this.p1;
    }

    /**
     * gets the second Point object
     * @return the second Point object
     */
    public Point getSecondPoint() {
        return this.p2;
    }

    /**
     * sets the first Point object
     * @param p the point to set
     */
    public void setFirstPoint(Point p) {
        this.p1 = p;
    }

    /**
     * sets the second Point object
     * @param p the point to set
     */
    public void setSecondPoint(Point p) {
        this.p2 = p;
    }

    /**
     * gets the midpoint of the line
     * @return the Point that represents the mid point of the line
     */
    public Point getMidPoint() {
        return new Point(((this.getSecondPoint().getX() - this.getFirstPoint().getX()) * .5) + this.getFirstPoint().getX(), ((this.getSecondPoint().getY() - this.getFirstPoint().getY()) * .5) + this.getFirstPoint().getY());
    }

    /**
     * gets a vector representing the line, ie just the second point - the first
     * @return a list of 2 doubles, the first being the x coord and the second the y
     */
    public double[] getLineVector() {
        return new double[] {this.getSecondPoint().getX() - this.getFirstPoint().getX(), this.getSecondPoint().getY() - this.getFirstPoint().getY()};
    }

    /**
     * gets the 1/3 and 2/3 points of the line
     * @return a list of Point that represents the 1/3 and 2/3 points of the line
     */
    public Point[] getThirdsPoints() {
        double[] lineVector = this.getLineVector();
        return new Point[] {new Point(this.getFirstPoint().getX() + (lineVector[0] * (1.00 / 3.00)), this.getFirstPoint().getY() + lineVector[1] * (1.00 / 3.00)), new Point(this.getFirstPoint().getX() + (lineVector[0] * (2.0 / 3.0)), this.getFirstPoint().getY() + (lineVector[1] * (2.0 / 3.0)))};
    }

    /**
     * gets the points of the line
     * @return an array of Point objects that represents the points of the line
     */
    @Override
    public Point[] getPoints() {
        return new Point[] {this.getFirstPoint(), this.getSecondPoint()};
    }

    /**
     * gets the lines of the line
     * @return an array of Line objects filled with only this line object
     */
    @Override
    public Line[] getLines() {
        return new Line[] {this};
    }

}
