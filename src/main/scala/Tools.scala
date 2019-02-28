object Tools {

  trait Hands
  case object Paper extends Hands
  case object Rock extends Hands
  case object Scissors extends Hands

  def selectHands(h: Hands): String = h match {
    case Paper    => "paper"
    case Rock     => "rock"
    case Scissors => "scissors"
    case _        => "HandNotFound"
  }
  
}