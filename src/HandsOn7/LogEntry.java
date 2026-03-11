package HandsOn7;
import java.util.*;
public class LogEntry {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Name : ");
		String name = sc.nextLine();
		System.out.println("Password : ");
		String pass = sc.nextLine();
		System.out.println("IP address : ");
		String ip = sc.nextLine();
		System.out.println("Status : ");
		String res = sc.nextLine();
		 
		System.out.println("Name : " + name);
		System.out.println("Password : " + "********");
		System.out.println("IP Address : " + "xxx.xxx.x.x");
		System.out.println("Assessment : " + res);
	}

}
