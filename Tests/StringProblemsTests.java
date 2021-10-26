import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringProblemsTests {

    @Test
    void addHyphensTest() {
        String expected = "A-P-C-S-A";
        String actual = StringProblems.addHyphens("APCSA");
        assertEquals(expected, actual);
    }

    @Test
    void addHyphensTestLower() {
        String expected = "a-l-l-i-g-a-t-o-r";
        String actual = StringProblems.addHyphens("alligator");
        assertEquals(expected, actual);
    }

    @Test
    void everyOtherLetterTest() {
        String expected = "Srnsaefn";
        String actual = StringProblems.everyOtherLetter("Strings are fun");
        assertEquals(expected, actual);
    }

    @Test
    void differentStringsTest1() {
        String expected = "Brian and Brain are not the same. They differ at letter number 3";
        String actual = StringProblems.differentStrings("Brian", "Brain");
        assertEquals(expected, actual);
    }

    @Test
    void differentStringsTest2() {
        String expected = "bookkeeper and boo are not the same. They differ at letter number 4";
        String actual = StringProblems.differentStrings("bookkeeper", "boo");
        assertEquals(expected, actual);
    }

    @Test
    void differentStringsTest3() {
        String expected = "wildebeest and wildebeest are the same";
        String actual = StringProblems.differentStrings("wildebeest", "wildebeest");
        assertEquals(expected, actual);
    }

    @Test
    void differentStringsTest4() {
        String expected = "table and tablet are not the same. They differ at letter number 6";
        String actual = StringProblems.differentStrings("table", "tablet");
        assertEquals(expected, actual);
    }

//    @Test
//    void isPalindromeTrue() {
//        assertTrue(StringProblems.isPalindrome("kayak"));
//        assertTrue(StringProblems.isPalindrome("Was it a car or a cat I saw"));
//    }
//
//    @Test
//    void isPalindromeFalse() {
//        assertFalse(StringProblems.isPalindrome("stressed"));
//        assertFalse(StringProblems.isPalindrome("A man a plan a canal nam a"));
//    }
}
