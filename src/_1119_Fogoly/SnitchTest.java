package _1119_Fogoly;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SnitchTest {

    Snitch snitch = new Snitch();
    Snitch otherSnitch = new Snitch();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void confess() {
        boolean answer = snitch.confess(otherSnitch);
       Assert.assertEquals(true,answer);
    }


}
