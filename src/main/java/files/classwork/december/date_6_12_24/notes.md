## var
1. var for local variables, Java will infer the narrowest type

## modules
1. a way of organizing the java api to say what parts are included with your programs

## switch expressions
1. ```
    days = switch(month) {
        case 1 -> 12;
        case 2 -> 28;
    }
    ```

## java records
1. ```
    public record Employee(String name, int number, double salary) {}
    ```
   1. shortcut for a class with
      1. private final fields
      2. public getter methods
      3. constructor
      4. overridden toString and equals
