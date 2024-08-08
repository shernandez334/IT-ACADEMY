package Module4_Testing.L1exercise2;

public class CalculateDni {
    private long dniNumber = 0L;

    public CalculateDni(long dniNumber){
        this.dniNumber = dniNumber;
    }

    public char calculateDniLetter(){
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int charIndexLetter = (int)(this.dniNumber % 23);
        return letters.charAt((charIndexLetter));
    }
}
