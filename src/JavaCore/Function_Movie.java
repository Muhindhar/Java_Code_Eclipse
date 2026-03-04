package JavaCore;
import java.util.*;
public class Function_Movie {
	static void getmovdet(String mov,String des,String lang,int date,String cn,String gen) {
		System.out.println(" movie name : "+mov);
		System.out.println(" movie description : "+des);
		System.out.println(" movie language : "+lang);
		System.out.println(" movie date : "+date);
		System.out.println(" movie country : "+cn);
		System.out.println(" movie genre : "+gen);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String mov = sc.nextLine();
		
		String des = sc.nextLine();
		
		String lang = sc.nextLine();
		
		int date = sc.nextInt();
		sc.nextLine();
		String cn = sc.nextLine();
		
		String gen = sc.nextLine();
		
		getmovdet(mov, des, lang, date, cn, gen);

	}

}
