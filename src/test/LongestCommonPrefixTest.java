package test;

import main.java.tasks.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @Before
    public void setUp(){
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void firstTest(){
       String [] strs = {"flower","flow","flight"};
       String output =  "fl";
       Assert.assertEquals(longestCommonPrefix.longPrefix(strs), output);
    }

    @Test
    public void secondTest(){
        String [] strs = {"dog","racecar","car"};
        String output =  "";
        Assert.assertEquals(longestCommonPrefix.longPrefix(strs), output);
    }

    @Test
    public void thirdTest(){
        String [] strs = {"ab","a"};
        String output =  "a";
        Assert.assertEquals(longestCommonPrefix.longPrefix(strs), output);
    }

    @Test
    public void fourTest(){
        String [] strs = {"abab","aba",""};
        String output =  "";
        Assert.assertEquals(longestCommonPrefix.longPrefix(strs), output);
    }
}
