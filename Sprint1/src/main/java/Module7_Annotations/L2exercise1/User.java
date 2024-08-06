package Module7_Annotations.L2exercise1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class User {
    private String name = "Santiago";
    private String password = "12345678";

    @CustomizedAnnotations
    public static void customizedSerialization(){
        User user1 = new User();

        try {
            FileOutputStream fileStream = new FileOutputStream("User.json");
            ObjectOutputStream out = new ObjectOutputStream(fileStream);
            out.writeObject(user1);
            fileStream.close();
        } catch (IOException err){
            System.out.println(err.getMessage());
        }
    }
}
