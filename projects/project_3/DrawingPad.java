/**
* the DrawingPad class represents the canvas that the user can draw and erase on
*
* @author Brian LewConklin
*/
package projects.project_3;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class DrawingPad {
// the graphics context of the pad
private Graphics graphicsContext;
    // the canvas that we draw on
    private Canvas canvas;
    /**
    * the constructor; constructs the JFrame, canvas, panel, and configures sizes
    * @param width the width of the canvas or frame
    * @param height the height of the canvas or frame
    */
    public DrawingPad(int width, int height) {
        JFrame frame = new JFrame();
        Canvas canvas = new Canvas();
        this.canvas = canvas;
        canvas.setSize(width, height);
        canvas.setBackground(Color.WHITE);
        JPanel panel = new JPanel();
        panel.add(canvas);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    /**
    * gets the graphic context of the canvas
    * if it is null it actually calls canvas.getGraphics, if it is not null, the
    field is just returned
    * @return the graphics context of the canvas
    */
    public Graphics getGraphicsContext() {
        if (this.graphicsContext == null) {
            this.graphicsContext = canvas.getGraphics();
            if (this.graphicsContext != null) {
                this.graphicsContext.setColor(Color.BLACK);
            }
        }
        return this.graphicsContext;
    }
    /**
    * draws the shape inputted into it onto the canvas in black
    * @param shape the shape to be drawn. one of the shape classes we made. must
    have a getLines() method
    */
    public void draw(Polygon shape) {
        // for each line, draw it
        for (Line line : shape.getLines()) {
            this.getGraphicsContext().drawLine((int)line.getFirstPoint().getX(),
            (int)line.getFirstPoint().getY(), (int)line.getSecondPoint().getX(),
            (int)line.getSecondPoint().getY());
        }
    }
    /**
    * erases everything on the canvas to white
    */
    public void erase() {
        this.getGraphicsContext().setColor(Color.WHITE);
        this.getGraphicsContext().fillRect(0, 0, canvas.getWidth(),
        canvas.getHeight());
        this.getGraphicsContext().setColor(Color.BLACK);
    }
}