## threads
1. a thread is an execution of a program
2. multiple threads can run at the same time in your cpu
3. splitting your program to run on multiple threads will make your program run in parallel
   1. threads are actually parallel, but cores in cpu are and threads swap out different programs
4. Thread Class
   1. makes a new thread, you can use anonymous class
   2. methods
      1. `public void run()`
         1. runs whatever is in the body in the thread
      2. 
   3. key terms
      1. volatile
         1. indicates that a variables value must be changed by multiple threads so the Java compiler should NOT optimize code assuming only this thread changes the value
         2. goes in variable delcaration
      2. synchronized
         1. indicates that this method or chunk of code is locked so that only one thread can execute it at a time
         2. when one thread is running code that is locked, no other thread can run that code that is locked by the same lock until the first thread finishes
         3. goes in method declaration or for a specific line:
            1. `synchronized () {}`
               1. in the parenthesis you give the variable you want to lock and in the body it is the portion of code you want to synchronize