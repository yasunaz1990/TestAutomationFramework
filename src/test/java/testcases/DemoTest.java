package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {


    @Test
    public void test_case1() {
        Assert.assertEquals(10, 10);
    }

    @Test
    public void test_case2() {
        Assert.assertEquals(11, 11);
    }
}
