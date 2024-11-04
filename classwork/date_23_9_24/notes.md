# For loops and Strings

<p>
in StringStuff.java, we create 2 methods that determines if a string is a palindrome, called isPalindrome and isPalindrome2 to do this we need 2 important methods of String. each method workds, but isPalindrome2 is possibly a little clearer of when you stop the loop</p>

1. length()
    1. returns the # of characters in String
    2. "hello".length() -->5
2. charAt(int index)
    1. returns the specific character at the given index, starts counting at 0
    2. "hello"charAt(1) --> 'e'


<p>
in StringStuff.java, we create a method to capitalize every letter in a string. to do that we must learn a little more about strings</p>

1. a string CANNOT be changed once created
2. the + operator "concatenates" strings by creating a new string that appends the operators
    1. to add 1000 exclamation points at the end of a string, just make a for loop with the + operator
    2. VERY memory nonefficient
3. StringBuilder: a built in class of Java for creating strings
    1. append(char c)
        1. adds c to the end of string being created