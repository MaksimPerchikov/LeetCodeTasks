package test;

import main.java.tasks.mergeTwoSortList.IsValid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsValidTest {

    private IsValid isValid;

    @Before
    public void setUp(){
        isValid = new IsValid();
    }

    @Test
    public void testFirst(){
        String s = "()";
        Assert.assertTrue(String.valueOf(true),isValid.isValidMethod(s));
    }

    @Test
    public void testSecond(){
        String s = "()[]{}";
        Assert.assertTrue(String.valueOf(true),isValid.isValidMethod(s));

    }

    @Test
    public void testThird(){
        String s = "(]";
        Assert.assertFalse(String.valueOf(false),isValid.isValidMethod(s));

    }

    @Test
    public void testFour(){
        String s = "([)]";
        Assert.assertFalse(String.valueOf(false),isValid.isValidMethod(s));

    }
}
