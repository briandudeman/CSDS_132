package files.projects.project_5;

import files.projects.project_3.Line;
import files.projects.project_3.Point;
import files.projects.project_3.Polygon;

public class SnowFlakeFractal extends Fractal{
    
    public SnowFlakeFractal(Polygon baseShape, int level) {
        super(baseShape, level);
    }

    @Override
    public Point[] getPoints() {
        Point[] pastPoints = super.getBaseShape().getPoints();
        Point[] currentPoints = null;
        if (this.getNumLevels() == 0) {
            currentPoints = pastPoints;
        } else {
            for (int i = 0; i < this.getNumLevels(); i++) {
                currentPoints = new Point[pastPoints.length * 4];
                for (int j = 0; j < pastPoints.length; j++) {
                    Line currentLine;
                    if (j == pastPoints.length - 1) {
                        currentLine = new Line(pastPoints[j], pastPoints[0]);
                    } else {
                        currentLine = new Line(pastPoints[j], pastPoints[j + 1]);
                    }
                    currentPoints[0 + (4 * j)] = pastPoints[j];
                    currentPoints[1 + (4 * j)] = currentLine.getThirdsPoints()[0];
                    currentPoints[2 + (4 * j)] = currentLine.getThirdsPoints()[1];
                    currentPoints[2 + (4 * j)].rotateAbout(currentLine.getThirdsPoints()[0], (-Math.PI / 3));
                    currentPoints[3 + (4 * j)] = currentLine.getThirdsPoints()[1];
                }

                pastPoints = currentPoints;
            }
        }

        return currentPoints;
    }

}
