

public class HelloWorldTest {
    HelloWorld hw = new HelloWorld();
    
    /**
     * Method sayHello() must return "Hello, World!". The trim method will remove any extra spaces or newlines at the end.
     */
    @Test
    public void helloTest(){
        String expected = "Hello, world!";
        String actual = hw.HelloWorld().trim();
        Assert.assertEquals(expected,actual);
        System.out.println("Hello World!");

    }

    public void setHw(HelloWorld hw) {
        this.hw = hw;
    }
   

}
return = HelloWorld;
