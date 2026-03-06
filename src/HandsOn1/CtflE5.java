package HandsOn1;
import java.util.*;
public class CtflE5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<26;i++) {
			char ch = (char) ('a' + i);
			char cha = (char) ('z' - i);
			System.out.print(ch +" " +cha+ " ");
		}
	}
}
