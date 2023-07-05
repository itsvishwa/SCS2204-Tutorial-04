def interest(amount: Double) = amount match {
    case x if x <= 20000 => x * 0.02;
    case x if x <= 200000 => x * 0.04;
    case x if x <= 2000000 => x * 0.035;
    case _ => amount * 0.065;
}


object Question01 extends App{
    printf(f"Interset for Rs.4 000 000 = Rs. %%.2f", interest(4000000.0));
}
