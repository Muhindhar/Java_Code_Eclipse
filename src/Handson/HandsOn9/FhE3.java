package HandsOn9;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
public class FhE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("C:\\Users\\Muhindhar S V\\eclipse-workspace\\ExpleoJava\\src\\JavaCore");
		System.out.println("Isabsolute: "+p.isAbsolute());
		System.out.println("File exists : "+ Files.exists(p));
	}

}
