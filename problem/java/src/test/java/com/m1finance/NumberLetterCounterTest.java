package com.m1finance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.m1finance.NumberLetterCounter.numberLetterCount;
import static com.m1finance.NumberLetterCounter.numberLetterCounts;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberLetterCounterTest {

    @Nested
    class BasicNumbersTests {

        @Test
        @DisplayName("should count the letters in 'eight'")
        void countEight() {
            assertEquals(numberLetterCount(8), 5);
        }

        @Test
        @DisplayName("should count the letters in 'twelve'")
        void countTwelve() {
            assertEquals(numberLetterCount(12), 6);
        }

        @Test
        @DisplayName("should count the letters in 'twenty'")
        void countTwenty() {
            assertEquals(numberLetterCount(20), 6);
        }

        @Test
        @DisplayName("should count the letters in 'twenty-five'")
        void countTwentyFive() {
            assertEquals(numberLetterCount(25), 10);
        }

        @Test
        @DisplayName("should count the letters in 'forty'")
        void countForty() {
            assertEquals(numberLetterCount(40), 5);
        }

        @Test
        @DisplayName("should count the letters in 'ninety-nine'")
        void countNinetyNine() {
            assertEquals(numberLetterCount(99), 10);
        }
    }

    @Nested
    class NumbersWithAndTests {
        /**
         * All numbers 100 and above are spelled out regularly with 'and' in the form:
         * one hundred
         * one hundred and one
         * one hundred and two
         * ...
         * one hundred and twenty
         * one hundred and twenty-one
         * one hundred and ninety-nine
         * two hundred
         */
        @Test
        @DisplayName("should count the letters in 'one hundred'")
        void countOneHundred() {
            assertEquals(numberLetterCount(100), 10);
        }

        @Test
        @DisplayName("should count the letters in 'one hundred and one'")
        void countOneHundredAndOne() {
            assertEquals(numberLetterCount(101), 16);
        }

        @Test
        @DisplayName("should count the letters in 'two hundred and ninety-nine'")
        void countTwoHundredAndNinetyNine() {
            assertEquals(numberLetterCount(299), 23);
        }

        @Test
        @DisplayName("should count the letters in 'three hundred'")
        void countThreeHundred() {
            assertEquals(numberLetterCount(300), 12);
        }

        @Test
        @DisplayName("should count the letters in 'nine hundred and seventy-five'")
        void countNineSeventyFive() {
            assertEquals(numberLetterCount(975), 25);
        }

        @Test
        @DisplayName("should count the letters in 'one thousand'")
        void countNinetyNine() {
            assertEquals(numberLetterCount(1000), 11);
        }
    }

    @Nested
    class RangeTests {

        @Test
        @DisplayName("should count the letters in 1-5")
        void countOneToFive() {
            assertEquals(numberLetterCounts(1, 5), 19);
        }

        @Test
        @DisplayName("should count the letters in 1-10")
        void countOneToTen() {
            assertEquals(numberLetterCounts(1, 10), 39);
        }

        @Test
        @DisplayName("should count the letters in 1-20")
        void countOneToTwenty() {
            assertEquals(numberLetterCounts(1, 20), 112);
        }

        @Test
        @DisplayName("should count the letters in 1-50")
        void countOneToFifty() {
            assertEquals(numberLetterCounts(1, 50), 389);
        }

        @Test
        @DisplayName("should count the letters in 1-100")
        void countOneToOneHundred() {
            assertEquals(numberLetterCounts(1, 100), 864);
        }

        @Test
        @DisplayName("should count the letters in 1-300")
        void countOneToThreeHundred() {
            assertEquals(numberLetterCounts(1, 300), 5168);
        }

        @Test
        @DisplayName("should count the letters in 1-1000")
        void countOneToOneThousand() {
            assertEquals(numberLetterCounts(1, 1000), 21124);
        }
    }
}
