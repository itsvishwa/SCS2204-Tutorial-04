def patternMatch(n: Int) = n match {
    case x if x <= 0 => "Negative/Zero";
    case x if x % 2 == 0 => "Even number";
    case _ => "Odd number"; 
}

object Question02 extends App{
    println("Enter a number: ");
    val data = scala.io.StdIn.readInt();
    println(patternMatch(data));
}
