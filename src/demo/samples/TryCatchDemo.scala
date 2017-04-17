package demo.samples

object TryCatchDemo {
  def main(args: Array[String]): Unit = {
    val tryCatchDemo = new TryCatchDemo

    try {
      tryCatchDemo.validateRequiredInput(0, 2)
    } catch {
      case ill: IllegalArgumentException => println("Requirement Failed - " + ill.getMessage)
    }

    try {
      tryCatchDemo.assertInput(2, 0)
    } catch {
      case e: AssertionError => println("Assertion Failed - " + e.getMessage)
    }
  }
}

class TryCatchDemo {

  def validateRequiredInput(x: Int, y: Int) = {
    require(x > 0, "Input1 cannot be zero")
    require(y > 0, "Input2 cannot be zero")
  }

  def assertInput(x: Int, y: Int) = {
    assert(x > 0, "Input1 assertion failed")
    assert(y > 0, "Input2 assertion failed")
  }
}
