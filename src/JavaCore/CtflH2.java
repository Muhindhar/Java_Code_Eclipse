/*2.The final grade of a student in a course is calculated as 
 * 30% of the exercise’s grade and as 70% of the exam’s grade, 
 * only if both grades are greater than or equal to 5; otherwise,
 *  the final grade will be their minimum. Write a program that reads continuously\
 *   pairs of grades (exercises and exam grades) and displays the final grade for each student, until the user enters a pair of grades containing the value −1. Before it ends, the program should display the average grade of all students in the course. The program 
 * should check that all given grades belong in [0,10].
 */
package JavaCore;
import java.util.*;
public class CtflH2 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		 double total = 0; 
			int count = 0; 
			while (true) { 
				System.out.print("Enter exercise grade: "); 
				double exercise = sc.nextDouble(); 
				
				System.out.print("Enter exam grade: "); 
				double exam = sc.nextDouble(); 
				
				if (exercise == -1 || exam == -1) {
					break; 
				}
				if (exercise < 0 || exercise > 10 || exam < 0 || exam > 10) { 
					System.out.println("Grades must be between 0 and 10."); 
					continue; 
				} 
				double finalGrade; 
				
				if (exercise >= 5 && exam >= 5) { 
					finalGrade = (0.3 * exercise) + (0.7 * exam); 
				} 
				else {
					finalGrade = Math.min(exercise, exam); 
				} 
				System.out.println("Final grade = " + finalGrade); 
				total += finalGrade; 
				count++; 
			} 
			
			if (count > 0) { 
				double average = total / count; 
				System.out.println("Average grade = " + average); 
			}
			else { 
				System.out.println("No grades entered."); 
			} 
			sc.close();
		
	}
}
