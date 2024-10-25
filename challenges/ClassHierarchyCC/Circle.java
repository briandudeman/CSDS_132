package challenges.ClassHierarchyCC;

public class Circle extends Ellipse {
    
    private double radius;

    public Circle(double majorA, double radius) {
        super(majorA, majorA);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    @Override
    public void setMajorA(double newMajorA) {
        super.setMajorA(newMajorA);
        super.setMinorA(newMajorA);
    }  
    
    @Override
    public void setMinorA(double newMinorA) {
        this.setMajorA(newMinorA);
    } 
}
