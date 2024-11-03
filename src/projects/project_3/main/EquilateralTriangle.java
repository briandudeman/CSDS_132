package projects.project_3.main;

public class EquilateralTriangle extends Triangle implements NGon{
    
    private Point center;

    private double sideLength;

    public EquilateralTriangle(Point center, double sideLength) {
        super(new Point[] {
            new Point(center.getX() - .5 * sideLength, center.getY() - 3 / (2 * Math.tan(Math.PI / 3))),
            new Point(center.getX() + .5 * sideLength, center.getY() - 3 / (2 * Math.tan(Math.PI / 3))),
            new Point(center.getX(), center.getY() + (Math.sqrt((Math.pow(sideLength, 2) - (Math.pow(sideLength, 2)) / 4)) -  3 / (2 * Math.tan(Math.PI / 3))))
        });

        this.center = center;
        this.sideLength = Math.abs(sideLength);
    }

    @Override
    public void setSideLength(double newSideLength) {
        this.sideLength = newSideLength;
    }

    @Override
    public double getSideLength() {
        return this.sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }
}
