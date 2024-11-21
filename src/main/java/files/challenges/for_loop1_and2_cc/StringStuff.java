package CSDS_132.challenges.forLoop1And2CC;

public class StringStuff {
    
    public int palindromeError(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return i;
            }
        }
        return -1;

    }

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append((char)(s.charAt(i) - 'A' + 'a'));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public String shout(String s, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (int l = 0; l < i; l++) {
            sb.append('!');
        }
        return sb.toString();
    }

}
