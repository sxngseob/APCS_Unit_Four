import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Unit_Four_Tests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    @Order(1)
    void HereToThereTestValid() {
        String expected = "-2 -1 0 1 2 3 4 5 6 ";
        String actual = WhileLoops.fromHereToThere(-2, 6);
        assertEquals(expected, actual);
    }

    @Test
    @Order(2)
    void HereToThereTestInvalid() {
        String expected = "Invalid input";
        String actual = WhileLoops.fromHereToThere(6, 5);
        assertEquals(expected, actual);
    }

    @Test
    @Order(3)
    void CountPosAndNegTest() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data/set1.txt"));
        String expected = "There were 8 positive and 6 negative numbers";
        String actual = WhileLoops.countPosAndNeg();
        assertEquals(expected, actual);
    }

    @Test
    @Order(4)
    void FindMinMaxTest1() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data/min_max1.txt"));
        String expected = "Max value is: 0. Min value is: -9";
        String actual = WhileLoops.findMinAndMax();
        assertEquals(expected, actual);
    }

    @Test
    @Order(5)
    void FindMinMaxTest2() throws IOException {
        String[] args = null;
        System.setIn(new FileInputStream("data/min_max2.txt"));
        String expected = "Max value is: 105. Min value is: 99";
        String actual = WhileLoops.findMinAndMax();
        assertEquals(expected, actual);
    }


    @Test
    @Order(10)
    void printingHashTagsTest1() {
        String expected = "##########";
        String actual = ForLoops.printingHashTags(10);
        assertEquals(expected, actual);
    }

    @Test
    @Order(11)
    void printingHashTagsTest2() {
        String expected = "";
        String actual = ForLoops.printingHashTags(-1);
        assertEquals(expected, actual);
    }

    @Test
    @Order(12)
    void countDownTest1() {
        String expected = "4 3 2 1 0 -1 -2 -3 -4 ";
        String actual = ForLoops.countDown(4, -4);
        assertEquals(expected, actual);
    }

    @Test
    @Order(13)
    void countDownTest2() {
        String expected = "-1 -2 -3 -4 -5 -6 -7 -8 ";
        String actual = ForLoops.countDown(-8, -1);
        assertEquals(expected, actual);
    }

    @Test
    @Order(18)
    void printTheLettersTest() {
        String expected = "A-P-C-S-A";
        String actual = StringProblems.addHyphens("APCSA");
        assertEquals(expected, actual);
    }

    @Test
    @Order(19)
    void printTheLettersTestLower() {
        String expected = "a-l-l-i-g-a-t-o-r";
        String actual = StringProblems.addHyphens("alligator");
        assertEquals(expected, actual);
    }

    @Test
    @Order(20)
    void everyOtherLetterTest() {
        String expected = "Srnsaefn";
        String actual = StringProblems.everyOtherLetter("Strings are fun");
        assertEquals(expected, actual);
    }

    @Test
    @Order(21)
    void differentStringsTest1() {
        String expected = "Brian and Brain are not the same. They differ at letter number 3";
        String actual = StringProblems.differentStrings("Brian", "Brain");
        assertEquals(expected, actual);
    }

    @Test
    @Order(22)
    void differentStringsTest2() {
        String expected = "bookkeeper and boo are not the same. They differ at letter number 4";
        String actual = StringProblems.differentStrings("bookkeeper", "boo");
        assertEquals(expected, actual);
    }

    @Test
    @Order(23)
    void differentStringsTest3() {
        String expected = "java and java are the same";
        String actual = StringProblems.differentStrings("java", "java");
        assertEquals(expected, actual);
    }

    @Test
    @Order(24)
    void differentStringsTest4() {
        String expected = "table and tablet are not the same. They differ at letter number 6";
        String actual = StringProblems.differentStrings("tab", "table");
        assertEquals(expected, actual);
    }

    @Test
    @Order(31)
    void xSquareTest() {
        String expected = "XXXXX\nXXXXX\nXXXXX\nXXXXX\nXXXXX\n";
        String actual = NestedLoops.xSquare(5);
        assertEquals(expected, actual);
    }

    @Test
    @Order(32)
    void flippedTriangleTest() {
        String expected = "*******\n******\n*****\n****\n***\n**\n*\n";
        String actual = NestedLoops.flippedTriangle(7);
        assertEquals(expected, actual);
    }

    @Test
    @Order(33)
    void fizzBuzzTest() {
        String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz\n" +
                "Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz\n" +
                "41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz ";
        String actual;
    }
}


