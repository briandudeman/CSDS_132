# java's memory model

1. java( and every language) divides the memory into the heap and the stack
    1. heap
        1. for classes and instances
            1. for each class your program uses, Java places a class "object" in the heap storing:
                1. the super class
                2. all methods defined in this class
                3. all constructors
                4. all class fields defined in the class
                5. nested types
            2. for each instance an object is placed in the heap storing:
                1. the true type of the instance
                2. every instance field of all polymorphic types
        2. all non-primitive types
    2. stack
        1. for method calls
        2. aprox 1 mb