package projects.project_3.main;

public class Rectangle extends Polygon{
    
    private Point center;

    private double width;

    private double height;

    public Rectangle(Point center, double height, double width) {
        super(new Point[] {new Point(center.getX() - .5*Math.abs(width), center.getY() + .5*Math.abs(height)), new Point(center.getX() + .5*Math.abs(width), center.getY() + .5*Math.abs(height)), new Point(center.getX() + .5*Math.abs(width), center.getY() - .5*Math.abs(height)), new Point(center.getX() - .5*Math.abs(width), center.getY() - .5*Math.abs(height))});
        this.center = center;
        this.width = Math.abs(width);
        this.height = Math.abs(height);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }
}