package demo.samples

object ForDemo {

  case class Person(name: String, age: Int)

  def main(args: Array[String]): Unit = {
    val p1 = Person("A", 23)
    val p2 = Person("B", 25)

    val persons = List(p1, p2)

    val filteredPersons = for(p <- persons if p.age == 25) yield  p //similar to filter method in list
    println(filteredPersons)
  }
}
