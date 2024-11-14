## GUIs
1. Java AWT: first GUI library
   1. desktop only
2. Java Swing: build on top of Java AWT
   1. desktop only
3. Java FX: new library not build on Java AWT
   1. combines desktop, web, and mobile
   2. part of Java 8, seporate starting Java 1
   3. to create an interface
      1. extend the application class
      2. we override the start method
      3. we have to create a Stage (window) and on it place a Scene
4. layout manager
   1. a gadget where you can place other gadgets and control how they are placed in relation to each other
5. event driveng programming paradigm
   1. the program waits for events to happen and then responds to the events
   2. events are button presses or mouse moves, or anything
   3. your program must resiter with the OS to recieve events
   4. the java vm does the registering
      1. our program must tell java vm what events we want, and what code is run when theevent happens
         1. this is done in java through interface