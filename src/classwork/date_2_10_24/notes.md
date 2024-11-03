# Loops

## break and continue
1. we should avoid these ig
2. break exits the loop immediately
3. continue exits the body of the loop and jumps to the condition for the while loop or the increments for a for loop
4. violates: all stopping conditions are in loop header

## how to handle errors
1. use a specified return value
    1. only if specified value an never be confused with actual data
2. print an error message
    1. only works in methods that are handling user input/output
3. use a different channel for the error codes

## think logically about loops
1. what is teh goal of the loop
    1. show that x is not in the array
2. what is th "subgoal" of the loops -> what is achieved after each iteration of teh loop
    1. when the loop condition is false, that plus the suboal should logically give the goal
    2. the subgoal is true after each iteration
    3. the subgoal is true before the first iteration
    4. if x is in array, it is at an index between front and end