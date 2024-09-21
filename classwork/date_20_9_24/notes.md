# Loops
1. there are 4 kinds of loops in java
    1. while loops
        1. while (condition) {
                body statement
        }
            1. is a single body statement 
            2. condition is evaluated, if condition is true, the body statement is excecuted, then reevaluates the condition
    2. for loops
        1. for (initial statement; condition; 0 or more increment statements) {
            loop body
        }
        2. the initial statement is excecuted, then the condition is evaluated, then the loop body is excecuted if the condition is true and the increment statement is excecuted and everything is repeated
        3. EX:
            1. for (int count = 0; count < 5; count = count + 1) {
                System.out.println("hello");
            }
    3. do while loops
        1. do {

        } while (condition);
            1. first executes the body, then evaluates the condition and if the condition is true, repeat the body
    4. for each loops
        1. requires arrays or Iterable type