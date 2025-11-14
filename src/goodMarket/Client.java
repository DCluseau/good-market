package goodMarket;

import java.util.ArrayList;

public class Client {
	private String firstname;
	private String lastname;
	private ArrayList<Receipt> receiptsList;
	
	public Client() {
		this.firstname = "";
		this.lastname = "";
		this.receiptsList = new ArrayList<Receipt>();
	}
	
	/**
	 * Constructor with all parameters
	 * @param firstname
	 * @param lastname
	 * @param receiptsList
	 */
	public Client(String firstname, String lastname, ArrayList<Receipt> receiptsList) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.receiptsList = receiptsList;
	}

}
