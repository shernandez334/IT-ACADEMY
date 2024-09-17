package Module4_Testing.L1exercise2;

public class CalculateDni {
    static String letters = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateDniLetter(long dniNumber){
        if (dniNumber < 0 || dniNumber > 99999999){
            throw new IllegalArgumentException("Dni number out of range");
        }
        int charIndexLetter = (int)(dniNumber % 23);
        return letters.charAt((charIndexLetter));
    }
}
