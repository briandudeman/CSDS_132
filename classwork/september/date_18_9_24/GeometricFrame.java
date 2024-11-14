package september.date_18_9_24;
import javax.swing.JFrame;

/* a class that adds geometry features to JFrame*/
public class GeometricFrame extends JFrame {

	/* a method that transposes the size of the JFrame (withds becomes the height, height becomes the width)*/
	public void transpose() {
	
		// 1. Get width
		int width = this.getWidth();

		// 2. Get height
		int height= this.getHeight();

        // 3. Set size
        this.setSize(height, width);
    }

    /* a method that scales the size of the window by a scaling factor */
    public void scale(double factor) {
        this.setSize((int)(this.getWidth() * factor), (int)(this.getWidth() * factor));

    }

    /* a method that returns true if this window is larger (by area) than the input window */
    public boolean isLargerThan(JFrame frame) {
        int frameArea = frame.getWidth() * frame.getHeight();

        int thisWindowArea = this.getWidth() * this.getHeight();

        return thisWindowArea > frameArea;
    }

    /* does this window fit inside the input window */
    public boolean fitsInside(JFrame frame) {
        return (frame.getWidth() > this.getWidth()) && (frame.getHeight() > this.getHeight());
    }

    private String originalTitle = "";

    private boolean sizeOnTitle = false;

    /*have the window display the window size on the title bar, the input is whether to show the size */
	public void displaySizeOnTitle(boolean showSize) {
        if (showSize){
            super.setTitle(this.originalTitle + " (" + this.getWidth() + " x " + this.getWidth() + ")");
        } else {
            super.setTitle(this.originalTitle);

        }
        sizeOnTitle = showSize;
    }

    /*change the inherited setTitel so that it remembers the title set as originalTitle */
    @Override
    public void setTitle(String title){
        this.originalTitle = title;
        this.displaySizeOnTitle(this.sizeOnTitle);
    }

    @Override
    public void setSize(int width, int height){
        super.setSize(width, height);
        this.displaySizeOnTitle(this.sizeOnTitle);
    }

}
