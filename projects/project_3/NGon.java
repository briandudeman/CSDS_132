package projects.project_3;

public interface NGon extends gonInterface{
    
    public double getSideLength();

    public int getNumSides();

    @Override
    default Point[] getPoints() {
        Point[] points = new Point[this.getNumSides()];
        double startY = this.getCenter().getY() - (this.getNumSides() / (2 * Math.tan(Math.PI / this.getNumSides())));
        points[0] = new Point(this.getCenter().getX() - (this.getSideLength() / 2), startY);
        points[1] = new Point(this.getCenter().getX() + (this.getSideLength() / 2), startY);
        for (int i = 2; i < points.length; i++) {
            points[i] = new Point(points[i-1].getX() + Math.cos((Math.PI * (this.getNumSides() - 2)) / this.getNumSides()), points[i-1].getY() + Math.sin((Math.PI * (this.getNumSides() - 2)) / this.getNumSides()));
        }
        return points;
    }



}