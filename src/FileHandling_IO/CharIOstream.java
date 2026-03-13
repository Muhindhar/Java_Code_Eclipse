package FileHandling_IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOstream {
	public static void main(String[] args) {
		char[] b = new char[128];

		try {
			FileReader fr = new FileReader("D:\\Hello java.txt");
			FileWriter fw = new FileWriter("D:\\output.txt");
			int c = 0;
			int read = 0;

			while ((read = fr.read(b)) != -1) {
				fw.write(b, 0, read);
				c += read;
			}
			System.out.println("Total count: " + c);
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
	}
}