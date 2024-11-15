## shortcuts
1. java has 2 shortcuts for creating anonymous classes that implement interfaces with a single non-default method
   1. lambda syntax
      1. interface code:
            ```
            new Interface() {
            public void methodToOverride(A input1, B input2)}
            ```
      2. same code but lambda: ` (input1, input2) -> { body }` 
   2. method reference syntax
      1. body of the interface method just calls another function with the same parameter signature
      2. interface code:
            ```
            new Interface() {
                public void methodToOverride(A input1, B input2) {
                    C.cmethod(input1, input2);
                }
            }
            ```
      3. method reference code: `C::cmethod`

    
