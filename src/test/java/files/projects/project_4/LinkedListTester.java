/**
 * the test file for LinkedList. tests the toArrayList method
 * 
 * @author Brian LewConklin
 */

package files.projects.project_4;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class LinkedListTester {
    

    /**
     * tests the toArrayList method of LinkedList
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testToArrayList() {

        // initializing the linked list
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addToEnd(1);
        ll.addToEnd(2);
        ll.addToEnd(3);
        ll.addToEnd(4);
        LLIterator<Integer> lli = ll.iterator();
        ArrayList<Integer> al = ll.toArrayList();

        int i = 0;
        while (lli.hasNext()) { // while the iterator has a next node, compare the elements in the arraylist to the ones ran through the iterator
            Integer lliElement = lli.next();
            Assert.assertEquals("element: " + al.get(i) + " of the arraylist does not equal element: " + lliElement, lliElement, al.get(i));
            i += 1;
        }
    }
}
