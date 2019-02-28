import Tools._
import Judgement._
object Main {

  def main(args: Array[String]): Unit = {
    println("select hand [Paper, Rock, Scissors]")
    val userHand: String = Tools.selectHands(Paper)
    println("User selected [ " + userHand + " ]")
    val compHand: String = Tools.selectHands(Rock)
    println("Comp selected [ " + compHand + " ]")
    val userHandInt: Int = stringToInt(userHand)
    val compHandInt: Int = stringToInt(compHand)
    val result: String = Judgement.judge(userHandInt, compHandInt)
    println(result)
  }

}