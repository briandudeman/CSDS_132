# shortcuts

1. For each math operator we have a shortcut for assignment
    1. `x = x + 10 -> x += 10`
    2. `x = x * 10 -> x *= 10`
2. increment and decrement operators
    1. `x++`
        1. increases value stored in x by 1 and returns value before increase
    2. `++x`
        1. increases value stored in x by 1 and returns value after increase
    3. `x--`
        1. increases value stored in x by 1 and returns value before increase
    4. `--x`
        1. increases value stored in x by 1 and returns value after increase
3. conditional operator
    1. condition ? then-value : else-value
        1. `if (x < 0)
                x = x * -1;`
        2. `x = (x < 0) ? x * -1 : x;`
        3. then-value and else-value must be same type
4. switch statements(switch expressions)
    1. switch statements
        1. `switch (month) {
                case 1: s = "January";
                    break;
                case 2: s = "Feburary";
                    break;
            }`
            1. month has to be primitive
            2. if the break isn't there, the next case statement is run without considering the conditional
    2. switch expressions
        1. `s = switch (month) {
                case 1 -> "January";
                case 2 -> "Feburary";
            }`
5. array initialization
    1. `int[] array = {0, 1, 2, 3, 4, 5};`
