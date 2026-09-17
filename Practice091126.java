import java.util.Random;
import java.util.Scanner;

public class Practice091126 {
    public static final String[] knownTypes = {
        "spaghetti",
        "fettuccine",
        "linguine",
        "penne",
        "rigatoni",
        "rotini",
        "fusilli",
        "farfalle",
        "orzo",
        "lasagna",
    };
    public static final String[] exclamations = {
        " crunch!",
        " yum!",
        " tastes good!",
        " mmm!",
        " tastes pasta-y!",
    };

    public String type;
    public int bitesLeft;
    public boolean hasSauce;
    public boolean isKnownType;
    public double servingWeight;

    public void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wow! You come home and in your kitchen is a mysterious hot, ready to eat pot of pasta.");
        System.out.print("What is the type of pasta that you see?\n >");
        type = scanner.nextLine();

        isKnownType = false;        
        for (int i = 0; i < knownTypes.length; i++) {
            if (knownTypes[i].equals(type.toLowerCase())) {
                isKnownType = true;
            }
        }

        System.out.println(isKnownType ? "Nice. Some good old "+type+"." : "You are suprised by the unique type of pasta.");
        
        servingWeight = 5.0 + (random.nextDouble() * (40.0-5.0));
        
        System.out.println("After you grab a plate and place down "+String.valueOf(servingWeight)+" grams worth of serving size, you wonder if");
        System.out.print("you want to add some of the mysterious sauce that's right next to the mysterious pasta. Do you? (Y/n)\n >");
        String answer = scanner.nextLine();

        hasSauce = !(answer.equals("n") || answer.equals("no") || answer.equals("N") || answer.equals("No"));

        System.out.println(hasSauce ? "Awesome. Some good old sauce on some good old "+type+"." : "that's fine, no sauce is good.");

        bitesLeft = (int) servingWeight/5;

        while (bitesLeft > 0) {
            System.out.println("You have "+String.valueOf(bitesLeft)+" bites left.");

            System.out.print("How many bites do you want to take?\n >");

            bitesLeft -= scanner.nextInt();

            System.out.println(exclamations[random.nextInt(exclamations.length)]);
        }

        int roll = random.nextInt(20);
        if (roll <= 5 || !hasSauce) {
            System.out.println("Argh!! I've been poisoned and also got the bad ending!! Try again for the good ending?");
        } else {
            System.out.println("Yum! I ate the yummy mysterious pasta and also got the good ending! Play again for the bad ending?");
        }
    }
}