package date_4_11_24;

import java.util.LinkedList;
import javax.swing.JFrame;

public class ListStuff {
    public static void displayFrame(LinkedList<JFrame> list) {
        for (JFrame j : list) {
            j.setVisible(true);
        }
    }
}