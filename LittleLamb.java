public class LittleLamb {
    static void marysPet(String petName) {
        System.out.print(petName + ", ");
    }
    static void marysPet(String petName, String punctuation) {
        System.out.print(petName + punctuation);
    }

    public static void main(String[] args) {
        System.out.print("Mary had a ");
        for (int i = 0; i < 2; i++) {
            marysPet("honey-baked ham");
        }
        marysPet("honey-baked ham", ".");
        System.out.print("\n");
    }
}