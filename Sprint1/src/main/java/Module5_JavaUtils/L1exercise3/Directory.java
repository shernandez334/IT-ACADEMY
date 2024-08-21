package Module5_JavaUtils.L1exercise3;

import javax.swing.plaf.multi.MultiToolTipUI;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    public static void sortDirectory(String directoryPath) {
        File dir = new File(directoryPath);
        File[] dirContents = dir.listFiles();
        List<File> dirContentsList = new ArrayList<>();
        for (File f:dirContents){
            dirContentsList.add(f);
        }
        try (FileWriter utilsFile = new FileWriter("utils.txt");){
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
    }
}
