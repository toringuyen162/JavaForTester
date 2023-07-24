import Solution.Q1Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Q1SolutionTest {
    @Test
    public void testIsPrimeNumberWithValidInput() {
        assertTrue(Q1Solution.isPrimeNumber("2"));
        assertTrue(Q1Solution.isPrimeNumber("3"));
        assertTrue(Q1Solution.isPrimeNumber("5"));
        assertTrue(Q1Solution.isPrimeNumber("7"));
        assertTrue(Q1Solution.isPrimeNumber("11"));
        assertFalse(Q1Solution.isPrimeNumber("1"));
        assertFalse(Q1Solution.isPrimeNumber("4"));
        assertFalse(Q1Solution.isPrimeNumber("9"));
        assertFalse(Q1Solution.isPrimeNumber("15"));
    }

    @Test
    public void testIsPrimeNumberWithInvalidInput() {
        assertFalse(Q1Solution.isPrimeNumber("abc"));
        assertFalse(Q1Solution.isPrimeNumber("12.5"));
        assertFalse(Q1Solution.isPrimeNumber(""));
    }
}
