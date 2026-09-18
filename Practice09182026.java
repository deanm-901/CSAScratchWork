public class Practice09182026 {
    public static void main(String[] args) {
        /*
            Casting
        */
        
        System.out.println(3/4);
        // prints out 0
        System.out.println(3.0/4);
        //prints out 0.75

        System.out.println((double) 3/4); // Casting!
        //prints out 0.75
        System.out.println((int) 3.0/4); // double -> int
        //prints out 0

        double numberToRound = 3.4999;
        // (Math.floor() instead of casting for negative numbers to work)
        int roundedNumber = (int)(numberToRound + 0.5);
        System.out.println(roundedNumber);

        /*
            Maximums and Minimums
        */

       System.out.println(Integer.MAX_VALUE); // 2^31

       int bigNumber = Integer.MAX_VALUE + 1;
       System.out.println(bigNumber); // Overflow!
    }
}