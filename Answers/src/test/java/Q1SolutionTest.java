import Solution.Q1Solution;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Q1SolutionTest {
    @Test(expectedExceptions = NumberFormatException.class)
    void tc1() {
        Q1Solution.isPrimeNumber("11.5");
    }
}
