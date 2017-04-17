package demo.samples

class Circle(radius: Int) extends Shape {

  override def findArea() = println(3.14*radius*radius)
}
