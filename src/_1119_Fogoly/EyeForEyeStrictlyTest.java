package _1119_Fogoly;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EyeForEyeStrictlyTest {

    Snitch snitch;
    EyeForEyeStrictly eyeForEyeStrictly;

    @Before
    public void setUp() throws Exception {
        snitch = new Snitch();
        eyeForEyeStrictly = new EyeForEyeStrictly();
        eyeForEyeStrictly.setPunishment(snitch,3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void confess() {
        boolean answer = eyeForEyeStrictly.confess(snitch);
        Assert.assertEquals(true,answer);

        int howManyTimesBetrayedMe = eyeForEyeStrictly.enemy.get(snitch);
        assertEquals(1,howManyTimesBetrayedMe);
    }

    @Test
    public void betrayedTwice(){
        eyeForEyeStrictly.setPunishment(snitch,3);
        int x = eyeForEyeStrictly.enemy.get(snitch);
        assertEquals(2,x);
    }
}
