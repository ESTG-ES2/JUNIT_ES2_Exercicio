import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinStringTestOriginal {
    private BinString binString;

    /**
     * Set's up the binString.
     */
    @BeforeEach
    public void setUp() {
        binString = new BinString();
    }

    /**
     * Tests the {@link BinString#sum(String) sum function}.
     */
    @Test
    public void testSumFunction(){

        String expected = "101";
        assertEquals(expected, binString.binarise(5), "5 should be 101");

        expected = "0";
        assertEquals(expected, binString.binarise(0), "0 should be 0");

        expected = "1";
        assertEquals(expected, binString.binarise(1), "1 should be 1");

        expected = "100";
        assertEquals(expected,binString.binarise(4),"4 should be 100");

        expected = "11111100";
        assertEquals(expected, binString.binarise(252), "252 should be 11111100");
    }

    /**
     * Tests the {@link BinString#binarise(int) binarise function}.
     */
    @Test
    public void testBinariseFunction(){

        String expected = "101";
        Assertions.assertEquals(expected, binString.binarise(5), "5 should be 101");

        expected = "11111100";
        Assertions.assertEquals(expected, binString.binarise(252), "252 should be 11111100");

    }

    /**
     * Tests the {@link BinString#convert(String) convert function}.
     */
    @Test
    public void testTotalConversion(){
        String expected = "1000001";
        Assertions.assertEquals(expected, binString.convert("A"), "A should be 1000001");
    }
}
