/**
 * This class is used to convert string or integer values to binary.
 */
public class BinString {
    /**
     * Returns the binary representation of the string given as parameter.
     * The binary representation is a String.
     *
     * @param s String to be converted.
     * @return the binary representation of the string given as parameter.
     */
    public String convert(String s) {
        return binarise(sum(s));
    }

    /**
     * Returns the binary representation of the string given as parameter.
     * The binary representation is an integer value.
     *
     * @param s String to be converted to binary.
     * @return The binary representation of the string.
     */
    public int sum(String s) {
        if (s.equals("")){
            return 0;
        }
        if (s.length() == 1){
            return (s.charAt(0));
        }
        return ((s.charAt(0))) + sum(s.substring(1));
    }

    /**
     * Returns the String binary representation of the parameter.
     *
     * @param x The number to be converted to binary
     * @return the String binary representation of x.
     */
    public String binarise(int x) {
        if (x == 0){
            return "0";
        }
        if(x == 1){
            return "1";
        }

        if(x % 2 == 0) {
            return binarise(x / 2) + "0";
        }
        return binarise(x / 2) + "1";
    }
}
