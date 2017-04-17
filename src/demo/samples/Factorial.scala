package demo.samples

object Factorial {

  def main(args: Array[String]): Unit = {

    println(factorialWithoutTailRecursion(5))
  }

//  @annotation.tailrec //it cannot be applied here as recursive call is not the last step here
  def factorialWithoutTailRecursion(num:Int): Int = {
    if(num == 1)
      return num

    num * factorialWithoutTailRecursion(num - 1)
  }

  @annotation.tailrec
  def factorialWithTailRecursion(intermediateVal: Int, num: Int): Int = {
    if(num == 1)
      return num

    factorialWithTailRecursion(intermediateVal * num, num - 1)
  }

}
