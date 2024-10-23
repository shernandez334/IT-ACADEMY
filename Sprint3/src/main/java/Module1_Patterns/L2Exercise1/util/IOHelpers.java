package Module1_Patterns.L2Exercise1.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class IOHelpers {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Logger LOGGER = LoggerFactory.getLogger(IOHelpers.class);

    public int readIntegers(String message){
        int number= 0;
        boolean isNumber = false;
        while (!isNumber){
            try {
                System.out.println(message);
                number = SCANNER.nextInt();
                isNumber = true;
            } catch (NumberFormatException e){
                LOGGER.error("You must input a number {}", e.getMessage());
                System.out.println("You must input a number " + e.getMessage());
            }
        }
        return number;
    }
}