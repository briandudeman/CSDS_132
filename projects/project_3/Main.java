package projects.project_3;

public class Main {
    
    public static void main(String[] args) {
        DrawingPad dp = new DrawingPad(500, 500);
        Rectangle rectangle = new Rectangle(new Point(100.0, 100.0), 5.0, 10.0);
        Square square = new Square(new Point(200.0, 200.0), 10.0);
        EquilateralTriangle eTriangle = new EquilateralTriangle(new Point(10.0, 10.0), 100.0);
        dp.getGraphicsContext();
        System.out.println(dp.getGraphicsContext());
        dp.draw(eTriangle);
    }

}
