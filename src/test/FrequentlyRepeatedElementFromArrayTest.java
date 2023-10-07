package test;

import main.java.tasks.FrequentlyRepeatedElementFromArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FrequentlyRepeatedElementFromArrayTest {

    private FrequentlyRepeatedElementFromArray fromArray;

    @Before
    public void setup() {
         fromArray = new FrequentlyRepeatedElementFromArray();
    }

    @Test
    public void testFirst(){
        int [] array2 = {3,2,3};
        Assert.assertEquals(fromArray.frequentlyRepeatedElement(array2), 3);
    }
    @Test
    public void testSecond(){
        int [] array2 = {2,2,1,1,1,2,2};
        Assert.assertEquals(fromArray.frequentlyRepeatedElement(array2), 2);
    }

    @Test
    public void testThird(){
        int [] array2 = {1,2,3,4,5,6,6,7,7,7,1,1,1,1};
        Assert.assertEquals(fromArray.frequentlyRepeatedElement(array2), 1);
    }
}
