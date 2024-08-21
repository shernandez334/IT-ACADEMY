package Module5_JavaUtils.L1exercise2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    public static void sortDirectory(String directoryPath){
        File dir = new File(directoryPath);
        File[] dirContents = dir.listFiles();
        List<File> dirContentsList = new ArrayList<>();
        for (File f:dirContents){
            dirContentsList.add(f);
        }

        dirContentsList.stream()
                .sorted()
                .forEach(o -> {
                    System.out.println(o);
                    System.out.println(o.lastModified());
                    if (o.isDirectory()){
                        System.out.println("Directory");
                    } else if (o.isFile()){
                        System.out.println("File");
                    }
                });
    }
}
