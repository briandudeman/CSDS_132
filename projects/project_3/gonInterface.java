/**
 * an interface where the highest level methods are stored. Polygon, Line, and NGon implement this interface
 * 
 * @author Brian LewConklin
 */

package projects.project_3.main;

public interface gonInterface {

    /**
     * uses the rotateAbout() method of points to rotate a shape by an angle
     * @param angle the angle in radians to rotate a shape by
     */
    default void rotate(double angle) {
        // rotating each point by the center
        for (int i = 0; i < this.getPoints().length; i++) {
            this.getPoints()[i].rotateAbout(this.getCenter(), angle);
        }
    }

    /**
     * gets the lines of the shape
     * @return returns an array of Lines with the order being the order of how the points of the class were inputted
     */
    default Line[] getLines() {
        Line[] lines = new Line[this.getPoints().length]; // the lines array to return
        // creates each line except for the last
        for (int i = 0; i < this.getPoints().length - 1; i++) {
            lines[i] = new Line(this.getPoints()[i], this.getPoints()[i + 1]);
        }
        // last line creation
        lines[this.getPoints().length - 1] = new Line(this.getPoints()[this.getPoints().length - 1], this.getPoints()[0]);
        return lines;
    }

    /**
     * abstract method for getting points, will be overrode in Polygon and NGon
     * @return a list of Point objects
     */
    public abstract Point[] getPoints();

    /**
     * sets the center of the shape by moving all of the other points
     * @param newCenter the new center of the shape
     */
    default void setCenter(Point newCenter) {
        Point oldCenter = this.getCenter(); // calling this.getCenter() while adjusting the points will change the 
        // center so it needed to be saved

        // move each point by the difference between the newCenter and oldCenter
        for (int i = 0; i < this.getPoints().length; i++) {
            double xDifference = this.getPoints()[i].getX() - oldCenter.getX(); // x difference of the centers
            double yDifference = this.getPoints()[i].getY() - oldCenter.getY(); // y difference of the centers
            
            this.getPoints()[i].setX(newCenter.getX() + xDifference);
            this.getPoints()[i].setY(newCenter.getY() + yDifference);
        }
    }

    /**
     * returns the center of the bounding rectangle of the shape
     * @return the Point class representing the center of the shape
     */
    default Point getCenter() {
        // sets the max and min to the same point
        double maxX = this.getPoints()[0].getX();
        double maxY = this.getPoints()[0].getY();
    
        double minX = this.getPoints()[0].getX();
        double minY = this.getPoints()[0].getY();
        
        // loops through the points and if they are bigger or smaller than the current max or min it sets them  
        for (int i = 1; i < this.getPoints().length; i++) {
            if (this.getPoints()[i].getX() > maxX) {
                maxY = points[i].getX();
            } else if (this.getPoints()[i].getX() < minX) {
                minY = points[i].getX();
            }
            if (this.getPoints()[i].getY() > maxY) {
                maxY = points[i].getY();
            } else if (this.getPoints()[i].getY() < minY) {
                minY = points[i].getY();
            }
        }

        return new Point((0.5 * (maxX - minX)) + minX, (0.5 * (maxY - minY)) + minY);

    }

}
