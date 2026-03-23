package HandsOn8;
import java.util.*;

class Invoice {
	private int partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public double getInvoiceAmount() {
		return quantity * pricePerItem;
	}

	public void display() {
		System.out.println("\n--- Invoice Details ---");
		System.out.println("Part Number      : "+partNumber);
		System.out.println("Description      : "+partDescription);
		System.out.println("Quantity         : "+quantity);
		System.out.println("Price per Item   : "+pricePerItem);
		System.out.println("Total Amount     : "+getInvoiceAmount());
	}
}

public class Grocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Part Number (>0): ");
			int partNumber = sc.nextInt();
			if (partNumber <= 0) {
				throw new IllegalArgumentException("Part number must be greater than 0");
			}
			sc.nextLine();
			System.out.print("Enter Part Description: ");
			String partDescription = sc.nextLine();
			if (partDescription == null || partDescription.trim().isEmpty()) {
				throw new IllegalArgumentException("Description cannot be empty");
			}
			System.out.print("Enter Quantity (>0): ");
			int quantity = sc.nextInt();
			if (quantity <= 0) {
				throw new IllegalArgumentException("Quantity must be greater than 0");
			}
			System.out.print("Enter Price per Item (>0): ");
			double price = sc.nextDouble();
			if (price <= 0) {
				throw new IllegalArgumentException("Price must be greater than 0");
			}
			Invoice obj = new Invoice(partNumber, partDescription, quantity, price);

			obj.display();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input type! Please enter correct data.");
		} catch (IllegalArgumentException e) {
			System.out.println("Validation Error: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
