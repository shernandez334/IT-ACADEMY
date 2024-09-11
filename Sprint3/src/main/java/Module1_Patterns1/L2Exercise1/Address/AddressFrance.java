package Module1_Patterns1.L2Exercise1.Address;

public class AddressFrance extends Address{

    public AddressFrance(String addressName, String city){
        super(addressName, city);
    }

    @Override
    public String getFullAddress() {
        return "Address: " + super.getAddressName() + "\n"
                + "city : " + super.getCity();
    }
}
