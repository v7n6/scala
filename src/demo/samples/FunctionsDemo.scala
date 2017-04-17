package demo.samples

object FunctionsDemo {

  def main(args: Array[String]): Unit = {

    //function is assigned to a literal
    val funcVar = (a: Int, b: Int) => a + b
    println("Func literal " + funcVar(1, 2))

    //function returned as an expression and apply method is called
    println("Func expression " + functionExp().apply(2, 3))
  }

  def functionExp() = {
    (a: Int, b: Int) => a + b
  }
}
