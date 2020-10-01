package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {


    @Test
    public void test_case1() {
        System.out.println("abcdefg");;
    }

    @Test
    public void test_case2() {
        Assert.assertEquals(11, 11);
    }
}
