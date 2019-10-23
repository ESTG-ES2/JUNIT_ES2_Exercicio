public class BinString {

    public String convert(String s) {
        return binarise(sum(s));
    }

    public int sum(String s) {
        if (s == "")
            return 0;
        if (s.length() == 1)
            return ((int) s.charAt(0));

        return (((int) s.charAt(0))) + sum(s.substring(1));
    }

    public String binarise(int x) {
        StringBuilder string = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int length;

        if (x == 0)
            return "";

        if (x < 2)
            length = 1;
        else if (x < 4)
            length = 2;
        else if (x < 8)
            length = 3;
        else if (x < 16)
            length = 4;
        else if (x < 32)
            length = 5;
        else if (x < 64)
            length = 6;
        else if (x < 128)
            length = 7;
        else
            length = 8;

        for (int i = 0; i < length; i++) {
            if (x % 2 == 1)
                string.append("1");
            else
                string.append("0");
            x /= 2;
        }

        for (int i = length - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }
}
