package projects.project_3.main;

import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingPad {
    
    public DrawingPad(int width, int height) {
        JFrame frame = new JFrame();
        Canvas canvas = new Canvas();
        canvas.setSize(width, height);
        canvas.setBackground(Color.WHITE);
        JPanel panel = new JPanel();
        panel.add(canvas);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
