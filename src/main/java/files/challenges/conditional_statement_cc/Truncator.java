package files.challenges.conditional_statement_cc;

public class Truncator extends Object{
    
    public static int truncate(int x){
        if (x == 0){
            return 0;
        } else if (x % 2 == 0){
            return x;
        }
        return x-1;
    }
}
