package FileHandling_IO;
import java.util.*;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.FileSystem;
public class Demo1 {
	public static void main(String[] args) {
		//Path p1 = Paths.get("C:\\Users\\Muhindhar S V\\eclipse-workspace\\ExpleoJava\\src\\JavaCore");
		//Path p2 = p1.subpath(0, 3);
		//System.out.println(p2);
		
		FileSystem fs = FileSystems.getDefault();
		Path p1 = fs.getPath("C:\\Users\\Muhindhar S V\\eclipse-workspace\\ExpleoJava\\src\\JavaCore");
		System.out.println(p1);
		
	}
}
