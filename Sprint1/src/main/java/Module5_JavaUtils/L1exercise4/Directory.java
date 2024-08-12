package Module5_JavaUtils.L1exercise4;

import com.fasterxml.jackson.core.async.ByteBufferFeeder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    public static void sortDirectory(String directoryPath, String fileName) {
        File dir = new File(directoryPath);
        File[] dirContents = dir.listFiles();
        List<File> dirContentsList = new ArrayList<>();
        for (File f:dirContents){
            dirContentsList.add(f);
        }
        try (FileWriter utilsFile = new FileWriter(fileName);){
            dirContentsList.stream()
                    .sorted()
                    .forEach(o -> {
                        try {
                            utilsFile.write(o + "\n");
                            utilsFile.write(String.valueOf(o.lastModified()) + "\n");
                            if (o.isDirectory()) {
                                utilsFile.write("Directory\n");
                            } else if (o.isFile()) {
                                utilsFile.write("File\n");
                            }
                        } catch (IOException err) {
                            System.out.println(err.getMessage());
                        }
                    });
        }catch (IOException err) {
            System.out.println(err.getMessage());
        }

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException err){
            System.out.println(err.getMessage());
        }
    }
}
