package Module7_Annotations.L3exercise1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.file.Paths;

public class User {
    private final String name = "Santiago";
    private final String password = "12345678";

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
        } catch (IOException err){
            System.out.println(err.getMessage());
        }
    }

    public void getAnnotation(){
        User obj = new User();
         try {
             Method method = User.class.getMethod("customizedSerialization");
             CustomizedAnnotations annotation = method.getAnnotation(CustomizedAnnotations.class);
             System.out.println(annotation);
         } catch (Exception err){
             System.out.println(err.getMessage());
         }
    }
}
