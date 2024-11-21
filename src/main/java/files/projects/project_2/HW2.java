package files.projects.project_2;
// Brian LewConklin. This class contains the methods I was instructed to create,
// Including Methods that change aspects about strings and arrays


public class HW2 {

    //This method checks if a string is in alphabetical order
    public static boolean isAlphabeticalOrder(String s) {
        //The Character before this one
        int lastChar = 0;
        //The target character
        char thisChar = 'a';
        //Loops through string S and checks if the character is a letter, if it is change it to lower case If it is change it to lower case and compare it to the previous character
        for (int i = 0; i < s.length(); i++) {
            thisChar = s.charAt(i);
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                thisChar = (char)(s.charAt(i) - 'A' + 'a');
            }
            if (((thisChar <= 'z') && (thisChar >= 'a')) && ((lastChar <= 'z') && (lastChar >= 'a'))) {
                if (thisChar < lastChar){
                    return false;
                }
            }
            lastChar = thisChar;
        }
        return true;
    }

    //This message removes N characters from the specified string
    public static String removeNChars(String s, int n, char c) {
        //String builder for appending
        StringBuilder sb = new StringBuilder();

        //A running tally of the number of characters that have been removed
        int tally = 0;

        //Loops through S and if the character is not equal to C, Or the character is equal to C and the tally is greater than the number, append the character
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c || (s.charAt(i) == c && tally >= n)) {
                sb.append(s.charAt(i));
            } else {
                tally++;
            }
        }

        return sb.toString();
    }

    //This method removes the substring from the larger string S1
    public static String removeString(String s1, String s2) {
        //String builder for Appending
        StringBuilder sb = new StringBuilder();


        int i = 0;

        //Loops through S and for each character checks the Next characters to see if this is the substring
        while (i < s1.length()) {
            //Denote if the substring start at this index
            boolean s2Here = true;
            if (i + s2.length() > s1.length()) {
                s2Here = false;
            } else {
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) != s1.charAt(i + j)){
                        s2Here = false;
                    }
                }
            }

            //Skipping over the word if it is the substring
            if (s2Here == true) {
                i += s2.length();
            } else {
                //Regular incrementation
                sb.append(s1.charAt(i));
                i++;
            }

        }
        return sb.toString();

    }

    //After I did method 5I realized I could probably do this one the same way, But with a broken arm it's a bit of a pain to type
    //This This method moves all characters c to the right in the string
    public static String moveAllXsRight(char c, String s) {
        //String builder for Appending
        StringBuilder sb = new StringBuilder();

        int i = 0;
        //The count of how many XS there are back-to-back
        int count = 0;
        //Loops through S And finds where's substrings of XS start,Count the number of XS and after appending the character after that string of XS it appends the number of XS
        while (i < s.length()) {
            //Whether or not the last character was an X
            boolean islastCharacterX = false;
            if (s.charAt(i) != c) {
                if (i != 0 && s.charAt(i - 1) == c) {
                    islastCharacterX = true;                
                }
                sb.append(s.charAt(i));
            } else {
                //If current character is an xhey Cortana
                count++;
                islastCharacterX = false;
            }
            //If coming off of a substring of XS or it is the last character, Append that character
            if (islastCharacterX || i == s.length() - 1) {
                for (int l = 0; l < count; l++) {
                    sb.append(c); 
                }
                count = 0;
            }
            i++;
        }

        return sb.toString();
    }

    //This method moves all characters c down in the two-dimensional Hooray
    public static void moveAllXsDown(char c, char[][] board) {
        //Loops through board
        for (int i = board.length - 1; i >= 0; i--) {
            //Loops through each array in board
            for (int j = board[i].length - 1; j >= 0; j--) {
                //If current index is also in the scope of the row above the current one and the current character above it is equal to C, Switch places with that character
                if ((i != 0 && j < board[i - 1].length) && board[i - 1][j] == c) {
                    char c2 = board[i - 1][j];
                    board[i - 1][j] = board[i][j];
                    board[i][j] = c2;
                }
            }
        }
        
    }

    //This method moves the first instance of X down into the left As far as it can go
    public static void moveXDownLeft(char c, char[][] board) {
        
        //The ith and jth index of the first instance of X
        int ci = 0;
        int cj = 0;
        //Represents if this X is the first one
        boolean first = true;

        //For each array in bored
        for (int i = 0; i < board.length; i++) {
            //Loops through each array and board
            for (int j = 0; j < board[i].length; j++) {
                //For first instance of X
                if (board[i][j] == c && first) {
                    ci = i;
                    cj = j;
                    first = false;
                }
                //If current index is on a diagonal with the first instance of X
                if (i - ci == cj - j) {

                    char c2 = board[i][j];
                    board[i][j] = board[ci][cj];
                    board[ci][cj] = c2;
                    ci = i;
                    cj = j;
                }

            }
        }
    }
}