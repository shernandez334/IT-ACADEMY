package Module5_JavaUtils.L1exercise1;

import static Module5_JavaUtils.L1exercise1.Directory.sortDirectory;

public class Main {
    public static void main(String[] arg){
        sortDirectory(System.getProperty("user.dir"));
    }
}
