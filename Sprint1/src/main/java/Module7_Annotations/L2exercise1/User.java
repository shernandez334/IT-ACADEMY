package Module7_Annotations.L2exercise1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class User implements Serializable {
    private final String name = "Santiago";
    private final String password = "12345678";
    static final String CURRENT_PATH = Paths.get("").toAbsolutePath().toString();

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    @CustomizedAnnotations(directory = "default_directory")
    public static void customizedSerialization(){
        Paths.get("").toAbsolutePath().toString();
        User user1 = new User();
        String jsonStr = "";
        try {
            FileOutputStream fileStream = new FileOutputStream(new File("User.json"));
            ObjectMapper obj = new ObjectMapper();
            jsonStr = obj.writeValueAsString(user1);
            fileStream.write(jsonStr.getBytes());
            fileStream.close();
        } catch (FileNotFoundException e){
            System.out.println("Error: File not Found.");
        } catch (SecurityException e){
            System.out.println("A security error has occurred: " + e.getMessage());
        } catch (Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
