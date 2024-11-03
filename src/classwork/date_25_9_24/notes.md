# good testing ideas


<p>
today we will look at 3 ways to figure out if a string with english punctuation and spaces is a palindrome, instead of just a word
</p>

## algorithms
1. algorithm 1
    1. remove punctuation and spaces
    2. make all letters lowercase
    3. use isPalindrome from last class
2. algorithm 2
    1. put an index at front and one at back
    2. if index is not looking at a letter, move until it is
    3. now both looking at letters, compatre ignoring case
    4. stop when indexes cross
3. algorithm 3
    1. make a new string that is the reverse of the input
    2. remove punctuation and spaces of both
    3. make both lowercase
    4. see if strings are equal

## goals for a good algorithm with loops
1. efficient time ( counts # of traversals of data)
2. efficient use of memory: amke a few copies of input data as needed
3. logically simple: each step/loop does one logical task
4. simple increment

## algorithms evaluated
1. algorithm 1
    1. 3 passes through the data
    2. makes 2 copies of the string
    3. each step does its own thing (logically simple)
    4. has simple increment
2. algorithm 2
    1. 1 pass through the data
    2. 0 copies of the data
    3. logically pretty simple but not as much as algorithm 1
        1. does 2 operators: skip non-letters and compare letters
    4. not so simple increment
3. algorithm 3
    1. 6 passes through data
    2. creates 5 extra strings
    3. logically simple
    4. simple increment

<p>
we have chosen algorithm 2 to program to see why having a non simple increment is challenging
</p>