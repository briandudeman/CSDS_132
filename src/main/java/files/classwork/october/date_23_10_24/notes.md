## create a program for geometry
1. ideas
    1. squares
    2. rectangles
    3. perimeter
    4. lines
    5. angles
    6. circles
    7. area
    8. ellipses
    9. hexagons
    10. triangle
2. building a type hierarchy
    1. if a is a b, make a and b classes(or non primitive types) and have a extend b
    2. if a has a b then a is a type and b is a method of a
    3. 
        1. square is a rectangle
        2. circle is an ellipse
        3. rectangle has angles and perimeter
    4. put attributes as high in the hierarchy as makes sense

## abstract class
1. an abstract class is a non-primitive type that
    1. goes in the class hierarchy
    2. has everything a class has
    3. also has abstract methods, method headers with no body
2. a class cant have abstract methods so a class extending an abstract class must override the abstract method
3. an abstract class cannot directly be created with new
4. denoted with `abstract` in class and method header after public or private