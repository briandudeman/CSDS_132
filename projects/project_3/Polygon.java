package projects.project_3;

public abstract class Polygon{

    public Point[] points;

    public Polygon(Point[] points){
        this.points = points;
    }

    public Point[] getPoints() {
        return this.points;
    }

    public Point getCenter() {
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