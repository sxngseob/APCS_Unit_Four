import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhileLoopsTests {

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
    void HereToThereTestValid() {
        String expected = "-2 -1 0 1 2 3 4 5 6 ";
        String actual = WhileLoops.fromHereToThere(-2, 6);
        assertEquals(expected, actual);
    }

    @Test
    void HereToThereTestInvalid() {
        String expected = "Invalid input";
        String actual = WhileLoops.fromHereToThere(6, 5);
        assertEquals(expected, actual);
    }

    @Test
    void CountPosAndNegTest() throws IOException {
        System.setIn(new FileInputStream("data/set1.txt"));
        String expected = "There were 8 positive and 6 negative numbers";
        String actual = WhileLoops.countPosAndNeg();
        assertEquals(expected, actual);
    }

    @Test
    void FindMinMaxTest1() throws IOException {
        System.setIn(new FileInputStream("data/min_max1.txt"));
        String expected = "Max value is: 0. Min value is: -9";
        String actual = WhileLoops.findMinAndMax();
        assertEquals(expected, actual);
    }

    @Test
    void FindMinMaxTest2() throws IOException {
        System.setIn(new FileInputStream("data/min_max2.txt"));
        String expected = "Max value is: 105. Min value is: 99";
        String actual = WhileLoops.findMinAndMax();
        assertEquals(expected, actual);
    }

    @Test
    void factorComposite() {
        String expected = "The factors of 24 are: 1 2 3 4 6 8 12 24 ";
        String actual = WhileLoops.factors(24);
        assertEquals(expected, actual);
    }

    @Test
    void factorPrime() {
        String expected = "The factors of 13 are: 1 13 ";
        String actual = WhileLoops.factors(13);
        assertEquals(expected, actual);
    }

    @Test
    void factorSquare() {
        String expected = "The factors of 25 are: 1 5 25 ";
        String actual = WhileLoops.factors(25);
        assertEquals(expected, actual);
    }

//    @Test
//    void gradePointTest1() throws IOException {
//        System.setIn(new FileInputStream("data/grades1.txt"));
//        double expected = 2.57;
//        double actual = WhileLoops.gradePoint();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void gradePointTest2() throws IOException {
//        System.setIn(new FileInputStream("data/grades2.txt"));
//        double expected = 2.43;
//        double actual = WhileLoops.gradePoint();
//        assertEquals(expected, actual);
//    }
}
