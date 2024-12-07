/**
 * an abstract class representing a Fractal. it has getters/setters for each of it's subclasses
 * that include getting the baseShape and getting/setting the level of the fractal
 * 
 * @author Brian LewConklin
 */

package files.projects.project_5;

import files.projects.project_3.Polygon;

public abstract class Fractal extends Polygon{

    // the base shape of the fractal
    private Polygon baseShape;

    // the number of times the fractal repeats on itself, larger = more detail
    private int level;

    /**
     * the constructor, sets the baseShape and the level
     * @param baseShape the base shape of the fractal, a Polygon
     * @param level an int representing the level to be set
     */
    public Fractal(Polygon baseShape, int level) {
        super(baseShape.getPoints());
        this.baseShape = baseShape;
        this.level = level;
    }

    /**
     * gets the base shape
     * @return a Polygon that is the base shape used by the fractal
     */
    public Polygon getBaseShape() {
        return this.baseShape;
    }

    /**
     * gets the level field
     * @return an int held in the level field
     */
    public int getNumLevels() {
        return this.level;
    }

    /**
     * sets the level field
     * @param newLevel an int representing the level to set
     */
    public void setNumLevels(int newLevel) {
        this.level = newLevel;
    }
}
