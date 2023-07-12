import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void homeTestReturnClass() {
        Example example = new Example();
        assertEquals(example.home().getClass(), String.class);
    }

    @Test
    public void homeTestValue() {
        Example example = new Example();
        assertEquals(example.home(), "Hello World - v3!");
    }

//    @Test
//    public void testAppMain() {
//        Example.main(new String[] {});
//    }

}