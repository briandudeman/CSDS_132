## interface
1. does not go in the class hierarchy but sits along side it
2. an interface can extend o or more interfaces
3. a class can "implement" (extends) 0 or more interfaces
4. an interface can contain
    1. public abstract instance methods
    2. static methods
    3. public static fields
    4. private methods
    5. nested types (static)
    6. cannot have non-abstract instance methods
    7. no constructor
5. defined by `public interface` instead of `public class`
6. for a class that implements an interface, `public class ClassName extends Parent implements InterfaceName`

## default method
1. if a class implementing this interface does not already have the method or override the method, java will automatically override using the default method body
