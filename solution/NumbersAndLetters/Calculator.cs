using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Net.Mime.MediaTypeNames;

namespace NumbersAndLetters
{
    public static class Calculator
    {
        public static int CalculateLetterCount(int lower = 1, int upper = 2)
        {
            // generate a list of all the numbers
            var numbers = Enumerable.Range(lower, upper - lower + 1);


            // convert to text

            var dictionary = new Dictionary<int, string>()
            {
                { 1, "one" },
                { 2, "two" },
                { 3, "Three" },
                { 4, "Four" },
                { 5, "Five" },
                { 6, "Six" },
                { 7, "Seven" },
                { 8, "Eight" },
                { 9, "Nine" },
                { 10, "Ten" },
                { 11, "eleven" },
                { 12, "twelve" },
                { 13, "thirteen" },
                { 14, "fourteen" },
                { 15, "fifteen" },
                { 16, "sixteen" },
                { 17, "seventeen" },
                { 18, "eighteen" },
                { 19, "nineteen" },
                { 20, "twenty" },
                { 30, "thirty" },
                { 40, "forty" },
                { 50, "fifty" },
                { 60, "sixty" },
                { 70, "seventy" },
                { 80, "eighty" },
                { 90, "ninety" },
                { 100, "hundred" },
                { 1000, "thousand" }




            };

            var list = string.Empty;
            var listObj = new List<string>();
            foreach (var number in numbers)
            {
                if (number <= 20 || (number <= 100 && number % 10 == 0))
                {
                    var text = dictionary[number];
                    list += text;
                    listObj.Add(text);
                }

                else if (number > 20 && number < 100 && number % 10 != 0)
                {
                    var tens = number / 10;
                    var ones = number % 10;
                    var tensText = dictionary[tens * 10];
                    var onesText = dictionary[ones];
                    list += tensText + onesText;
                    listObj.Add(tensText + onesText);
                    continue;
                }

                else if (number >= 100 && number < 1000)
                {
                    var hundreds = number / 100;
                    var ones = number % 10;
                    var tens = number % 100 - ones;
                    var hundredsText = dictionary[hundreds] + dictionary[100];
                    var tensText = tens != 0 ?  dictionary[tens] : string.Empty;
                    var onesText = ones != 0 ? dictionary[ones] : string.Empty;
                    list += hundredsText + tensText + onesText;
                    if (tensText != String.Empty || onesText != String.Empty)
                    {
                        list += "and";
                        listObj.Add("and");
                    }
                    listObj.Add(hundredsText + tensText + onesText);
                    continue;
                }
            }

            // count
            return list.Length;

        }
    }
}
