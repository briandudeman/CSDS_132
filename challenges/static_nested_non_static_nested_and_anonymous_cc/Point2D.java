package static_nested_non_static_nested_and_anonymous_cc;

import java.lang.classfile.Signature;
import java.lang.classfile.instruction.ThrowInstruction;
import java.util.Comparator;

public class Point2D {

    private double x;

    private double y;

    private static int p;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public static Comparator<Point2D> firstComparator() {
        return new Point2D.FirstPointComparator();
    }

    public static class FirstPointComparator implements Comparator<Point2D> {

        @Override
        public int compare(Point2D point1, Point2D point2) {
            if (Math.abs(point1.getX()) + Math.abs(point1.getY()) < Math.abs(point2.getX()) + Math.abs(point2.getY())) {
                return -1;
            } else if (Math.abs(point1.getX()) + Math.abs(point1.getY()) > Math.abs(point2.getX()) + Math.abs(point2.getY())) {
                return 1;
            }
            return 0;

        }
    }

    public Comparator<Point2D> secondComparator() {
        return new Point2D.SecondPointComparator();
    }

    public class SecondPointComparator implements Comparator<Point2D> {

        @Override
        public int compare(Point2D point1, Point2D point2) {
            if (Math.pow((point1.getX() - Point2D.this.getX()), 2) + Math.pow((point1.getY() - Point2D.this.getY()), 2) < Math.pow((point2.getX() - Point2D.this.getX()), 2) + Math.pow((point2.getY() - Point2D.this.getY()), 2)) {
                return -1;
            } else if (Math.pow((point1.getX() - Point2D.this.getX()), 2) + Math.pow((point1.getY() - Point2D.this.getY()), 2) > Math.pow((point2.getX() - Point2D.this.getX()), 2) + Math.pow((point2.getY() - Point2D.this.getY()), 2)) {
                return 1;
            }
            return 0;

        }
    }
    
    public static Comparator<Point2D> compareByPNorm(int p) {

        return new Comparator<Point2D>() {
            @Override
            public int compare(Point2D point1, Point2D point2) {
                if (Math.pow(Math.abs(point1.getX()), p) + Math.pow(Math.abs(point1.getY()), p) < Math.pow(Math.abs(point2.getX()), p) + Math.pow(Math.abs(point2.getY()), p)) {
                    return -1;
                } else if (Math.pow(Math.abs(point1.getX()), p) + Math.pow(Math.abs(point1.getY()), p) > Math.pow(Math.abs(point2.getX()), p) + Math.pow(Math.abs(point2.getY()), p)) {
                    return 1;
                }
                return 0;
    
            }

        };
    } 

}