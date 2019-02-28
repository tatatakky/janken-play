object Judgement {

  def stringToInt(a: String): Int = a match {
    case "paper"    => 0
    case "rock"     => 1
    case "scissors" => 2
  }

  def judge(user: Int, comp: Int): String = (user, comp) match {
    case (0, 0) => "draw"
    case (1, 1) => "draw"
    case (2, 2) => "draw"
    case (0, 1) => "UserWin"
    case (1, 2) => "UserWin"
    case (2, 0) => "UserWin"
    case _      => "CompWin"
  }

}