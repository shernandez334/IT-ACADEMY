package Module1_Patterns.L2Exercise1.Address;

public class AddressSpain extends Address{

    public AddressSpain(String addressName, String city){
        super(addressName, city);
    }

    @Override
    public String getFullAddress() {
        return "Address: " + super.getAddressName() + "\n"
                + "city : " + super.getCity();
    }
}
