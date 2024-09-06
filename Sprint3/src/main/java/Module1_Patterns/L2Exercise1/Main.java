package Module1_Patterns.L2Exercise1;

import Module1_Patterns.L2Exercise1.Address.AddressFrance;
import Module1_Patterns.L2Exercise1.Address.AddressSpain;
import Module1_Patterns.L2Exercise1.PhoneNumber.PhoneNumberSpain;
import java.util.Scanner;
import static Module1_Patterns.L2Exercise1.Google.createContactAppSpain;

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
                    System.out.println("Country of your contact?\n" +
                            "1. Spain.\n" +
                            "2. France." );
                    countryOp = entry.nextInt();
                    assignAddress(contactX, countryOp, name);
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

    public static void assignAddress(ContactApp contactX, int countryOp, String name){
        String addressName = "";
        String city = "";
        String phoneNumber = "";
        switch (countryOp){
            case 1:
                System.out.println("Address Name: ");
                addressName = entry.next();
                System.out.println("City: ");
                city = entry.next();
                AddressSpain address1 = new AddressSpain(addressName, city);
                System.out.println("Phone Number: ");
                phoneNumber = entry.next();
                PhoneNumberSpain phone1 = new PhoneNumberSpain(phoneNumber);
                contactX.getContacts().add(new Contacts(name, address1, phone1));
                break;
            case 2:
                System.out.println("Address Name:");
                addressName = entry.next();
                System.out.println("City:");
                city = entry.next();
                AddressFrance address2 = new AddressFrance(addressName, city);
                System.out.println("Phone Number: ");
                phoneNumber = entry.next();
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
