package _1009_Teszt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class _1009_TesztTest {

    @Before
    public void setUp() throws Exception {
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getLastNumber() {
        int lastNumber = _1009_Teszt.getLastNumber(new int[]{1, 2, 3, 6});
        Assert.assertEquals(6, lastNumber);
    }

    @Test
    public void countEvenNumbers() {
        int evenNumbers = _1009_Teszt.countEvenNumbers(new int[]{2, 4, 6, 8});
        Assert.assertEquals(4, evenNumbers);
    }

    @Test
    public void countSameNumbers() {
        int sameNumbers = _1009_Teszt.countSameNumbers(new int[]{2, 3, 4}, new int[]{2, 3, 4, 5});
        assertEquals(3, sameNumbers);
    }

    @Test
    public void matrixTopLeftNumber() {
    }

    @Test
    public void matrixDiagonalDifference() {
    }

    @Test
    public void stairs() {
    }

    @Test
    public void kangaroosMeet() {
        boolean answer = _1009_Teszt.kangaroosMeet(1, 1, 1, 1);
        assertEquals(true, answer);
    }

    @Test
    public void kangaroosMeet2() {
        boolean answer = _1009_Teszt.kangaroosMeet(2, 2, 7, 10);
        assertFalse(answer);
    }

    @Test
    public void findNumber101() {
        int findNumber101 = _1009_Teszt.findNumber101(new int[]{3, 5, 6, 101});
        assertEquals(3, findNumber101);
    }
}
