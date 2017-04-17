package demo.collections

import scala.collection._

/**
  * Created by vt186020 on 2/17/17.
  */
object Sequence {

  def main(args: Array[String]): Unit = {
    listDemo()
    listTransformDemo()
    vectorDemo()
    mapDemo()
  }

  def isOdd(x: Int) = x % 2 ==1

  def listDemo() = {
    val list = List(1, 2,3 ,4)
    val even = list.filter(a=>
                      {
                        a%2 == 0
                      })
    println("Even " + even)

    val odd = list.filter(isOdd)
    println("Odd: " + odd)

    val listCons = 10::20::Nil
    println("list cons: " + listCons)

    //list merge
    val listMerge = list:::listCons
    println("List merge: " + listMerge)

  }

  def listTransformDemo() : Unit = {
    val list = List(1, 2, 3)
    println("Double list: " + list.map(_ * 2))

    println("Trnsform to diff type: " + List("A", "Cat").map(a => a.length))
  }

  def vectorDemo() = {
    val vec1 = immutable.IndexedSeq(1,2,3,4,5,6) //creating indexed seq creates vector by default
    println("Vec1: " + vec1.length)

    val vec2 = vec1 ++ Vector(7,8)
    println("Vec2: " + vec2.length)

    var vec3 = vec1.updated(0, 11) //as vector is immutable, update it and set to new val or make the variable val
    vec3 = vec3.updated(1, 22)
    println("vec3: " + vec3)

    println("vector filter greater than 2: " + vec1.filter(_ > 2))
    println("vector take: " + vec1.take(3)) //extracts first n elements
  }

  def mapDemo() = {
    val map = mutable.Map(1 -> "One", 2 -> "Two", 3-> "Three")

    println(map.size)
    println(map(1))
    map(1) = "ones"
    println(map(1))
  }

}
