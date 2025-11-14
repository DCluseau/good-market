package goodMarket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Receipt {
	private HashMap<Product, Double> shoppingList;
	private LocalDate dateOfPurchase;
	
	/**
	 * Constructor (empty parameters)
	 */
	public Receipt() {
		this.shoppingList = new HashMap<Product, Double>();
		this.dateOfPurchase = LocalDate.now();
	}
	
	/**
	 * Constructor
	 * @param shoppingList
	 * @param dateOfPurchase
	 */
	public Receipt(HashMap<Product, Double> shoppingList, LocalDate dateOfPurchase) {
		this.shoppingList = shoppingList;
		this.dateOfPurchase = dateOfPurchase;
	}

	/**
	 * @return the shoppingList
	 */
	public HashMap<Product, Double> getShoppingList() {
		return shoppingList;
	}

	/**
	 * @param shoppingList the shoppingList to set
	 */
	public void setShoppingList(HashMap<Product, Double> shoppingList) {
		this.shoppingList = shoppingList;
	}

	/**
	 * @return the dateOfPurchase
	 */
	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	/**
	 * @param dateOfPurchase the dateOfPurchase to set
	 */
	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	
	public String toString() {
		// Separator between lines
		String separator = "\n--------------------------------\n";
		// Format the date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateDisplayed = "Date of purchase : " + this.getDateOfPurchase().format(formatter);
		// List of products
		String productsBought = "";
		double totalPurchase = 0;
		for(Product product : this.getShoppingList().keySet()) {
			productsBought += this.getShoppingList().get(product) + " X " + product.getName() + "              " + product.getUnitPrice() * this.getShoppingList().get(product) + " €\n";
			totalPurchase += product.getUnitPrice() * this.getShoppingList().get(product);
		}
		return dateDisplayed + separator + productsBought + separator + "TOTAL : " + totalPurchase + " €\n           Thank you for your visit !";
	}

}
