package files.projects.project_5;

import files.projects.project_3.DrawingPad;
import files.projects.project_3.EquilateralTriangle;
import files.projects.project_3.Point;
import files.projects.project_3.Rectangle;
import files.projects.project_3.Square;
import files.projects.project_3.Triangle;

public class Main {
    public static void main(String[] args) throws InterruptedException{        
        DrawingPad dp = new DrawingPad(500, 500);
        Rectangle rectangle = new Rectangle(new Point(100.0, 100.0), 5.0, 10.0);
        Rectangle rectangle1 = new Rectangle(new Point(100.0, 100.0), 5.0, 10.0);
        Square square = new Square(new Point(200.0, 200.0), 100.0);
        EquilateralTriangle eTriangle = new EquilateralTriangle(new Point(100.0, 150.0), 100.0);
        EquilateralTriangle eTriangle1 = new EquilateralTriangle(new Point(100.0, 150.0), 100.0);
        EquilateralTriangle eTriangle2 = new EquilateralTriangle(new Point(110.0, 150.0), 100.0);
        EquilateralTriangle eTriangle3 = new EquilateralTriangle(new Point(120.0, 150.0), 100.0);
        EquilateralTriangle eTriangle4 = new EquilateralTriangle(new Point(130.0, 150.0), 100.0);
        EquilateralTriangle eTriangle5 = new EquilateralTriangle(new Point(140.0, 150.0), 100.0);
        EquilateralTriangle eTriangle6 = new EquilateralTriangle(new Point(150.0, 150.0), 100.0);
        Triangle t1 = new Triangle(new Point[] {new Point(230, 260), new Point(270, 260), new Point(200, 230)});
        Triangle t2 = new Triangle(new Point[] {new Point(230, 260), new Point(270, 260), new Point(200, 230)});
        
        SnowFlakeFractal eTriangleFractal = new SnowFlakeFractal(eTriangle, 3);
        SnowFlakeFractal squareFractal = new SnowFlakeFractal(square, 3);


        //squareFractal.rotate(Math.PI / 4);
        //eTriangleFractal.rotate(Math.PI / 2);
        eTriangle.rotate(Math.PI / 2);
        //t2.rotate(Math.PI / 2);
        dp.getGraphicsContext();
        Thread.sleep(500);
        dp.draw(rectangle);
        dp.draw(rectangle1);
        dp.draw(eTriangle);
        //dp.draw(eTriangle1);
        //dp.draw(eTriangle2);
        //dp.draw(eTriangle3);
        //dp.draw(eTriangle4);
        //dp.draw(eTriangle5);
        //dp.draw(eTriangle6);
        //dp.draw(t1);
        //dp.draw(t2);
        dp.draw(eTriangleFractal);
        dp.draw(squareFractal);
    }

}
