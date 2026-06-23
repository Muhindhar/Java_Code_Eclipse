package HandsOn10;
import java.util.*;
public class Avg_numbers {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>(); 

        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                set.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }

        List<Integer> list = new ArrayList<>(set);

        System.out.println("Sorted unique numbers: " + list);
        double sum = 0;
        for (int n : list) {
            sum += n;
        }
        double avg = list.size() > 0 ? sum / list.size() : 0;
        System.out.println("Average: " + avg);

        if (!list.isEmpty()) {
            System.out.println("Lowest: " + list.get(0));
            System.out.println("Highest: " + list.get(list.size() - 1));
        }

        List<Integer> odd = new ArrayList<>();
        for (int n : list) {
            if (n % 2 != 0) {
                odd.add(n);
            }
        }
      System.out.println("Odd numbers: " + odd);
	}

}
