package JavaCore;
import java.util.*;
public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][];
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {4,5};
		arr[2] = new int[] {6,7,7,8};
		arr[3] = new int[] {9,10,11,12};
		System.out.println("Jagged Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System .out.println();
		}
	}
}
