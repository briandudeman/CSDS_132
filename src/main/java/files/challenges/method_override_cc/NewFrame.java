package files.challenges.method_override_cc;
import javax.swing.JFrame;


public class NewFrame extends JFrame {

    private int n;

    public int getVisibleCount() {
        return this.n;
    }

    @Override
    public void setVisible(boolean isVisible) {
        if (isVisible) {
            this.n += 1;
        }
        super.setVisible(isVisible);
    }

}
