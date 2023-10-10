package test;

import main.java.tasks.PalindromeNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void setUp(){
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void testFirst(){
        int number = 121;
        Assert.assertTrue(palindromeNumber.palindromeNumber(number));
    }

    @Test
    public void testFour(){
        int number = 123321;
        Assert.assertTrue(palindromeNumber.palindromeNumber(number));
    }

    @Test
    public void testFive(){
        int number = 567657890;
        Assert.assertFalse(palindromeNumber.palindromeNumber(number));
    }

    @Test
    public void testSecond(){
        int number = 567;
        Assert.assertFalse(palindromeNumber.palindromeNumber(number));
    }

    @Test
    public void testThird(){
        int number = -121;
        Assert.assertFalse(palindromeNumber.palindromeNumber(number));
    }

}
