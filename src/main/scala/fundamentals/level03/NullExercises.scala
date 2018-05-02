package fundamentals.level03

/**
  * These exercises are intended to show the problems that come with programming with `null`s.
  *
  * After these exercises, we will learn the alternative to using `null`s.
  */
object NullExercises {

  /**
    * From here on, we will work with a `TrafficLight` type that is defined in `package.scala`
    *
    * For simplicity, this type does not have a `Flashing` light.
    */

  /**
    * scala> mkTrafficLightOrNull("red")
    * = Red
    *
    * scala> mkTrafficLightOrNull("green")
    * = Green
    *
    * scala> mkTrafficLightOrNull("yellow")
    * = Yellow
    *
    * scala> mkTrafficLightOrNull("bob")
    * = null
    **/
  def mkTrafficLightOrNull(str: String): TrafficLight = str.toLowerCase match {
    case "red" => Red
    case "yellow" => Yellow
    case "green" => Green
    case _     => null
  }

  /**
    * scala> mkTrafficLightOrNullThenShow("red")
    * = "Traffic light is red"
    *
    * scala> mkTrafficLightOrNullThenShow("green")
    * = "Traffic light is green"
    *
    * scala> mkTrafficLightOrNullThenShow("yellow")
    * = "Traffic light is yellow"
    *
    * scala> mkTrafficLightOrNullThenShow("bob")
    * = "Traffic light is invalid"
    *
    * Hint: Use `mkTrafficLightOrNull` and pattern matching
    */
  def mkTrafficLightOrNullThenShow(str: String): String = {
    val light = mkTrafficLightOrNull(str)
    if (light != null) {
      light match {
        case Red => "Traffic light is red"
        case Yellow => "Traffic light is yellow"
        case Green => "Traffic light is green"
      }
    } else {
      "Traffic light is invalid"
    }
  }


  /**
    * scala> mkPersonOrNull("Bob", 20)
    * = Person("Bob", 20)
    *
    * If `name` is blank:
    *
    * scala> mkPersonOrNull("", 20)
    * = null
    *
    * If `age` < 0:
    *
    * scala> mkPersonOrNull("Bob", -1)
    * = null
    **/
  def mkPersonOrNull(name: String, age: Int): Person = {
    if ((name == null || name.trim.length == 0) || age < 0){
      null
    } else {
      Person(name, age)
    }
  }

  /**
    * scala> mkPersonOrNullThenChangeName("Bob", 20, "John")
    * = Person("John", 20)
    *
    * scala> mkPersonOrNullThenChangeName("Bob", -1, "John")
    * = null
    *
    * scala> mkPersonOrNullThenChangeName("Bob", 20, "")
    * = null
    *
    * Hint: Use `mkPersonOrNull` and `changeName` (already implemented below)
    **/
  def mkPersonOrNullThenChangeName(oldName: String, age: Int, newName: String): Person = {
    val person = mkPersonOrNull(oldName, age)
    if (person != null) {
      if (newName != null && newName.trim.length > 0) {
        changeName(newName, person)
      } else {
        null
      }
    } else {
      null
    }
  }

  def changeName(newName: String, person: Person): Person = person.copy(name = newName)

  /**
    * Does the following function return a `null`?
    */
  def mean(nums: List[Int]): Double = nums.sum / nums.size

}
