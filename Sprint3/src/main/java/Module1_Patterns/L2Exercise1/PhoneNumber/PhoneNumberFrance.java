package Module1_Patterns.L2Exercise1.PhoneNumber;

public class PhoneNumberFrance extends PhoneNumber{

    public PhoneNumberFrance(String phoneNumber){
        super(phoneNumber);
    }

    @Override
    public String getFullNumber() {
        return "Phone number: +33 " + this.getPhoneNumber();
    }
}
