package Module1_Patterns1.L2Exercise1.PhoneNumber;

public class PhoneNumberSpain extends PhoneNumber{

    public PhoneNumberSpain(String phoneNumber){
        super(phoneNumber);
    }

    @Override
    public String getFullNumber() {
        return "Phone Number: +34 " + super.getPhoneNumber();
    }
}
