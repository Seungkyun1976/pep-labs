import org.junit.Assert;

public class Parrot {
    /**
     * @param p 
     * 
     */
    public void parrotTestHello(Parrot p){
        String input = "hello";
        String expected = "hello";
        String actual = p.copy(input);
        Assert.assertEquals(expected, actual);
    }    
    /**
     * This method should return whatever String was passed into it by whatever invoked it (in this case, the test),
     * instead of returning "return text please!"
     *
     * for example:
     * String str = copy("hello");
     * System.out.println(str); -> prints out "hello"
     *
     * @param text is a parameter passed into this method by whatever called it.
     * @return text.
     */
    public String copy(String text){
        return "return text please!";
    }
}