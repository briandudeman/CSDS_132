## classes (and interfaces) can contain other classes and interfaces
1. nested types
   1. types declared in the body of another type
   2. static
      1. exactly the same as our "normal" classes, but located inside another class
2. Inner types
   1. types declared in the body of a method
   2. anonymous type
      1. inner class that has no name
         1. in a non-static nested class (inner classes)
            1. there are 2 this
               1. the one for the nested class and the one for the containing class
      2. you create anonymous classes when creating the instance
         1. new 