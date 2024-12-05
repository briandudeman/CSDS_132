## StringBuffer
1. thread safe
   
## threads and JavaFX
1. javaFX and pretty much all GUIs use multiple threads, with one thread dedicated to making the visuals on the screen
2. we want all visual work on this thread, and no other processinig
3. JavaFX event dispatch thread -> runs start and all event handlers
4. property
   1. private field
   2. public getter/setter methods
   3. routines that let us link and manipulate properties, even across threads