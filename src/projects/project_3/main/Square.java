package projects.project_3.main;

public class Square extends Rectangle implements NGon{

    private double sideLength;
    
    public Square(Point center, double sideLength) {
        super(center, Math.abs(sideLength), Math.abs(sideLength));
    }

    @Override
    public void setWidth(double newWidth) {
        super.setWidth(newWidth);
        super.setHeight(newWidth);
    }

    @Override
    public void setHeight(double newHeight) {
        super.setWidth(newHeight);
        super.setHeight(newHeight);
    }

    @Override
    public void setSideLength(double newSideLength) {
        this.sideLength = newSideLength;
    }

    @Override
    public double getSideLength() {
        return this.getWidth();
    }

    @Override
    public int getNumSides() {
        return 4;
    }
}