## arrays
1. multiple variables of same type in contigous memory
    1. benefit: really fast indexing
    2. downsides: cant add to end and hard to stick something in middle

## linked list
1. variables of the same type with noncontigous memory
    1. easy/fast to increase or decrease size
    2. fast access to only a few elements
    3. [__|__] -> [__|__] -> [__|__] -> [__|__]
        1. each block is a node with an element and the address to the next node
2. EX:
    1. in LLNode.java, T is a generic type
    2. declaring an instance of LLNode:
        1. `LLNode<String> = new LLNode<String>("Hi", null)`


## generic type
1. a placeholder type that gets specified later
2. to use a generic type you must declare it in the class header or method header

## primitive types in linked lists
1. for each primitive type, java has a non-primitive "wrapper" class
   1.  int -> Integer
   2.  double -> Double
2. java will automatically "box" and "unbox" between primitive and wrapper
   1. EX: `Integer x = 5` is a shortcut for `Integer x = new Integer(5)`
      1. but `x = x + 1` right after is `x = new Integer(x.getValue() + 1)`

## inputing sometho\ing in middle
1. `LLNode<Double> box = new LLNode<Double>(2.5, null)`
2. `box.setNext(list.getNext().getNext())`
3. `list.getNext().setNext(box)`
4. or in 1 line
   1. `list.getNext().setNext(new LLNode<Double>(2.5, list.getNext().getNext()))`