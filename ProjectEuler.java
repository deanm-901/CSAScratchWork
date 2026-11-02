public class ProjectEuler {
    public static long pow(long num, long pow) {
        long sum = num;
        for (int i=1;i<pow;i++) {
            sum *= num;
        }
        return sum;
    }
    
    // sum of the square of odd numbers with bad calculus (not correct)
    public static long problem0(int num_amm) {
        return pow(1+2*(int)(num_amm/2), 3)/6;
    }

    // sum of the square of odd numbers without calculus (correct)
    public static long problem0_nocalc(int num_amm) {
        long sum = 0;
        for (long i=0;i<num_amm;i++) {
            if (i%2 == 0) continue;

            sum += pow(i, 2);
        }
        return sum;
    }

    // sum of multiples of 3 or 4
    public static long problem1(int num) {
        long sum = 0;
        for (int i=0;i<num;i++) {
            if (i%3==0 || i%5==0) sum += i;
        }
        return sum;
    }

    // sum of even fibbonacci numbers
    public static long problem2(int max) {
        long last = 1;
        long swap = 1;
        long now  = 1;
        
        long sum = 0;
        while (now < max) {
            swap = last;
            last = now;
            now += swap;

            if (now % 2 == 0) sum += now;
        }

        return sum;
    }

    // prime factors
    public static long problem3(int number) {

    }

    public static void main(String[] args) {
        System.out.println("Register problem: "+problem0_nocalc(643000));
        System.out.println("Problem 1: "+problem1(1000));
        System.out.println("Problem 2: "+problem2(4000000));
    }
}