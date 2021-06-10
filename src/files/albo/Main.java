package files.albo;

import files.albo.CopyingFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*files.albo.WorkingWithFile workingWithFile = new files.albo.WorkingWithFile();
        workingWithFile.workWithFile("C:\\Users\\Alex\\Desktop\\Java\\Files\\5.in");*/
        CopyingFile copyingFile = new CopyingFile();
//        System.out.println(copyingFile.copyFile("C:\\Users\\Alex\\Desktop\\Java\\Files\\5.in", "C:\\Users\\Alex\\Desktop\\Java\\Files\\5copy.in"));
//        System.out.println(copyingFile.copyBufferedFile("C:\\Users\\Alex\\Desktop\\Java\\Files\\5.in", "C:\\Users\\Alex\\Desktop\\Java\\Files\\5copy.in"));
        System.out.println(copyingFile.copyFileWithReaderAndWriter("C:\\Users\\Alex\\Desktop\\Java\\Files\\5.in", "C:\\Users\\Alex\\Desktop\\Java\\Files\\5copy.in"));
    }
}
