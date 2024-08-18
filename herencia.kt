// Superclass
open class MyParentClass {
    val x = 5
  }
  
  // Subclass
  class MyChildClass: MyParentClass() {
    fun myFunction() {
      println(x) // x is now inherited from the superclass
    }
  }
  
  // Create an object of MyChildClass and call myFunction
  fun main() {
    val myObj = MyChildClass()
    myObj.myFunction()
  }

  