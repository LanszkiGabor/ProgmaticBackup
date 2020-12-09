package _1119_Fogoly;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrejudiceTest {

    Snitch snitch;
    Prejudice prejudice;
    Godfather godfather;

    @Before
    public void setUp() throws Exception {
        prejudice = new Prejudice();
        snitch = new Snitch();
        godfather = new Godfather();
        prejudice.setPunishment(snitch,3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void confess() {
        prejudice.setPunishment(snitch,3);
        prejudice.setPunishment(godfather,0);
        boolean answer = prejudice.confess(godfather);
        Assert.assertEquals(true,answer);
    }

    @Test
    public void godfatherConfess(){
        prejudice.setPunishment(godfather,0);
        boolean answer = prejudice.confess(godfather);
        assertEquals(true,answer);
    }
}
