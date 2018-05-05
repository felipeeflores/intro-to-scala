# Presenter Notes

## Intro

- Start by explaining course structure
  - levels
  - tests for each level
  - `build.sbt`
  - start `sbt`
  - run sbt commands
  - it is better to leave sbt open to run commands interactively, instead of batch mode
  - run all tests
  - run one test
  
## IntroExercises
  - The idea is to get familiar with the language ans its basic constructs
    - How do we create functions/methods, declare parameters
    - create values, use vals and not vars, objects

### Scala objects

  - explain scala objects: 
  
  > An object is a class that has exactly one instance. An object is a value and a singleton.
  
  - objects are very special and useful. You will see them everywhere in REA codebases
       
### Functions

  - A function takes arguments (inputs) and returns an result (output)
  - when a function has the property that always returns the same output for a given set of inputs, we say the function is referentially transparent
  - briefly: explain what referential transparency is and maybe why it is a good thing. Mention that student will see more of that throughout the course
  - In Scala all functions are expression, which means the y always return something
  - The last statement in its body is the output of a function
  - there is a return statement, but you will never see it used.   

### Exercises

```$scala
  
  /**
  def add(x: Int, y: Int): Int = x + y
  
  // [A] -> polymorphic type in Scala, also know as Generics in other languages
  def foo[A](a: A): A = a
  
  def bar(a: Int): Int = Random.nextInt
  
  // More parametricity supporting examples
  
  def other[A](items: List[A]): Int = ???

  def another[A](items: List[A]): Boolean = ???
  
  
  def timesTwoIfEven(x: Int): Int = if (x % 2 == 0) x * 2 else x
  
  //Not total?
  def timesTwoIfEven(x: Int): Int = if (x % 2 == 0) x * 2
  // Error:(55, 37) type mismatch;
  // found   : Unit
  // required: Int
    
  // In Scala if statements are expressions
  scala> val foo = if (5 > 3) "foo" else "bar"
  foo: String = foo
  
    
  def showNumber(x: Int): String = s"The number is $x"

```

  
