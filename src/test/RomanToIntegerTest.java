package test;

import main.java.tasks.RomanToInteger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @Before
    public void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void firstTest() {
        String s = "III";
        Assert.assertEquals(3, romanToInteger.romanToInt(s));
    }

    @Test
    public void secondTest() {
        String s = "LVIII";
        Assert.assertEquals(58, romanToInteger.romanToInt(s));
    }

    @Test
    public void thirdTest() {
        String s = "MCMXCIV";
        Assert.assertEquals(1994, romanToInteger.romanToInt(s));
    }

    @Test
    public void fourTest() {
        String s = "MMCDXXV";
        Assert.assertEquals(2425, romanToInteger.romanToInt(s));
    }

}
