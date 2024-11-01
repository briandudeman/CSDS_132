package projects.project_3;

public class Line implements gonInterface{
    
    public Point p1;
    public Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);

    }

    public Point getFirstPoint() {
        return this.p1;
    }

    public Point getSecondPoint() {
        return this.p2;
    }

    public void setFirstPoint(Point p) {
        this.p1 = p;
    }

    public void setSecondPoint(Point p) {
        this.p2 = p;
    }

    @Override
    public Point[] getPoints() {
        return new Point[] {this.getFirstPoint(), this.getSecondPoint()};
    }

    @Override
    public Line[] getLines() {
        return new Line[] {this};
    }

}
