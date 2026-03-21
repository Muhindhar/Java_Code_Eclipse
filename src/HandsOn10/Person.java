package HandsOn10;
import java.util.*;
class PersonDetails {
    private String firstName;
    private String lastName;

    public PersonDetails(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Person {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<PersonDetails> list = new ArrayList<>();

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter first name: ");
            String fname = sc.nextLine();

            System.out.print("Enter last name: ");
            String lname = sc.nextLine();

            list.add(new PersonDetails(fname, lname));
        }

        Collections.sort(list, new Comparator<PersonDetails>() {
            public int compare(PersonDetails p1, PersonDetails p2) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
        });

        System.out.println("Sorted people by first name:");
        for (PersonDetails p : list) {
            System.out.println(p);
        }
    }
}