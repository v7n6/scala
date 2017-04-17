package demo.samples

class Square(length: Int) extends Shape {

  override def findArea() = {
    println("Side is " + length + " Area is " + length * length)
  }
}
