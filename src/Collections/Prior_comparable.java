package Collections;
import java.util.*;
class Task implements Comparable<Task>{
	private String name;
	private int prior;
	public Task(String name, int prior) {
		super();
		this.name = name;
		this.prior = prior;
	}
	public String getname() {
		return name;
	}
	public int getprior() {
		return prior;
	}
	public int compareTo(Task other) {
		return Integer.compare(other.prior, this.prior);
	}
}

public class Prior_comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		PriorityQueue <Task> Task = new PriorityQueue<>();
		Task.add(new Task("Task 1 ",3));
		Task.add(new Task("Task 2 ",1));
		Task.add(new Task("Task 3 ",2));
		while (!Task.isEmpty()) {
			Task task = Task.poll();
			System.out.println("Executing: " + task.getname() + " (Priority: " + task.getprior() + ")");
			}

	}

}
