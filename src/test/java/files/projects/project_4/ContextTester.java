/**
 * the tester class for the nested Context class in GibberishWriter each method defines some contexts and compares them using the methods to test
 * @author Brian LewConklin
 */

package files.projects.project_4;

import org.junit.Test;

import junit.framework.Assert;


public class ContextTester {
    
    /**
     * tests the length method of Context
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testLength() {
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5", "thing6"});
        Assert.assertEquals("length returns wrong length", 6, c.length());
        
        GibberishWriter.Context b = new GibberishWriter.Context(new String[0]);
        Assert.assertEquals("length returns wrong length for an array of length 0", 0, b.length());
        
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"ahing1"});
        Assert.assertEquals("length returns wrong length for an array of length 1", 1, a.length());
    }


    /**
     * tests the getWord method of Context
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetWord() {
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5", "thing6"});
        String[] actualList = new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5", "thing6"};
        
        for (int i = 0; i < c.length(); i++) { // looping through an actual list and what its suppose to be and comparing
            Assert.assertEquals(c.getWord(i) + " returned from getWord does not equal " + actualList[i], actualList[i], c.getWord(i));
        }
        
    }

    /**
     * tests the toString method of Context
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testToString() {
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"ahing1"});
        GibberishWriter.Context b = new GibberishWriter.Context(new String[0]);
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5", "thing6"});
        GibberishWriter.Context d = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5"});

        Assert.assertEquals("cant handle context of length 1", "ahing1", a.toString());
        Assert.assertEquals("cant handle length of 0", "", b.toString());
        Assert.assertEquals("even lengths are not the same", "ahing1thing2 thing3thing4 thing5thing6", c.toString());
        Assert.assertEquals("odd lengths are not the same", "ahing1thing2 thing3thing4 thing5", d.toString());
    }


    /**
     * tests the equals method of Context
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testEquals() {
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"thing1", "thing2", "thing3", "thing4", "thing5"});
        GibberishWriter.Context b = new GibberishWriter.Context(new String[0]);
        String context = "context?";
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5"});
        GibberishWriter.Context d = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5"});

        Assert.assertEquals("thinks 2 different length contexts are equal", false, a.equals(b));
        Assert.assertEquals("thinks 2 contexts that are very much the same are not", true, c.equals(d));
        Assert.assertEquals("thinks 2 contexts that are the same length but not the same are equal", false, a.equals(d));
        Assert.assertEquals("thinks a String is equal to a Context", false, d.equals(context));
    }

    /**
     * test the compareTo method of Context
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testCompareTo() {
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"thing1", "thing2", "thing3", "thing4", "thing5"});
        GibberishWriter.Context b = new GibberishWriter.Context(new String[0]);
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"thing1", "a", "thing3", "thing4", "thing5"});
        GibberishWriter.Context d = new GibberishWriter.Context(new String[] {"thing1", "a", "thing3", "thing4", "thing5"});
        GibberishWriter.Context e = new GibberishWriter.Context(new String[] {"thing1", "thing2", "thing3", "thing4"});

        Assert.assertEquals("comparing to a context of length 0 should be positive", 1.00f, Math.signum(a.compareTo(b)));
        Assert.assertEquals("2 contexts that have the same length and elements should be equal, return 0", 0, c.compareTo(d));
        Assert.assertEquals("something farther in alphabet compared to something closer should be negative", -1.00f, Math.signum(d.compareTo(a)));
        Assert.assertEquals("a context with more elements should be greater than one with less", 1.00f, Math.signum(a.compareTo(e)));
    }
}
