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

    @Test
    public void test_case_3(){
        Assert.assertEquals(10, 11);
    }

    @Test
    public void test_case_4(){
        Assert.assertEquals(10, 11);
    }

}
