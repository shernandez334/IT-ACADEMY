package Module1_Patterns.L2Exercise1.phoneNumber;

public class PhoneNumberUsa extends PhoneNumber {

    public PhoneNumberUsa(String phoneNumber) {
        super("+34 ", phoneNumber);
    }

    @Override
    public String getFullPhoneNumber() {
        StringBuilder sb = new StringBuilder(super.getPhoneNumber());
        sb.insert(0, "(")
                .insert(4, ")")
                .insert(5, " ")
                .insert(9, "-");
        return sb.toString();
    }
}
   