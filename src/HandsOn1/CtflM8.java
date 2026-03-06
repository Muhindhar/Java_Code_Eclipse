package HandsOn1;
import java.util.*;
public class CtflM8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String m = sc.nextLine();
		int l=0,d=0,s=0;
		for(int i=0;i<m.length();i++) {
			char ch = m.charAt(i);
			if(Character.isLetter(ch)) {
				l++;
			}
			else if(Character.isDigit(ch)) {
				d++;
			}
			else {
				s++;
			}
		}
		System.out.println("Letters : "+ l + " Digits : "+ d + " Symbols : "+ s);
	}

}
