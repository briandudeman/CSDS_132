package projects.project_2;

public class HW2 {

    public static boolean isAlphabeticalOrder(String s) {
        int lastChar = 0;
        char thisChar = 'a';
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

    public static String removeNChars(String s, int n, char c) {
        StringBuilder sb = new StringBuilder();

        int tally = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c || (s.charAt(i) == c && tally >= n)) {
                sb.append(s.charAt(i));
            } else {
                tally++;
            }
        }

        return sb.toString();
    }

    public static String removeString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < s1.length()) {
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

            if (s2Here == true) {
                i += s2.length();
            } else {
                sb.append(s1.charAt(i));
                i++;
            }

            System.out.println(i);
        }
        return sb.toString();

    }

    public static String moveAllXsRight(char c, String s) {
        StringBuilder sb = new StringBuilder();



        int i = 0;
        int count = 0;
        while (i < s.length()) {
            boolean g = false;
            if (s.charAt(i) != c) {
                if (i != 0 && s.charAt(i - 1) == c) {
                    g = true;                
                }
                sb.append(s.charAt(i));
            } else {
                count++;
                g = false;
            }
            System.out.println(g);
            System.out.println(count);
            if (g || i == s.length() - 1) {
                for (int l = 0; l < count; l++) {
                    sb.append(c); 
                }
                count = 0;
            }
            i++;
        }

        return sb.toString();
    }
    public static void moveAllXsdown() {
        
    }
    public static void moveXDownLeft() {
        
    }

}