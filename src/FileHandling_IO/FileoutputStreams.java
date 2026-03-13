package FileHandling_IO;

import java.io.FileOutputStream;

public class FileoutputStreams {
	public static void main(String[] args) {
		String data = "Welcome to java portal";
		try {
			FileOutputStream op = new FileOutputStream("C:\\Users\\Muhindhar S V\\Hello java.txt");
			byte[] arr = data.getBytes();
			op.write(arr);
			op.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}	
