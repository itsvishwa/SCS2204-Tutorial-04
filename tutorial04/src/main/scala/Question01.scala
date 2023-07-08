def interest(amount: Double): Double = amount match {
  case x if x <= 20000 => x * 0.02;
  case x if x <= 200000 => x * 0.035;
  case x if x <= 2000000 => x * 0.04;
  case _ => amount * 0.065;
}

object Question01 extends App {
  println("Enter a number: ");
  val data = scala.io.StdIn.readDouble();
  printf(f"Interest = Rs. %.2f", interest(data));
}
