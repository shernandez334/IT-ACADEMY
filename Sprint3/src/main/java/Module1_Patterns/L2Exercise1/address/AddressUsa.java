package Module1_Patterns.L2Exercise1.address;

public class AddressUsa extends Address {
    private String state;

    public AddressUsa(String address, int zipcode, String city, String state) {
        super(address, zipcode, city, "USA");
        this.state = state;
    }

    @Override
    public String getFullAddress() {
        return super.getAddress() + "\n"
                + super.getCity() + ", " + this.state + " " + super.getZipcode();
    }
}