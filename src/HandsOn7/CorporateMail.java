package HandsOn7;
import java.util.*;
public class CorporateMail {
		public static boolean Validatemail(String mail) {
			String regex = "^[a-z][a-z0-9._-]*@[a-z0-9-]+(\\.[a-z0-9-]+)+$";
			return mail.matches(regex);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mail Id");
		String mail = sc.nextLine();
		if(Validatemail(mail)) {
			System.out.println("Valid email");
		}
		else {
			System.out.println("Invalid email");
		}
	}
}
