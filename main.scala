object Kata {
  def placeHolder() = ???
}

object Main {
  def main(args: Array[String]): Unit = {
    println("HELLO")
  }

  def dummyTest[T](result: T, expected: T) = {
    val assertion = if (result == expected) s"${Console.GREEN} true" 
      else s"${Console.RED} $result did not equal $expected"

    println(s"${Console.YELLOW} - Should return $expected given some value: $assertion")
  }
}
