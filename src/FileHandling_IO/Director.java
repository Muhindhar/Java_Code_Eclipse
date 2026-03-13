package FileHandling_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Director {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\Muhindhar S V\\eclipse-workspace\\ExpleoJava\\src\\Files");
		//Boolean result = Files.exists(p);
		//System.out.println(" Path "+ p + " Exists \n" + result );
		Path p = Files.createFile(path);
		System.out.println(p);
	}
}
