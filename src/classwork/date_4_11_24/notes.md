## generic types and wildcards
1. we can restrict what types may be used for the generic
   1. we can declare the generic as `<A extends B>`
   2. A is a generic type, this type specified must be B or narrower
2. we can also restrict a wildcard 
   1. `<? extends A>`
      1. don't care but is A or narrower
   2. `<? super A>`
      1. don't care but is A or wider