/**
 * the test class for GibberishWriter, tests all of the methods except main. works in conjunction with the test.txt file
 * 
 * @author Brian LewConklin
 */

package files.projects.project_4;

import org.junit.Test;

import files.projects.project_4.GibberishWriter.ContextData;
import junit.framework.Assert;

public class GibberishWriterTester {
    
    /**
     * tests the getContextSize method
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetContextSize() {
        GibberishWriter g = new GibberishWriter(3);
        Assert.assertEquals("the context size field is not accessed", 3, g.getContextSize());

    }

    /**
     * tests the getContextData method
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetContextData() {
        GibberishWriter g = new GibberishWriter(3);
        g.addDataFile("test.txt");
        Assert.assertEquals("the context data field is not accessed", "aaaaay", g.getContextData(0).getContext().getWord(0));
    }

    /**
     * tests the addContextData method
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testAddcontextData() {
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"a", "thing", "thing", "thing", "thing", "thing"});
        GibberishWriter.Context b = new GibberishWriter.Context(new String[] {"b", "thing", "thing", "thing", "thing", "thing"});
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"c", "thing", "thing", "thing", "thing", "thing"});
        GibberishWriter.Context d = new GibberishWriter.Context(new String[] {"d", "thing", "thing", "thing", "thing", "thing"});
        LinkedList<ContextData> ll = new LinkedList<>();

        // should be in alphabetical order
        GibberishWriter.addContextData(a, ll);
        GibberishWriter.addContextData(d, ll);
        GibberishWriter.addContextData(c, ll);
        GibberishWriter.addContextData(b, ll);
        LLIterator<ContextData> lli = ll.iterator();

        // makes the expecteds in alphabetical order
        GibberishWriter.Context[] expecteds = new GibberishWriter.Context[] {a, b, c, d};
        int i = 0;
        while (lli.hasNext()) {
            Assert.assertEquals("the actual contexts dont equal the expecteds", expecteds[i], lli.next().getContext());
            i++;
        }
    
    }

    /**
     * tests the addDataFile method
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testAddDataFile() {
        GibberishWriter g = new GibberishWriter(3);
        g.addDataFile("test.txt");

        // tests the only contexts of the file
        Assert.assertTrue("the actual contexts dont equal the expecteds", g.getContextData(0).getContext().compareTo(new GibberishWriter.Context(new String[] {"aaaaay", "are", "ambling"})) == 0);
        Assert.assertTrue("the actual contexts dont equal the expecteds", g.getContextData(1).getContext().compareTo(new GibberishWriter.Context(new String[] {"are", "ambling", "articly"})) == 0);        
    }

    /**
     * tests the toLinkedList method
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testToLinkedList() {
        GibberishWriter g = new GibberishWriter(3);
        g.addDataFile("test.txt");
        LinkedList<ContextData> llContextData = g.toLinkedList();
        LLIterator<ContextData> lli = llContextData.iterator();

        int i = 0;
        while (lli.hasNext()) {
            Assert.assertEquals("the ContextDatas do not match in the correct order", g.getContextData(i).getContext(), lli.next().getContext());
            i++;
        }
        
    }

    /**
     * tests the updateContext method
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testUpdateContext() {
        String[] originalContext = new String[] {"a", "big", "round", "cow"};
        GibberishWriter.updateContext(originalContext, "whatever");
        String[] expectedContext = new String[] {"big", "round", "cow", "whatever"};
        Assert.assertEquals("the contexts do not match", new GibberishWriter.Context(expectedContext), new GibberishWriter.Context(originalContext));

    }

}
