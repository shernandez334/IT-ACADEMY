package Module1_Patterns.L2Exercise1;

import Module1_Patterns.L2Exercise1.Address.Address;
import Module1_Patterns.L2Exercise1.PhoneNumber.PhoneNumber;

public class Contacts {
    private String name;
    private Address address;
    private PhoneNumber phoneNumber;

    public Contacts(String name, Address address, PhoneNumber phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                this.address.getFullAddress() + "\n"
                + this.phoneNumber.getFullNumber();
    }

}
