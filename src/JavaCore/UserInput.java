package JavaCore;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class UserInput {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("ENter the Movie ID");
		int mid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the movie name");
		String mname = sc.nextLine();
		
		System.out.println("Enter the movie description : ");
		String mdes = sc.nextLine();
		
		System.out.println("Enter the Movie language : ");
		String mlang = sc.next();
		sc.nextLine();
		 
	

		Date today = new Date();
		
		System.out.println("Enter the movie seat cost : ");
		float mrate = sc.nextFloat();
		
		System.out.println("ENTERED MOVIE DETAILS ARE : ");
		System.out.println("Movie id : "+ mid);
		System.out.println("Movie name : "+ mname);
		System.out.println("Movie description : "+ mdes);
		System.out.println("Movie language : "+ mlang);
		
		
		
		
	}
}
