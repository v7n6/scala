package demo.collections

/**
  * Created by vt186020 on 2/17/17.
  */
object MapDemo {

  def main(args: Array[String]): Unit = {
    var map = Map(1 -> "One", 2 -> "Two")

    println(map(1))
    println(map.get(2)) //returns an option, some(Two) in this case
    println(map.get(3)) //returns none in this case
    println(map.getOrElse(3, "Not Found"))

    //adding element to map
    map = map + (3 -> "Three")
    map ++= List(4 -> "Four", 5 -> "Five")
    println("New size: "  + map.size)

    //getting values from map throug range of key values
    println(List(1,2) flatMap(map.get))
    println(1 to 3 flatMap(map.get))

    //removing element
    map = map - 1
    map --= List(3, 4)
    println(map)
  }
}
