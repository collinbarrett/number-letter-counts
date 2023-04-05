from main import number_letter_counts, number_letter_count
import unittest
from unittest.runner import TextTestResult

class NumberLetterCount(unittest.TestCase):
    def test_one(self):
        self.assertEqual(number_letter_count(1),3)

    def test_two(self):
        self.assertEqual(number_letter_count(2),3)

    def test_three(self):
        self.assertEqual(number_letter_count(3),5)

    def test_four(self):
        self.assertEqual(number_letter_count(4),4)

    def test_five(self):
        self.assertEqual(number_letter_count(5),4)

    def test_eight(self):
        self.assertEqual(number_letter_count(8),5)

    def test_twelve(self):
        self.assertEqual(number_letter_count(12),6)

    def test_twenty(self):
        self.assertEqual(number_letter_count(20),6)

    def test_twenty_five(self):
        self.assertEqual(number_letter_count(25),10)

    def test_forty(self):
        self.assertEqual(number_letter_count(40),5)

    def test_ninety_nine(self):
        self.assertEqual(number_letter_count(99),10)

    # English can be ambiguous with writing/spelling numbers above one hundred
    # For this exercise, use the normalized spelling of 'Y hundred and Y' in all applicable cases

    def test_one_hundred(self):
        self.assertEqual(number_letter_count(100),10)

    def test_one_hundred_and_one(self):
        self.assertEqual(number_letter_count(101),16)

    def test_two_hundred_and_ninety_nine(self):
        self.assertEqual(number_letter_count(299),23)

    def test_three_hundred(self):
        self.assertEqual(number_letter_count(300),12)

    def test_nine_hundred_and_seventy_five(self):
        self.assertEqual(number_letter_count(975),25)

    def test_one_thousand(self):
        self.assertEqual(number_letter_count(1000),11)


class NumberLetterCounts(unittest.TestCase):
    def test_to_five(self):
        self.assertEqual(number_letter_counts(1,5),19)

    def test_to_ten(self):
        self.assertEqual(number_letter_counts(1,10),39)

    def test_to_twenty(self):
        self.assertEqual(number_letter_counts(1,20),112)

    def test_to_fifty(self):
        self.assertEqual(number_letter_counts(1,50),389)

    def test_to_one_hundred(self):
        self.assertEqual(number_letter_counts(1,100),864)

    def test_to_three_hundred(self):
        self.assertEqual(number_letter_counts(1,300),5168)

    def test_to_one_thousand(self):
        self.assertEqual(number_letter_counts(1,1000),21124)

class TextTestResultWithSuccesses(TextTestResult):
    def __init__(self, *args, **kwargs):
        super(TextTestResultWithSuccesses, self).__init__(*args, **kwargs)
        self.successes = []
    def addSuccess(self, test):
        super(TextTestResultWithSuccesses, self).addSuccess(test)
        self.successes.append(test)

if __name__ == '__main__':
    loader = unittest.TestLoader()
    tests = loader.discover('.')
    testRunner = unittest.runner.TextTestRunner(resultclass=TextTestResultWithSuccesses)
    testResult = testRunner.run(tests)
    print()
    for t in testResult.successes:
        print("SUCCESS",t)
