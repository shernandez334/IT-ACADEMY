package Module5_JavaUtils.L3exercise1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Directory {
    public static void sortDirectory(String directoryPath, String fileName) {
        File dir = new File(directoryPath);
        File[] dirContents = dir.listFiles();
        List<File> dirContentsList = new ArrayList<>();
        for (File f:dirContents){
            dirContentsList.add(f);
        }

        try (FileWriter utilsFile = new FileWriter(fileName)){
            Properties properties = new Properties();
            dirContentsList.stream()
                    .sorted()
                    .forEach(o -> {
                        try {
                            utilsFile.write(o + "\n");
                            utilsFile.write("Last Modified: " + o.lastModified() + "\n");

                            String fileType = (o.isDirectory())? "Directory": "File";
                            utilsFile.write(fileType + "\n");

                            String strProperties = o.lastModified() + " " + fileType;
                            properties.setProperty(o.toString(), strProperties);
                        } catch (IOException err) {
                            System.out.println(err.getMessage());
                        }
                    });
            File configFile = new File("config.properties");
            String configFilePath = configFile.getAbsolutePath();
            FileOutputStream propsInput = new FileOutputStream(configFilePath);
            properties.store(propsInput, "");
        }catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }
}
