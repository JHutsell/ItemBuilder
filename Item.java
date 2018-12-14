import java.util.Scanner;
import java.util.ArrayList;

public class Item {

	private String name;
	private double price;
	private int quantity;



public void setName(String nameString) {
	name = nameString;
}
public String getName() {
	return name;
}
public void setPrice(double priceDouble) {
	price = priceDouble;
}
public double getPrice() {
	return price;
}
public void setQuantity(int quantityInt) {
	quantity = quantityInt;
}
public int getQuantity() {
	return quantity;
}


	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Item> items = new ArrayList<Item>();
		
		
		System.out.println("How many items would you like to create?");
		int numberItems = scanner.nextInt();
		items = createItems(numberItems);
		System.out.println(items);
	}

	public static ArrayList<Item> createItems(int numberItems) {
		ArrayList<Item> items = new ArrayList<Item>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numberItems; i++) {
		System.out.println("What is the name of your item?");
		String name = scanner.nextLine();
		
		System.out.println("What is the price of your item?");
		double price = scanner.nextDouble();
		
		System.out.println("What is the quantity of your item?");
		int quantity = scanner.nextInt();
		
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		item.setQuantity(quantity);
		
		items.add(item);
		}
		return items;
	}
	}
	
	
	
