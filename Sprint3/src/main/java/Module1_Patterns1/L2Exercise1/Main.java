package Module1_Patterns1.L2Exercise1;

import Module1_Patterns1.L2Exercise1.Address.AddressFrance;
import Module1_Patterns1.L2Exercise1.Address.AddressSpain;
import Module1_Patterns1.L2Exercise1.PhoneNumber.PhoneNumberSpain;
import java.util.Scanner;
import static Module1_Patterns1.L2Exercise1.Google.createContactAppSpain;

public class Main {
    static Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {
        ContactApp contactX = createContactAppSpain();
        executeContactApp(contactX);
    }

    public static void executeContactApp(ContactApp contactX){
        int op = 0;
        int countryOp = 0;
        String name = "";
        String addressName = "";
        String city = "";
        String phoneNumber = "";
        int country = 0;
        while (op != 3){
            System.out.println("Welcome to ContactApp: \n" +
                    "1. Create a contact.\n" +
                    "2. See all contacts.\n" +
                    "3. Exit");
            op = entry.nextInt();

            switch (op){
                case 1:
                    System.out.println("Name:");
                    name = entry.next();
                    System.out.println("Address Name: ");
                    addressName = entry.next();
                    System.out.println("City: ");
                    city = entry.next();
                    System.out.println("Phone Number: ");
                    phoneNumber = entry.next();
                    assignAddress(contactX, name, addressName, city, phoneNumber);
                    break;
                case 2:
                    seeContacts(contactX);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Wrong option.");
                    break;
            }
        }

    }

    public static void assignAddress(ContactApp contactX,
                                     String name, String addressName, String city, String phoneNumber){

        int countryOp = 0;
        System.out.println("Country your contact is from.\n" +
                "1. Spain.\n" +
                "2. France." );
        countryOp = entry.nextInt();
        switch (countryOp){
            case 1:
                AddressSpain address1 = new AddressSpain(addressName, city);
                PhoneNumberSpain phone1 = new PhoneNumberSpain(phoneNumber);
                contactX.getContacts().add(new Contacts(name, address1, phone1));
                break;
            case 2:
                AddressFrance address2 = new AddressFrance(addressName, city);
                PhoneNumberSpain phone2 = new PhoneNumberSpain(phoneNumber);
                contactX.getContacts().add(new Contacts(name, address2, phone2));
                break;
        }
    }

    public static void seeContacts(ContactApp contactX){
        for(int i = 0; i < contactX.getContacts().size(); i++){
            System.out.println(contactX.getContacts().get(i).toString());
        }
    }
}
