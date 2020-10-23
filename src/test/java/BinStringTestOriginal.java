import org.junit.jupiter.api.*;
import java.util.Random;

public class BinStringTestOriginal {
    private BinString binString;
	private String[] table = { "", "1", "10", "11", "100", "101", "110", "111", "1000", "1001", "1010" }; // binary numbers 0 - 10

    @BeforeEach
    public void setUp() {
        binString = new BinString();
    }

    @Test
    public void testSumFunction(){

        int expected = 0;
        Assertions.assertEquals(expected, binString.sum(""), "\"\" should be 0");
        expected = 100;
        Assertions.assertEquals(expected, binString.sum("d"), "d should be 100");
        expected = 265;
        Assertions.assertEquals(expected, binString.sum("Add"), "Add should be 265");
    }

    @Test
    public void testBinariseFunction(){

        String expected = "101";
        Assertions.assertEquals(expected, binString.binarise(5), "5 should be 101");

        expected = "11111100";
        Assertions.assertEquals(expected, binString.binarise(252), "252 should be 11111100");
    }

	@RepeatedTest(10)
	public void testBinariseFunctionRandom() {
		Random r = new Random();
		int rando = r.nextInt(51); // random number from 0 to 51
		String bin = binString.binarise(rando);

		for(int i = 0; i < table.length; i++) {
			if (table[i].equals(bin)) {
				Assertions.assertEquals(table[i], bin, "Random number from 1 to 10 to binary converter");
				return;
			}
		}

		if (rando > 10)
			Assertions.assertTrue(rando > 10, "No suport for numbers bigger than 10");
		else
			Assertions.fail("The table array sould be able to handle from 0 to 10 numbers");
	}

    @Test
    public void testTotalConversion(){
        String expected = "1000001";
        Assertions.assertEquals(expected, binString.convert("A"), "A should be 1000001");
    }
}
