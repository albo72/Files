package files.albo;

import java.io.*;

public class CopyingFile {
    public boolean copyFile(String sourceFileName, String destinationFileName) throws IOException {
        File file = new File(destinationFileName);
        boolean creatingNewFile = file.createNewFile();
        try (FileInputStream fis = new FileInputStream(sourceFileName);
             FileOutputStream fos = new FileOutputStream(file)) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return creatingNewFile;
    }

    public boolean copyBufferedFile(String sourceFileName, String destinationFileName) throws IOException {
        File file = new File(destinationFileName);
        boolean creatingNewFile = file.createNewFile();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFileName))) {
            byte[] buffer = new byte[bis.available()];
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file), buffer.length);
            for (int i = 0; i < buffer.length; i++) {
                buffer[i] = (byte) bis.read();
            }
            out.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return creatingNewFile;
    }

    public boolean copyFileWithReaderAndWriter(String sourceFileName, String destinationFileName) throws IOException {
        File file = new File(destinationFileName);
        boolean creatingNewFile = file.createNewFile();
        try (Reader reader = new FileReader(sourceFileName)) {
            Writer writer = new FileWriter(file,false);
            int in;
            while ((in = reader.read()) != -1){
                writer.write(in);
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return creatingNewFile;
    }

}
