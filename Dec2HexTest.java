import org.junit.Before;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;


public class Dec2HexTest {
    public Dec2HexTest()
    {

    }
    Dec2Hex dec2Hex;

    @Before
    public void setup() {
        dec2Hex = new Dec2Hex();
    }
    @Test
    public void testConvert() {
        assertEquals("message", 11, 11);
    }

}
