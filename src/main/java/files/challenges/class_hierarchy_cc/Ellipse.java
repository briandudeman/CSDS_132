package files.challenges.class_hierarchy_cc;

public class Ellipse {
    
    private double majorA;

    private double minorA;

    public Ellipse(double majorA, double minorA) {
        this.majorA = majorA;
        this.minorA = minorA;
    }

    public double getMajorA() {
        return this.majorA;
    }

    public double getMinorA() {
        return this.minorA;
    }

    public void setMajorA(double newMajorA) {
        this.majorA = newMajorA;
    }    
    
    public void setMinorA(double newMinorA) {
        this.minorA = newMinorA;
    }
}
