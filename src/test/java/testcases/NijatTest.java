package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NijatTest {

    @Test
    public void test_case_five() {
        Assert.assertEquals(10, 11);
        // error fix code here
    }

    @Test
    public void test_case_six() {
        // comment1
        Assert.assertEquals(10, 11);
    }

    @Test
    public void test_case_seven() {
        // comment2
        Assert.assertEquals(10, 11);
    }

    @Test
    public void test_case_eight() {
        // comment3
        Assert.assertEquals(10, 11);
    }
}
