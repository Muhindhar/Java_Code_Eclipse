package FileHandling_IO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("C:\\Users\\Muhindhar S V\\eclipse-workspace\\ExpleoJava\\src\\JavaCore");
		Path normalizedpath = p1.normalize();
		Path p2 = Paths.get("C:\\Users\\Muhindhar S V\\eclipse-workspace\\ExpleoJava\\src\\JavaCore");
		System.out.println("Normalized path : "+ normalizedpath );
		Path subpath = p1.subpath(1, 3);
		System.out.println("Subpath : " + subpath);
		System.out.println("Getfilename : "+p1.getFileName());
		System.out.println("Get parent : "+p1.getParent());
		System.out.println("Get name count : " +p1.getNameCount());
		System.out.println("Get root : "+p1.getRoot());
		System.out.println("Get root of p2 : "+p2.getRoot());
		System.out.println("Isabsolute : "+p1.isAbsolute());
		System.out.println("Toabsolute : "+p1.toAbsolutePath());
		System.out.println("To URI : "+p1.toUri());
		if(p1.equals(p2)) {
			System.out.println("Both are equal ");
		}
		else {
			System.out.println("Not equal");
		}
	}

}
