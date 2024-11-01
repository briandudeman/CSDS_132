package projects.project_3;

public interface gonInterface {

    default void rotate(double angle) {
        for (int i = 0; i < this.getPoints().length; i++) {
            this.getPoints()[i].rotateAbout(this.getCenter(), angle);
        }
    }

    default Line[] getLines() {
        Line[] lines = new Line[this.getPoints().length];
        for (int i = 0; i < this.getPoints().length - 1; i++) {
            lines[i] = new Line(this.getPoints()[i], this.getPoints()[i + 1]);
        }
        lines[this.getPoints().length - 1] = new Line(this.getPoints()[this.getPoints().length - 1], this.getPoints()[0]);
        return lines;
    }

    public abstract Point[] getPoints();

    default void setCenter(Point newCenter) {
        for (int i = 0; i < this.getPoints().length; i++) {
            double xDifference = this.getPoints()[i].getX() - this.getCenter().getX();
            double yDifference = this.getPoints()[i].getY() - this.getCenter().getY();

            this.getPoints()[i].setX(newCenter.getX() + xDifference);
            this.getPoints()[i].setY(newCenter.getY() + yDifference);
        }
    }

    default Point getCenter() {
        double maxX = this.getPoints()[0].getX();
        double maxY = this.getPoints()[0].getY();
    
        double minX = this.getPoints()[0].getX();
        double minY = this.getPoints()[0].getY();
        
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
