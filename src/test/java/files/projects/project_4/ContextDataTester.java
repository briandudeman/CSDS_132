package files.projects.project_4;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.junit.Test;

import files.projects.project_4.GibberishWriter.WordData;
import junit.framework.Assert;


public class ContextDataTester {
    
    /**
     * tests the getContext method of ContextData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetContext() {
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"thing1", "thing2", "thing3", "thing4", "thing5"});
        GibberishWriter.ContextData cd = new GibberishWriter.ContextData(a);
        Assert.assertEquals("not accessing the context field", a, cd.getContext());
    }

    
    /**
     * tests the numOccurences method of ContextData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testNumOccurences() {
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"thing1", "thing2", "thing3", "thing4", "thing5"});
        GibberishWriter.ContextData cd = new GibberishWriter.ContextData(a);
        Assert.assertEquals("not accessing the numOccurences field", 0, cd.numOccurences());
    }

    /**
     * tests the compareTo method of ContextData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testCompareTo() {
        GibberishWriter.Context a = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5"});
        GibberishWriter.ContextData cd = new GibberishWriter.ContextData(a);
        GibberishWriter.ContextData cd2 = new GibberishWriter.ContextData(a);
        Assert.assertEquals("compareTo is somehow incorrect", 0, cd.compareTo(cd2));
    }


    /**
     * tests the addFollowingWord of ContextData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testAddFollowingWord() {
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5", "thing6"});
        GibberishWriter.ContextData cd = new GibberishWriter.ContextData(c);
        
        cd.addFollowingWord("bling");
        cd.addFollowingWord("bling");
        cd.addFollowingWord("cling");
        cd.addFollowingWord("cling");
        cd.addFollowingWord("dling");
        cd.addFollowingWord("eling");
        
        LLIterator<WordData> lli = cd.ll.iterator();
        ArrayList<WordData> expecteds = cd.ll.toArrayList();
        int i = 0;

        // making sure the linked list has been made properly using the addFollowingWord method
        while (lli.hasNext()) {
            GibberishWriter.WordData currentNode = lli.next();
            Assert.assertEquals("the words being added by the addFollowingWord method do not match the expecteds", expecteds.get(i).getWord(), currentNode.getWord());
            Assert.assertEquals("the counts of the words being added by the addFollowingWord method do not match the expecteds", expecteds.get(i).getCount(), currentNode.getCount());
            
            i++;
        }
        
    }


    /**
     * tests the getFollowingWord method of ContextData
     */
    @SuppressWarnings("deprecation")
    @Test
    public void testGetFollowingWord() {
        GibberishWriter.Context c = new GibberishWriter.Context(new String[] {"ahing1", "thing2", "thing3", "thing4", "thing5", "thing6"});
        GibberishWriter.ContextData cd = new GibberishWriter.ContextData(c);
        
        // creating the linked list, should be alphabetical
        cd.addFollowingWord("bling");
        cd.addFollowingWord("bling");
        cd.addFollowingWord("cling");
        cd.addFollowingWord("cling");
        cd.addFollowingWord("dling");
        cd.addFollowingWord("eling");
        
        Assert.assertEquals("cant get the correct word at the beginning of the linked list", "bling", cd.getFollowingWord(1));
        Assert.assertEquals("cant get the correct word in the middle of the list", "bling", cd.getFollowingWord(2));
        Assert.assertEquals("the counts of the words being added by the addFollowingWord method do not match the expecteds", "eling", cd.getFollowingWord(6));
        

        // for making sure its the right errors
        try {
            cd.getFollowingWord(1000000);
        } catch (NoSuchElementException e) {

        } catch (Exception e) {
            Assert.fail("wrong exception >:(");
        }

        try {
            cd.getFollowingWord(0);
        } catch (NoSuchElementException e) {

        } catch (Exception e) {
            Assert.fail("wrong exception >:(");
        }

    }

}