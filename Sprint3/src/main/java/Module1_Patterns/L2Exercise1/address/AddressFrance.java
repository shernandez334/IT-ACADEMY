package Module1_Patterns.L2Exercise1.address;


public class AddressFrance extends Address {

    public AddressFrance(String address, int zipcode, String city){
       super(address, zipcode, city, "France");
    }

    @Override
    public String getFullAddress() {
        return super.getAddress() + "\n"
                +  super.getZipcode() + " " + super.getCity() + "\n"
                +  super.getCOUNTRY();
    }
}