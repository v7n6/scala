import demo.samples.Square

//Object makes this class singleton
object HelloScala {

  //main function will be called by default when the program is executed
  def main(args: Array[String]) = {
    println("Hello world works!")

    function1()
    println("Sum is " + sum(2, 3))
    arrayDemo()
    rangeDemo()
    findArea()

    try {
    requireDemo(2, 0)

    } catch {
      case e: IllegalArgumentException => println("Requirement Failed - " + e.getMessage)
    }
  }

  def function1() =     println("Inside function1")

  def sum(x: Int, y: Int) = x + y

  def arrayDemo() = {
    val arr1: Array[String] = new Array[String](3)
    arr1(0) = "one"
    arr1(1) = "two"
    arr1(2) = "three"

    println("Array length is " + arr1.length)
  }

  def rangeDemo() = {
    println(1 to 5)
    println(1 until 5)
  }

  def findArea() = {
    val square = new Square(3)
    square.findArea()
  }

  def requireDemo(x: Int, y: Int) = {
    require(x > 0, "Input1 cannot be zero")
    require(y > 0, "Input2 cannot be zero")
  }
}