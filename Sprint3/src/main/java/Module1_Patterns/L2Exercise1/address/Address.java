package Module1_Patterns.L2Exercise1.address;

public abstract class Address {
    private String address;
    private int zipcode;
    private String city;
    private String COUNTRY;

    public Address(String address, int zipcode, String city, String COUNTRY){
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.COUNTRY = COUNTRY;
    }

    public String getAddress(){
        return this.address;
    }
    public int getZipcode(){
        return this.zipcode;
    }
    public String getCity(){
        return this.city;
    }
    public String getCOUNTRY(){
        return this.COUNTRY;
    }

    public abstract String getFullAddress();
}
