package FileHandling_IO;
import java.io.FileInputStream;

public class Fileinputstream {

    public static void main(String[] args) {
    	int m = 0;
        try {
            FileInputStream inp = new FileInputStream("C:\\Users\\Muhindhar S V\\OneDrive\\Desktop\\Standup Meeting\\muhi.txt");
            System.out.println("Data in the file:");
            int i = inp.read();
            while(i!=-1) {
            	m++;
                System.out.print((char)i);
                i = inp.read();
            }
            inp.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Length : "+m);
    }
}