## the stack
1. memory for method calls, input parameters, local variables
    1. each time a method is run, a "stack frame" is allocated on top of the stack
        1. stack frame contains :
            1. the input parameters (including "this")
            2. local variables
            3. book keeping info (ex: where the return value goes)
        2. when method is done, stack frame is de-allocated
    2. an input pararmeter exists only during the method execution
    3. each time we enter a compund statement {}, a "mini frame" is added to the stack containing local variables in that statement
    4. a local variable exists from when it is declared to end of compund statement it is in