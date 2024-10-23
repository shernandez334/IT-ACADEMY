package Module1_Patterns.L2Exercise1;


import Module1_Patterns.L2Exercise1.util.IOHelpers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactApp {
    private static final IOHelpers ioHelpers = new IOHelpers();
    private static final Logger LOGGER = LoggerFactory.getLogger(IOHelpers.class);
    private static final String COUNTRY_OPTIONS =
            "Welcome to WhatsApp!\n " +
            "Which country is your contact from: \n" +
            "1. USA\n" +
            "2. France\n";


    public void run(){
        int op = ioHelpers.readIntegers(COUNTRY_OPTIONS);

        switch (op){
            case 1 -> ;
            case 2 -> ;
            default -> System.out.print("Wrong option. Try again.");
        }
    }
}
