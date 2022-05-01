import static org.junit.Assert.*;
import org.junit.*;

public class StringOperationsTest {
    
    @Test
    public void printStringTest() {
        StringOperations s1 = new StringOperations();
        assertEquals("hello", s1.printString("hello"));

    }
}
