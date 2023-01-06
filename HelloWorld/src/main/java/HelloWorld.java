
public class HelloWorld {
    public static void main(String[] args){
        System.out.println(extracted());
    }
    /**
     * This method must return a hello world String, instead of returning "change me".
     * A test case will check if the behavior is as expected.
     * You can use the test results to check for differences.
     * @return "Hello, world!"
     */
    public String sayHello(){
        return extracted();
    }
    private static String extracted() {
        return "Hello, World!";
    }
}