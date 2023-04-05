import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import matchers.should._

class NumberLetterCountsSpec extends AnyFlatSpec with Matchers {
    "numberLetterCounts()" should 
        "count the letters in 1-5" in {
            Main.numberLetterCounts(1,5) shouldEqual 19
        }
        it should "count the letters in 1-10" in {
            Main.numberLetterCounts(1,10) shouldEqual 39        
        }
        it should "count the letters in 1-20" in {
            Main.numberLetterCounts(1,20) shouldEqual 112        
        }
        it should "count the letters in 1-50" in {
            Main.numberLetterCounts(1,50) shouldEqual 389        
        }
        it should "count the letters in 1-100" in {
            Main.numberLetterCounts(1,100) shouldEqual 864        
        }
        it should "count the letters in 1-300" in {
            Main.numberLetterCounts(1,300) shouldEqual 5168        
        }
        it should "count the letters in 1-1000" in {
            Main.numberLetterCounts(1,1000) shouldEqual 21124        
        }
}

class NumberLetterCountSpec extends AnyFlatSpec with Matchers {
    "numberLetterCount()" should 
        "count the letters in 'eight''" in {
            Main.numberLetterCount(8) shouldEqual 5
        }
        it should "count the letters in 'twelve'" in {
            Main.numberLetterCount(12) shouldEqual 6
        }
        it should "count the letters in 'twenty'" in {
            Main.numberLetterCount(20) shouldEqual 6
        }
        it should "count the letters in 'twenty-five'" in {
            Main.numberLetterCount(25) shouldEqual 10
        }
        it should "count the letters in 'forty'" in {
            Main.numberLetterCount(40) shouldEqual 5
        }
        it should "count the letters in 'ninety-nine'" in {
            Main.numberLetterCount(99) shouldEqual 10
        }

        /*
         All numbers 100 and above are spelled out regularly with 'and' in the form:
         one hundred 
         one hundred and one
         one hundred and two
         ...
         one hundred and twenty
         one hundred and twenty-one
         one hundred and ninety-nine
         two hundred
         */

        it should "count the letters in 'one hundred'" in {
            Main.numberLetterCount(100) shouldEqual 10
        }
        it should "count the letters in 'one hundred and one'" in {
            Main.numberLetterCount(101) shouldEqual 16
        }
        it should "count the letters in 'two hundred and ninety-nine'" in {
            Main.numberLetterCount(299) shouldEqual 23
        }
        it should "count the letters in 'three hundred'" in {
            Main.numberLetterCount(300) shouldEqual 12
        }
        it should "count the letters in 'nine hundred and seventy-five'" in {
            Main.numberLetterCount(975) shouldEqual 25
        }
        it should "count the letters in 'one thousand'" in {
            Main.numberLetterCount(1000) shouldEqual 11
        }
}