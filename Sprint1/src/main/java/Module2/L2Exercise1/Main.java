package Module2.L2Exercise1;

public class Main {
    public static void main(String[] args) {
        byte b = Entry.readByte("Introduce a number between -128 and 127.");
        System.out.println(b);

        int i = Entry.readInt("Introduce a number, not greater than 2147483647 and not smaller than -2147483648.");
        System.out.println(i);

        float f = Entry.readFloat("Introduce a float number.");
        System.out.println(f);

        double d = Entry.readDouble("Introduce a double number.");
        System.out.println(d);

        char c = Entry.readChar("Please Introduce a single character.");
        System.out.println(c);

        String str = Entry.readString("Please introduce a String.");
        System.out.println(str);

        boolean bool = Entry.readYesNo("Type 'y' for true or 'n' for flase.");
        System.out.println(bool);
    }
}
