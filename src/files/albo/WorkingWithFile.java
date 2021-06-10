package files.albo;

import java.io.File;
import java.io.IOException;

public class WorkingWithFile {
    public boolean workWithFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (file.isDirectory()){
            System.out.println("It's a directory");
        }else{
            System.out.println("It's a file");
        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        if (!file.isDirectory()){
            System.out.println(file.length() + " byte");
            System.out.println(file.lastModified());
        }
            return file.createNewFile();
    }
}
