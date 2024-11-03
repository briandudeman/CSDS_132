package projects.project_3.main;

public class Triangle extends Polygon {
    
    public Triangle(Point[] points) {
        super(points);
    }

    @Override
    public Point getCenter() {
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
