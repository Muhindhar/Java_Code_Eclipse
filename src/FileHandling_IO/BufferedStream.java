package FileHandling_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

    public static void main(String[] args) {

        try (
            BufferedReader bufi = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bufo = new BufferedWriter(new FileWriter(args[1])))
        		{
            String line="";

            while ((line = bufi.readLine()) != null) {
                bufo.write(line);
                bufo.newLine();
            }

            bufi.close();
            bufo.close();

            System.out.println("File copied successfully");

        } 
        catch (FileNotFoundException f) {
            System.out.println("File not found: " + f);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}