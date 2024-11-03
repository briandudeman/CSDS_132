package projects.project_3.main;


public class Point {
    
    private double x;

    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void rotateAbout(Point p, double angle) {
        double xr = (this.getX() - p.getX()) * Math.cos(angle) - (this.getY() - p.getY()) * Math.sin(angle);
        double yr = (this.getX() - p.getX()) * Math.sin(angle) - (this.getY() - p.getY()) * Math.cos(angle);

        this.setX(p.getX() + xr);
        this.setY(p.getY() + yr);

    }


}
