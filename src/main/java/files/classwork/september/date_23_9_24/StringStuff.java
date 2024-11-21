package files.classwork.september.date_23_9_24;

public class StringStuff {

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String word) {
        boolean isPalindrome = false;
        for (int first = 0, last = word.length() - 1; first < last && isPalindrome; first++, last--) {
            if (word.charAt(first) == word.charAt(last)) {
                ;
            } else {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }

    public static String capitalize(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 'z' && s.charAt(i) > 'a') {
                sb.append((char)(s.charAt(i) + 'A' - 'a'));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}