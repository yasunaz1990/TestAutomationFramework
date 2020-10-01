package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AliTest {
    @Test
    public void test_case_1(){
        Assert.assertEquals(10, 11);
        // error fix code here
    }
    @Test
    public void test_case_2(){
        Assert.assertEquals(10, 11);
    }
}
