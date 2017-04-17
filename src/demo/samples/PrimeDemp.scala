package demo.samples

object PrimeDemo {

  def main(args: Array[String]): Unit = {
    println("7: " + isPrime(7))
    println("34: " + isPrime(4))

    println("255: " + isPrimeEffective(255))
  }

  def isPrime(n: Int): Boolean = {
    (2 until n) forall(x => n%x != 0)
  }

  def isPrimeEffective(n: Int) =  {
    (2 until Math.sqrt(n).toInt) forall(x => n%x != 0)
  }
}
