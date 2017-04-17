
object SwitchCase {

  def main(args: Array[String]) {
    val nums = List("Mon", "Tue", "Wed")

    for(num <- nums) {
      num match {
        case "Mon" => println("Its monday huh..")
        case other => println(other)
      }
    }
  }
}
