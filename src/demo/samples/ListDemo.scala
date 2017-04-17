package demo.samples

object ListDemo {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    val list2 = List(55, 10, 50)
    val list3 = List(list, list2)

    val a = 0
    println(a::list)
    println("Sum :" + list.sum)
    println(list.head)
    println("Take: " + list.take(2))
    println("Init: " + list.init) //all elements other than last one
    println("Drop: " + list.drop(3)) //drops the n elements and prints the remaining
    println("Reverse: " + list.reverse)
    println("Update: " + list.updated(3, 40)) //updates the list at the position 3 with value 40
    println("Index: " + list.indexOf(3))
    println("Contains: " + list.contains(4))
    println("Concat: " + (list ::: list2))
    println("Before Flatten: " + list3 + " After flatten: " + list3.flatten)
    println("For all operation: " + list.forall(x=> x> 10))
    println("Map operation: " + list map(x=>x*2))
    println("sort : " + list2.sorted)

    val list1 = 10::20::30::40::Nil
    println("Nth element: " + nthElement(2, list1))
  }


  def nthElement[T](n: Int, list: List[T]): T = {
    if(n < 0 || n > list.size)
      throw new Exception("Unreachable")
    else if(n == 0)
      list.head
    else
      nthElement(n-1, list.tail)
  }

}
