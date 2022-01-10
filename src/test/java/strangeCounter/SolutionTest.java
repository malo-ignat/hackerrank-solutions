package strangeCounter;

import strangeCounter.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolution1() {
        assertEquals(6L, Solution.strangeCounter(4L));
    }
}