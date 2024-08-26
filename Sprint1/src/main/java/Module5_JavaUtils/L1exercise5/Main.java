package Module5_JavaUtils.L1exercise5;

import static Module5_JavaUtils.L1exercise5.Directory.*;

public class Main {
    public static void main(String[] arg){
        serialization("utilSerial.ser");
        deserialization("utilSerial.ser");
        sortDirectory(System.getProperty("user.dir"), "utils.txt");
    }
}
