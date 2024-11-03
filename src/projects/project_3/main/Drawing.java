package projects.project_3.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class Drawing {
    
    private Graphics graphicsContext;

    private Canvas canvas;

    public Drawing(Canvas canvas) {
        this.canvas = canvas;
    }

    public Graphics getGraphicsContext() {
        if (this.graphicsContext == null) {
            this.graphicsContext = canvas.getGraphics();
            if (this.graphicsContext != null) {
                this.graphicsContext.setColor(Color.BLACK);
            }
        }
        return this.graphicsContext;
    }

    public void draw(Polygon shape) {
        for (Line line : shape.getLines()) {
            graphicsContext.drawLine((int)line.getFirstPoint().getX(), (int)line.getFirstPoint().getY(), (int)line.getSecondPoint().getX(), (int)line.getSecondPoint().getY());
        }
    }

    public void erase() {
        this.getGraphicsContext().setColor(Color.WHITE);
        this.getGraphicsContext().fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        this.getGraphicsContext().setColor(Color.BLACK);
    }
}
