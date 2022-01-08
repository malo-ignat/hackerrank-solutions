package biggerIsGreater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSolution1() {
        assertEquals("ba", Solution.biggerIsGreater("ab"));
    }

    @Test
    void testSolution2() {
        assertEquals("no answer", Solution.biggerIsGreater("bb"));
    }

    @Test
    void testSolution3() {
        assertEquals("hegf", Solution.biggerIsGreater("hefg"));
    }

    @Test
    void testSolution4() {
        assertEquals("dhkc", Solution.biggerIsGreater("dhck"));
    }

    @Test
    void testSolution5() {
        assertEquals("hcdk", Solution.biggerIsGreater("dkhc"));
    }
}