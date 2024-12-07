package files.projects.project_5;

import files.projects.project_3.DrawingPad;
import files.projects.project_3.EquilateralTriangle;
import files.projects.project_3.Point;
import files.projects.project_3.Rectangle;
import files.projects.project_3.Square;
import files.projects.project_3.Triangle;

public class Main {
    public static void main(String[] args) {        
        DrawingPad dp = new DrawingPad(500, 500);
        Rectangle rectangle = new Rectangle(new Point(100.0, 100.0), 5.0, 10.0);
        Rectangle rectangle1 = new Rectangle(new Point(100.0, 100.0), 5.0, 10.0);
        Square square = new Square(new Point(200.0, 200.0), 10.0);
        EquilateralTriangle eTriangle = new EquilateralTriangle(new Point(100.0, 150.0), 100.0);
        EquilateralTriangle eTriangle1 = new EquilateralTriangle(new Point(100.0, 150.0), 100.0);
        Triangle t1 = new Triangle(new Point[] {new Point(230, 260), new Point(270, 260), new Point(200, 230)});
        Triangle t2 = new Triangle(new Point[] {new Point(230, 260), new Point(270, 260), new Point(200, 230)});
        
        SnowFlakeFractal eTriangleFractal = new SnowFlakeFractal(eTriangle, 1);


        rectangle.rotate(Math.PI / 2);
        eTriangle.rotate(Math.PI / 2);
        t2.rotate(Math.PI / 2);
        dp.getGraphicsContext();
        System.out.println(dp.getGraphicsContext());
        System.out.println(rectangle.getCenter().getX() + " " + rectangle.getCenter().getY());
        System.out.println(rectangle1.getCenter().getX() + " " + rectangle1.getCenter().getY());
        dp.draw(rectangle);
        dp.draw(rectangle1);
        //dp.draw(eTriangle);
        //dp.draw(eTriangle1);
        dp.draw(t1);
        dp.draw(t2);
        dp.draw(eTriangleFractal);
    }

}
