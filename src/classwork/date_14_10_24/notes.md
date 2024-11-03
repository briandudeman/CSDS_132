## main method
1. how java launches a standalone program
2. first method run by operating system
3. every class can have 1 main method, but only 1 is the true main method
4. public static void main(String[] args)

## error handling
1. print an error message
    1. only in routines doing input output with the user
2. use a special return value
    1. only if it can never be mistaken for valid data
3. use a different channel to report the error
    1. throwing an exception is a different channel to get data out of a method, different from return
        1. return: normal way to stop method and send back data
        2. throw exceptions: alternate way to stop method and send data
        3. when a method is thrown, the method stops and sends exception to method that calls it
        4. each method will stop and throw exception until it is "caught"
        5. to deal with exception, we catch it using a try catch statement
            1. `try {
                code that may throw exception
            } catch (ExceptionType variableStoringException) {
                code run if exception is thrown
            } finally {
                code that runs no matter what
            }`
                1. 1 or more catches, finally is optional
