package files.challenges.good_loop_cc;

public class StringStuff {

    public String capitalizeAfterSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i - 1) == ' ') {
                if (s.charAt(i) < 'z' && s.charAt(i) > 'a') {
                    sb.append((char)(s.charAt(i) + 'A' - 'a'));
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}