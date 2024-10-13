package projects.project_2;

import org.junit.Test;
import static org.junit.Assert.*;

public class HW2Test {
    
    @Test
    public void testIsAlphabeticalOrder() {
    String s1 = "";
    assertTrue("Incorrectly claims An empty string is not in alphabetical order", HW2.isAlphabeticalOrder(s1)); // test 0
    String s2 = "A";
    assertTrue("Incorrectly claims \"A\" is not in alphabetical order", HW2.isAlphabeticalOrder(s2)); // test 1
    String s3 = "ac!ffG1h";
    assertTrue("Incorrectly claims \"ac!ffG1h\" is not in alphabetical order", HW2.isAlphabeticalOrder(s3)); // test many
    String s4 = "bac!ffG1h";
    assertTrue("Incorrectly claims \"bac!ffG1h\" is in alphabetical order", !(HW2.isAlphabeticalOrder(s4))); // test first
    String s5 = "ac!nfG1h";
    assertTrue("Incorrectly claims \"ac!nfG1h\" is in alphabetical order", !(HW2.isAlphabeticalOrder(s5))); // test middle
    String s6 = "ac!nfG1ha";
    assertTrue("Incorrectly claims \"ac!nfG1ha\" is in alphabetical order", !(HW2.isAlphabeticalOrder(s6))); // test last
    }

    @Test
    public void testRemoveNChars() {
    String s1 = "";
    assertEquals("Try to remove something from nothing", "", HW2.removeNChars(s1, 10, 'X')); // test 0
    String s2 = "X";
    assertEquals("Cannot find X", "",  HW2.removeNChars(s2, 10, 'X')); // test 1
    String s3 = "ac!XXffGX1h";
    assertEquals("Removes too many or too little Xs", "ac!ffGX1h", HW2.removeNChars(s3, 2, 'X')); // test many
    String s4 = "Xac!ffG1h";
    assertEquals("Cannot find X at the beginning", "ac!ffG1h", HW2.removeNChars(s4, 10, 'X')); // test first
    String s5 = "ac!nxXxfG1h";
    assertEquals("cannot find X in the middle", "ac!nxxfG1h", HW2.removeNChars(s5, 10, 'X')); // test middle
    String s6 = "ac!nfG1haX";
    assertEquals("cannot find X at the end ", "ac!nfG1ha", HW2.removeNChars(s6, 10, 'X')); // test last
    }

    @Test
    public void testRemoveString() {
    String sr = "elle";
    String s1 = "";
    assertEquals("Try to remove something from nothing", "", HW2.removeString(s1, sr)); // test 0
    String s2 = "elle";
    assertEquals("Cannot find elle", "",  HW2.removeString(s2, sr)); // test 1
    String s3 = "pbijbellellelle";
    assertEquals("Cannot find multiples", "pbijbll", HW2.removeString(s3, sr)); // test many
    String s4 = "ellellhiom";
    assertEquals("Cannot find elle at the beginning", "llhiom", HW2.removeString(s4, sr)); // test first
    String s5 = "ehnelleege";
    assertEquals("cannot find elle in the middle", "ehnege", HW2.removeString(s5, sr)); // test middle
    String s6 = "ac!nfG1haXelle";
    assertEquals("cannot find elle at the end ", "ac!nfG1haX", HW2.removeString(s6, sr)); // test last
    }

    @Test
    public void testMoveAllXsRight() {
    char c = 'X';
    String s1 = "";
    assertEquals("Try to move something from nothing", "", HW2.moveAllXsRight(c, s1)); // test 0
    String s2 = "X";
    assertEquals("Cannot find X", "X",  HW2.moveAllXsRight(c, s2)); // test 1
    String s3 = "pbijbeXXllXellelle";
    assertEquals("Cannot find multiples", "pbijbelXXleXllelle", HW2.moveAllXsRight(c, s3)); // test many
    String s4 = "Xellellhiom";
    assertEquals("Cannot find X at the beginning", "eXllellhiom", HW2.moveAllXsRight(c, s4)); // test first
    String s5 = "ehnellXeege";
    assertEquals("cannot find X in the middle", "ehnelleXege", HW2.moveAllXsRight(c, s5)); // test middle
    String s6 = "ac!nfG1haelleX";
    assertEquals("cannot find X at the end ", "ac!nfG1haelleX", HW2.moveAllXsRight(c, s6)); // test last
    }

