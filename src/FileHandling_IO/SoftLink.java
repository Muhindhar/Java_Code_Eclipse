package FileHandling_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path existingFilepath = Paths.get("C:\\Users\\Muhindhar S V\\eclipse-workspace\\ExpleoJava\\src\\JavaCore");
		Path symLinkPath = Paths.get("C:\\JavaCore");
		try {
			Files.createSymbolicLink(symLinkPath, existingFilepath);
		}
		catch(IOException x) {
			System.err.println(x);
		}
		catch(UnsupportedOperationException x) {
			System.err.println(x);
		}
	}

}
