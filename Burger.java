public class Burger {
    // instance variables
    int numPatties;
    int size;
    boolean tasty;
    double sauceAmm; // in grams
    String name;

    boolean eaten = false;
    int bites = 0;

    // constructors
    public Burger() {
        numPatties = 1;
        tasty = true;
        sauceAmm = 5.0;
        name = "Craig the Burger";
        size = 5;
    }
    public Burger(int numPatties, int size, boolean tasty, double sauceAmm, String name) {
        this.numPatties = numPatties;
        this.size       = size;
        this.tasty      = tasty;
        this.sauceAmm   = sauceAmm;
        this.name       = name;
    }

    // methods
    public void Bite() {
        System.out.println("Chomp!!");
        bites++;

        if (bites >= size) {
            System.out.println(tasty?"That was a good burger!":"Yuck! That sucked!");
            eaten = true;
        }
    }

    public int GetBites() {return bites;}

    public static String GetRecipe() {return "Cook burger, put on bun, add condiments";}

    public static void main(String[] args) {
        Burger burg1 = new Burger();
        Burger burg2 = new Burger(2, 3, false, 15.0, "Bob");

        burg1.Bite();
        burg1.Bite();
        burg1.Bite();
        burg1.Bite();
        burg1.Bite();

        burg2.Bite();
        burg2.Bite();
        burg2.Bite();

        System.out.println("burg1 bites: "+burg1.GetBites());
        System.out.println("burg2 bites: "+burg2.GetBites());

        System.out.println("Recipe: "+Burger.GetRecipe());
    }
}