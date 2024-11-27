package files.projects.project_4;

import org.junit.Test;

import files.projects.project_4.GibberishWriter.ContextData;
import junit.framework.Assert;

public class GibberishWriterTester {
    
    @SuppressWarnings("deprecation")
    @Test
    public void testGetContextSize() {
        GibberishWriter g = new GibberishWriter(3);
        Assert.assertEquals("the context size field is not accessed", 3, g.getContextSize());

    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetContextData() {
        GibberishWriter g = new GibberishWriter(3);
        g.addDataFile("test.txt");
        Assert.assertEquals("the context data field is not accessed", "aaaaay", g.getContextData(0).getContext().getWord(0));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testAddcontextData() {
        GibberishWriter g = new GibberishWriter(3);
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"a", "thing", "thing", "thing", "thing", "thing"});
        GibberishWriter.Context b = new GibberishWriter.Context(new String[] {"b", "thing", "thing", "thing", "thing", "thing"});
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"c", "thing", "thing", "thing", "thing", "thing"});
        GibberishWriter.Context d = new GibberishWriter.Context(new String[] {"d", "thing", "thing", "thing", "thing", "thing"});
        LinkedList<ContextData> ll = new LinkedList<>();

        
        GibberishWriter.addContextData(a, ll);
        GibberishWriter.addContextData(d, ll);
        GibberishWriter.addContextData(c, ll);
        GibberishWriter.addContextData(b, ll);
        LLIterator<ContextData> lli = ll.iterator();
        GibberishWriter.Context[] expecteds = new GibberishWriter.Context[] {a, b, c, d};
        int i = 0;
        while (lli.hasNext()) {
            Assert.assertEquals("the actual contexts dont equal the expecteds", expecteds[i], lli.next().getContext());
            i++;
        }
    
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testAddDataFile() {
        GibberishWriter g = new GibberishWriter(3);
        g.addDataFile("test.txt");

        Assert.assertTrue("the actual contexts dont equal the expecteds", g.getContextData(0).getContext().compareTo(new GibberishWriter.Context(new String[] {"aaaaay", "are", "ambling"})) == 0);
        Assert.assertTrue("the actual contexts dont equal the expecteds", g.getContextData(1).getContext().compareTo(new GibberishWriter.Context(new String[] {"ambling", "are", "articly"})) == 0);        
    }

}
