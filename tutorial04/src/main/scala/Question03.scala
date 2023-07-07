def toUpper(s: String): String = {
    val arr: Array[Char] = new Array[Char](s.length());
    var i = 0;
    for (letter <- s){
        if (letter <= 'z' && letter >= 'a') arr(i) = (letter - 32).toChar;
        else arr(i) = letter;
        i += 1;
    }
    arr.mkString;
}

def toLower(s: String): String = {
    val arr: Array[Char] = new Array[Char](s.length());
    var i = 0;
    for (letter <- s){
        if (letter <= 'Z' && letter >= 'A') arr(i) = (letter + 32).toChar;
        else arr(i) = letter;
        i += 1;
    }
    arr.mkString;
}

def formatNames(name: String)(formatFunction: String => String): String = {
  formatFunction(name);
}

object Question03 extends App{
    println(formatNames("Benny")(toUpper));
    println(formatNames("Ni")(toUpper) + "roshan");
    println(formatNames("S")(toLower) + "aman");
    println("kumar" + formatNames("a")(toUpper));
}
