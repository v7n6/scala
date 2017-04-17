package demo.collections

/**
  * Created by vt186020 on 2/17/17.
  */
object ReduceDemo {

  def main(args: Array[String]): Unit = {
    reduceDemo()
  }

  def reduceDemo() = {
    val list = List(8, 6, 22, 2)
    println("Max num: " + list.reduceLeft(_ max  _))

    println("Max num: " + List("moose", "cow", "A", "Cat").reduceLeft(_ + _.length))

    println("Longest word: " + List("moose", "cow", "A", "Cat").
      reduceLeft((a, b) => if (a.length > b.length) a else b))
  }
}
