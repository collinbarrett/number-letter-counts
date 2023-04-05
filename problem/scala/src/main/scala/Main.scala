object Main {
    def main(args: Array[String]): Unit = args match {
        case Array(min,max) =>
            println(numberLetterCounts(min.toInt,max.toInt))
        case _ =>
            println("please provide a minimum and maximum value for search")
    }

    def numberLetterCounts(min:Int, max:Int):Int = ???

    def numberLetterCount(i:Int):Int = ???
}