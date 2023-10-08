package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import main.java.tasks.SolutionIfElse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionIfElseTest {

    private SolutionIfElse solutionIfElse;

    @Before
    public void setUp(){
        solutionIfElse = new SolutionIfElse();
    }

    @Test//нечетное
    public void testFirstOdd(){
        Assert.assertEquals(solutionIfElse.solutionIfElse(3),"Weird");
    }

    @Test//Чет в диапазоне 2 - 5
    public void testSecondEven2_5(){
        Assert.assertEquals(solutionIfElse.solutionIfElse(2),"Not Weird");
        Assert.assertEquals(solutionIfElse.solutionIfElse(4),"Not Weird");
    }

    @Test//Чет в диапазоне 6 - 20
    public void testSecondEven6_20(){
        Assert.assertEquals(solutionIfElse.solutionIfElse(12),"Weird");
        Assert.assertEquals(solutionIfElse.solutionIfElse(18),"Weird");
    }

    @Test//Чет в диапазоне больше 20
    public void testSecondEvenMore20(){
        Assert.assertEquals(solutionIfElse.solutionIfElse(24),"Not Weird");
        Assert.assertEquals(solutionIfElse.solutionIfElse(100),"Not Weird");
    }
}
