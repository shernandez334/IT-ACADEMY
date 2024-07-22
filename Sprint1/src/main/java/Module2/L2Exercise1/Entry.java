package Module2.L2Exercise1;

import  java.util.InputMismatchException;
import java.util.Scanner;


public class Entry extends Exception {
    static Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        System.out.println(message);

        byte b = ' ';
        boolean validInput = false;
        while (!validInput) {
            try {
                b = scanner.nextByte();
                validInput = true;
            } catch (InputMismatchException err) {
                System.out.println("Invalid Input." + "\n" + message);
                scanner.next();
            }
        }
        return b;
    }

    public static int readInt(String message) {
        System.out.println(message);

        int i = ' ';
        boolean validInput = false;
        while (!validInput) {
            try {
                i = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException err) {
                System.out.println("Invalid Input." + "\n" + message);
                scanner.next();
            }
        }
        return i;
    }

    public static float readFloat(String message) {
        System.out.println(message);

        float f = ' ';
        boolean validInput = false;
        while (!validInput) {
            try {
                f = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException err) {
                System.out.println("Invalid Input." + "\n" + message);
                scanner.next();
            }
        }
        return f;
    }

    public static double readDouble(String message) {
        System.out.println(message);

        boolean validInput = false;
        double d = ' ';
        while (!validInput) {
            try {
                d = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException err) {
                System.out.println("Invalid Input." + "\n" + message);
                scanner.next();
            }
        }
        return d;
    }

    public static char readChar(String message) {
        System.out.println(message);

        boolean validInput = false;
        char c = ' ';
        String input = "";
        while (!validInput) {
            try {
                input = scanner.next();
                if (input.length() == 1 && !(Character.isDigit(input.charAt(0)))) {
                    c = input.charAt(0);
                    validInput = true;
                } else {
                    throw new Exception("Input must be a single non-number character" + "\n" + message);
                }
            } catch (Exception err) {
                System.out.println(err.getMessage());
            }
        }
        return c;
    }

    public static String readString(String message) {
        System.out.println(message);

        int i = 0;
        String str = "";
        boolean validInput = false;
        while (!validInput) {
            try {
                str = scanner.next();
                while (i < str.length()) {
                    if (!Character.isLetter(str.charAt(i))) {
                        throw new Exception("The string must be all characters." + "\n" + message);
                    }
                    i++;
                }
                validInput = true;
            } catch (Exception err) {
                System.out.println(err.getMessage());
            }
        }
        return str;
    }

    public static boolean readYesNo(String message) {
        System.out.println(message);

        boolean validInput = false;
        boolean isBoolean = false;
        String str = " ";
        while (!validInput) {
            try {
                str = scanner.next();
                if (str.length() == 1 && (str.charAt(0) == 'n')) {
                    isBoolean = false;
                    validInput = true;
                } else if (str.length() == 1 && str.charAt(0) == 'y') {
                    isBoolean = true;
                    validInput = true;
                } else {
                    throw new Exception("Invalid Input." + "\n" + message);
                }
            } catch (Exception err) {
                System.out.println(err.getMessage());
            }
        }
        return isBoolean;
    }
}