package HandsOn7;

import java.util.*;

public class encrpyt_message {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter message:");
		String inp = sc.nextLine();
		char arr[] = inp.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];

			if (ch >= 'a' && ch <= 'z') {
				arr[i] = (char) ((ch - 'a' + 3) % 26 + 'a');
			} else if (ch >= 'A' && ch <= 'Z') {
				arr[i] = (char) ((ch - 'A' + 3) % 26 + 'A');
			} else if (ch == ' ') {
				arr[i] = '_';
			} else {
				arr[i] = ch;
			}
		}
		System.out.println(new String(arr));
	}
}