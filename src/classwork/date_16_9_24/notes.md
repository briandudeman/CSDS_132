
Overriding is when you use the exact same input types, return type, and name, overloading is the same name but not the same inputs

To check if you have overridden a method, you can use @Override over the method declaration

Each constructor does the following:
1. Calls another constructor( usually from the super class, but can be from same class)
2. Initializes instance fields
3. Runs rest of constructor body
If you don’t write a constructor, java gives you a default constructor that takes no inputs and calls the constructor of the super class that takes no input

To call another constructor:
super(inputs)
Calls constructor of super class
this(inputs)
Calls constructor of same class
If you don't use super(inputs) or this(inputs), java uses super()

Good OO design pt 1
All fields should be private
If you want other code access to values, create public getter and setter methods as appropriate
Everywhere you use the value, use the getter/setter method and not the field directly


Leap years
A leap year is divisible by 4, but not by 100, unless it is divisible by 400
public boolean isLeapYear(int year){
if (year % 4 != 0){
	return false;
} else if (year % 100 != 0)
	return true;
else if (year % 400 = 0)
	return true;
else 
	return false
}

Or

return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))
