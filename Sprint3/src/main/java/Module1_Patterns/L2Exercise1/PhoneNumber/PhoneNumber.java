package Module1_Patterns.L2Exercise1.PhoneNumber;

public abstract class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public abstract String getFullNumber();
}
