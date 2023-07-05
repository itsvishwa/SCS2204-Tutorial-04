def isEven(n: Int) = n match {
  case 0 => true;
  case _ => isOdd(n-1);
}

def isOdd(n: Int): Boolean = !isEven(n)


object Main extends App {
  println(isEven(2));
}
