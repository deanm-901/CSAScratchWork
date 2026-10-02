public class StringFun {
    public static void main(String[] args) {
        // initialize string
        String s = "Hello";

        // catination operator -- String + String
        String sw = s + " World!";

        // .length() func -- returns length (wow!)
        int len = s.length(); // len=5

        // .indexOf(char)
        int i = s.indexOf('l'); // i=2

        // .compareTo(String) -- I am never using this
        int c = s.compareTo("World"); 

        // .equals(String) -- Becuase String is a reference to memory, you need to use .equals(), not '=='
        boolean q = s.equals("Hello");

        // .substring(int index, int stopIndex)
        String llo = s.substring(2,5);
    }
}