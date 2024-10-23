package Module1_Patterns.L2Exercise1.phoneNumber;

public class PhoneNumberFrance extends PhoneNumber {

    public PhoneNumberFrance(String phoneNumber) {
        super("+33 ", phoneNumber);
    }

    @Override
    public String getFullPhoneNumber() {
        StringBuilder sb = new StringBuilder();
        sb.insert(2, " ")
                .insert(5, " ")
                .insert(8, " ")
                .insert(11, " ");
        return sb.toString();
    }
}
