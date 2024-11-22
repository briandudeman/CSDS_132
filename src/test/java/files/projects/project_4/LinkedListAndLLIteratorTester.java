package files.projects.project_4;

import java.util.NoSuchElementException;

import static org.junit.Assert.fail;
import org.junit.Test;

import junit.framework.Assert;

public class LinkedListAndLLIteratorTester {
    
    @SuppressWarnings("deprecation")
    @Test
    public void testAddBefore() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addToEnd(1);
        ll.addToEnd(2);
        ll.addToEnd(3);
        ll.addToEnd(4);
        LLIterator<Integer> lli = ll.iterator();
        
        // testing when the current node is the first, ie previous is null
        try {
            lli.addBefore(11);
        } catch (NoSuchElementException e) {
            // thats what we want
        } catch (Exception e) {
            fail("caught a different error thats not right :/"); // different exception
        }

        lli.next();
        lli.addBefore(12);
        Assert.assertEquals("doesnt add before", 12, (int)ll.getFirstNode().getNext().getElement());
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void testAddAfter() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addToEnd(1);
        ll.addToEnd(2);
        ll.addToEnd(3);
        ll.addToEnd(4);
        LLIterator<Integer> lli = ll.iterator();

        // tests for beginning of list
        lli.addAfter(11);
        Assert.assertEquals("adds incorrectly to the beginning of the list", 11, (int)ll.getFirstNode().getElement());

        // tests middle of list
        lli.next();
        lli.addAfter(12);
        Assert.assertEquals("adds incorrectly to middle of list", 12, (int)ll.getFirstNode().getNext().getElement());
    
        // tests end of list for thrown error
        lli.next();
        lli.next();
        lli.next();
        try {
            lli.next();
        } catch (NoSuchElementException e) {
            // we want this to happen
        } catch (Exception e) {
            fail("caught a different error thats not right :/");
        }

        // tests adding to end of list
        lli.addAfter(13);
        Assert.assertEquals("adds incorrectly to end of list", 13, (int)lli.next());


    }

}