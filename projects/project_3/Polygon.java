package projects.project_3;

public abstract class Polygon implements gonInterface{

    public Point[] points;

    public Polygon(Point[] points){
        this.points = points;
    }

    @Override
    public Point[] getPoints() {
        return this.points;
    }

}