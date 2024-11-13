package static_nested_cc;

import java.util.Comparator;

public class Point2D {

    private double x;

    private double y;

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

    public static Comparator<Point2D> comparator() {
        return new Point2D.PointComparator();
    }

    public static class PointComparator implements Comparator<Point2D> {

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


}