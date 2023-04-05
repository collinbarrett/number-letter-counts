# Problem: Number Letter Counts

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 10 inclusive were written out in words, how many letters would be used?

What about 1 to 100?  

1 to 1000?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

Credit: Project Euler https://projecteuler.net/problem=17

## Process

This is a timed coding challenge.  Once you have downloaded the project, read the problem, clarified any questions with the proctor, and set up your editing environment, the proctor will start a timer for 45 minutes.

This is a somewhat challenging problem for the time provided.  Getting a 100% solution is *not mandatory*.  What matters is demonstrating your ability to read a specification and think clearly about a hard problem. 

The officially supported languages for this problem and Scala and Java and basic skeleton projects have been provided (see below). However, you may not be absolutely required to use Java or Scala - ask your proctor; if you are comfortable writing your code from scratch in a different language like Python or JavaScript, that may be permissible.

This problem is not graded on algorithmic performance - idiomatic code is preferred to more esoteric solutions, but be prepared to discuss the performance of your code.

### For Scala 

A minimal `build.sbt` and `Main.scala` file are provided.  The scala file contains a main() method that reads two integers 
from the command line arguments, and passes them to a method called 
`numberLetterCounts(min:Int, max:Int):Int`.  Implementing that method is up to you. `sbt "run 1 10"` is the correct form to run the program on the range from 1 to 10 (inclusive).

The main class also contains an unimplemented method called 
`numberLetterCount(i:Int):Int`, intended to compute the number of letters in a single number `i`.

A ScalaTest suite is also provided for both the `numberLetterCount()` and `numberLetterCounts()` methods. This is not a TDD problem, but the test suite offers a relatively formal definition of the problem, and should be a good resource to use in trying to plan your approach.

You can run the tests as usual with `sbt test`.

### For Java 

Similarly, a minimal `build.gradle` and `NumberLetterCounter.java` file are provided.  The entry point Java file contains a `main` method that reads two integers from the command line arguments, and passes them to another method called 
`int numberLetterCounts(int min, int max)`.  Implementing that method is up to you. `./gradlew run --args="1 10"` is the correct form to run the program on the range from 1 to 10 (inclusive) via the command line.

The main class also contains an unimplemented method called 
`numberLetterCount(i:Int):Int`, intended to compute the number of letters in a single number `i`.

A JUnit5 test suite is also provided for both the `numberLetterCount()` and `numberLetterCounts()` methods. This is not a TDD problem, but the test suite offers a relatively formal definition of the problem, and should be a good resource to use in trying to plan your approach.

You can run the tests as usual with `./gradlew test`.


