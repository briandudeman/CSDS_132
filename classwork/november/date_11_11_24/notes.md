## nested classes with generics
1. does the nested class have access to the containing class generic?
   1. for static nested classes, no
   2. for non-static nested classes, yes

## arrays with generics
1. generic types and arrays generally do not mix
2. all you can do is declare an array as a generic type
   1. `T[] myArray;`
   2. `