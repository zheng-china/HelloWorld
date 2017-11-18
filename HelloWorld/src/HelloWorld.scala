/**
 * Created by Administrator on 2015/5/30.
 */
import scala.util.matching.Regex._

object HelloWorld extends App {
  println("Hello World")

  val line = "Hello World"
  val (first, second) = line.span(_ != 'e')
  println("first:" + first)
  println("second:" + second)

  val numPattern = "(^[0-9]{0,5})([0-9]{4}$)".r
  val phone = "123456789"
  val numPattern(fir, sec) =phone
  println("fir:" + fir)
  println("sec:" + sec)

  val address = "123 Main Street"

  val vars = Map("x" -> "a var", "y" -> """some $ and \ signs""")
  val text = "A text with variables %x, %y and %z."
  val varPattern = """%(\w+)""".r
  val mapper = (m: Match) => vars get (m group 1) map (quoteReplacement(_))
  val repl = varPattern replaceSomeIn (text, mapper)
  println(repl)

  val a = Runtime.getRuntime.maxMemory/(1024*1024)
  println("maxMemory:" + a)

 //2017-11-18
  val ifExist = false;
  val b:AnyVal = 3;
  b match {
    case _:Int if ifExist => println("Int")
    case _:Float =>   println("Float")
    case _ => println("Num")
  }
}
