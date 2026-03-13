package FileHandling_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteIoStream {
    public static void main(String[] args) {
        byte[] b = new byte[128];
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Muhindhar S V\\hello java.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Muhindhar S V\\output.txt");
            System.out.println("Bytes available: " + fis.available());
            int c = 0;
            int read = 0;

            while ((read = fis.read(b)) != -1) {
                fos.write(b, 0, read);
                c += read;
            }
            System.out.println("Total count: " + c);

           
        }

        catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        }

        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}