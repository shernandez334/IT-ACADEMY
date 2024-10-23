package Module1_Patterns.L2Exercise1.phoneNumber;

public abstract class PhoneNumber {
    private String prefix;
    private String phoneNumber;

    public PhoneNumber(String prefix, String phoneNumber){
        this.prefix = prefix;
        this.phoneNumber = phoneNumber;
    }

    public String getPrefix(){
        return this.prefix;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public abstract String getFullPhoneNumber();
}
