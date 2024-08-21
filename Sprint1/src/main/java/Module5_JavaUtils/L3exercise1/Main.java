package Module5_JavaUtils.L3exercise1;

import static Module5_JavaUtils.L3exercise1.Directory.sortDirectory;
import static Module5_JavaUtils.L3exercise1.EncryptionAES.encrypt;

public class Main {
    public static void main(String[] arg){
        sortDirectory(System.getProperty("user.dir"), "utils.txt");
        encrypt("utils.txt");
        encrypt("config.properties");
    }
}
