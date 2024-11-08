# Arrays

1. an array is multiple variables of the same type stored in contiguous memory
    1. int[] array;
        1. reads as array of int
    2. double[][] temps;
        1. an array of double array
        2. 2d array
    3. to create an array, 
        1. array1 = new int[100];
        2. creates 100 int variables in contiguous memory
    4. creating an array storing 50 JFrames
        1. JFrame[] frames;
        2. frames = new JFrame[50];

<p>
we index the variables in array from 0 and we can access the variable stored in that location with:
array[5] = 16. if we want to initialize all the variables in an array, we can use a loop. side note: to get the length of an array it is array.length; a field not a method
</p>

## Benefits and drawbacks of contiguous memory
1. Drawback
    1. you cant change the size of an array
2. Benefit
    1. very fast access to every variable in array