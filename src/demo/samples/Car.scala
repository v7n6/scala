package demo.samples

/**
  * Created by vt186020 on 2/14/17.
  */
class Car (speed : Int) extends Vehicle(speed) with Flying{
  override val mph: Int= speed
  override def race() = println("Racing Car")

  override def fly(): Unit = println("Flying car")
}