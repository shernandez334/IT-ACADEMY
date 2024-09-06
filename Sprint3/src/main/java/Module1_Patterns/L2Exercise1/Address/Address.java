package Module1_Patterns.L2Exercise1.Address;

public abstract class Address {
    private String addressName;
    private String city;

    public Address(String addressName, String city){
        this.addressName = addressName;
        this.city = city;
    }

    public String getAddressName(){
        return this.addressName;
    }
    public String getCity(){
        return this.city;
    }

    public abstract String getFullAddress();
}
