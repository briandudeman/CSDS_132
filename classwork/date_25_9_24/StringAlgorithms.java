package classwork.date_25_9_24;
import classwork.date_23_9_24.StringStuff;

public class StringAlgorithms extends StringStuff{
    
    public boolean isStringPalindrome(String s) {

        int front = 0;

        int back = s.length() - 1;

        while (front < back) {
            while (!Character.isLetter(s.charAt(front)) && front < s.length()) {
                front ++;
            }
    
            while (!Character.isLetter(s.charAt(back)) && front >= 0) {
                back --;
            }
    
            if (front < s.length() && back >= 0 && Character.toUpperCase(s.charAt(front)) != Character.toUpperCase(s.charAt(back))) {
                return false;
            } else {
                front ++;
                back --;
            }
        }
        return true;
    }

    public boolean isStringPalindromeBetter(String s) {

        int front = 0;

        int back = s.length() - 1;

        while (front < back) {
            if (!Character.isLetter(s.charAt(front))) {
                front ++;
            } else if (!Character.isLetter(s.charAt(front))) {
                back --;
            } else if (Character.toUpperCase(s.charAt(front)) == Character.toUpperCase(s.charAt(back))) {
                front ++;
                back --;
            } else {
                return false;
            }
        }
        return true;
    }
}
