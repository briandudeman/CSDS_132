/**
 * the tester class for the WordData nested class in GibberishWriter. tests the getCount, getWord, and incrementCount methods
 */

package files.projects.project_4;

import org.junit.Test;

import junit.framework.Assert;

public class WordDataTester {

    /**
     * tests the getWord method of WordData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetWord() {
        GibberishWriter g = new GibberishWriter(3);
        GibberishWriter.WordData w = new GibberishWriter.WordData("thing");
        Assert.assertEquals("not accessing the word field", "thing", w.getWord());
    }

    
    /**
     * tests the getCount method of WordData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetCount() {
        GibberishWriter g = new GibberishWriter(3);
        GibberishWriter.WordData w = new GibberishWriter.WordData("thing");
        Assert.assertEquals("cant get the count field", 1, w.getCount());
    }


    /**
     * tests the incrementCount method of WordData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testIncrementCount() {
        GibberishWriter g = new GibberishWriter(3);
        GibberishWriter.WordData w = new GibberishWriter.WordData("thing");
        w.incrementCount();
        Assert.assertEquals("the count is not incremented", 2, w.getCount());
    }

}
