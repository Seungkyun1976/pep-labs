
import org.junit.Assert;
import org.junit.test

public class HelloWorld {
    HelloWorld hw = new HelloWorld();
    @Test
    public void HhelloTest(){
        string expected = "Hello, World!";
        string actual = hw.sayhello().trim();
        Assert.assertEquals(expected,actual);
    }
    /**
     * This method must return a hello world String, instead of returning "change me".
     * A test case will check if the behavior is as expected.
     * You can use the test results to check for differences.
     * @return "Hello, world!"
     */