    @Test
    public void testMoveAllXsDown() {
    char c = 'X';
    
    char[][] board1a = {{}};
    HW2.moveAllXsDown(c, board1a);
    char[][] board1b = {{}};
    assertArrayEquals("Try to move something from nothing", board1b, board1a); // test 0
    
    char[][] board2a = {{'X'},{'d'}};
    HW2.moveAllXsDown(c, board2a);
    char[][] board2b = {{'d'}, {'X'}};
    assertArrayEquals("Cannot find X", board2b, board2a); // test 1
    
    char[][] board3a = {{'a','b','c','X'},{'d','X','e','f','X'},{'X','X','i'},{'d','j','k','l'}};
    HW2.moveAllXsDown(c, board3a);
    char[][] board3b = {{'a','b','c','f'},{'d','j','e','X','X'},{'d','X','i'},{'X','X','k','l'}};
    assertArrayEquals("Cannot find multiples", board3b, board3a); // test many
    
    char[][] board4a = {{'X','b','c','h'},{'d','y','e','f','j'},{'v','t','i'},{'p','j','k','l'}};
    HW2.moveAllXsDown(c, board4a);
    char[][] board4b = {{'d','b','c','h'},{'X','y','e','f','j'},{'v','t','i'},{'p','j','k','l'}};
    assertArrayEquals("Cannot find X at the beginning", board4b, board4a); // test first
    
    char[][] board5a = {{'a','b','c','s'},{'d','y','X','f','j'},{'v','t','i'},{'p','j','k','l'}};
    HW2.moveAllXsDown(c, board5a);
    char[][] board5b = {{'a','b','c','s'},{'d','y','i','f','j'},{'v','t','X'},{'p','j','k','l'}};
    assertArrayEquals("cannot find X in the middle", board5b, board5a); // test middle
    
    char[][] board6a = {{'a','b','c','s'},{'d','y','h','f','j'},{'v','t','i'},{'p','j','k','X'}};
    HW2.moveAllXsDown(c, board6a);
    char[][] board6b = {{'a','b','c','s'},{'d','y','h','f','j'},{'v','t','i'},{'p','j','k','X'}};
    assertArrayEquals("cannot find X at the end ", board6b, board6a); // test last
    }

    @Test
    public void testMoveXDownLeft() {
    char c = 'X';
    
    char[][] board1a = {{}};
    HW2.moveXDownLeft(c, board1a);
    char[][] board1b = {{}};
    assertArrayEquals("Try to move something from nothing", board1b, board1a); // test 0
    
    char[][] board2a = {{'a', 'X'},{'d', 'b'}};
    HW2.moveXDownLeft(c, board2a);
    char[][] board2b = {{'a', 'd'}, {'X', 'b'}};
    assertArrayEquals("Cannot find X", board2b, board2a); // test 1
    
    char[][] board3a = {{'a','b','c','X'},{'d'},{'e','f','X','h'},{'i','j','k'},{'l','m','X','o'}};
    HW2.moveXDownLeft(c, board3a);
    char[][] board3b = {{'a','b','c','f'},{'d'},{'e','i','X','h'},{'X','j','k'},{'l','m','X','o'}};
    assertArrayEquals("Cannot Pass smaller arrays", board3b, board3a); // test many
    
    char[][] board4a = {{'X','b','c','h'},{'d'},{'e','f','g','h'},{'i','j','k'},{'l','m','n','o'}};
    HW2.moveXDownLeft(c, board4a);
    char[][] board4b = {{'X','b','c','h'},{'d'},{'e','f','g','h'},{'i','j','k'},{'l','m','n','o'}};
    assertArrayEquals("Cannot find X at the beginning", board4b, board4a); // test first
    
    char[][] board5a = {{'a','b','c','h'},{'d'},{'e','f','X','h'},{'i','j','k'},{'l','m','n','o'}};
    HW2.moveXDownLeft(c, board5a);
    char[][] board5b = {{'a','b','c','h'},{'d'},{'e','f','j','h'},{'i','l','k'},{'X','m','n','o'}};
    assertArrayEquals("cannot find X in the middle", board5b, board5a); // test middle
    
    char[][] board6a = {{'a','b','c','s'},{'d','y','h','f','j'},{'v','t','X'},{'p','j','k','c'}};
    HW2.moveXDownLeft(c, board6a);
    char[][] board6b = {{'a','b','c','s'},{'d','y','h','f','j'},{'v','t','j'},{'p','X','k','c'}};
    assertArrayEquals("cannot find X at the end ", board6b, board6a); // test last
    }
}
