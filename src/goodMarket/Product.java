package goodMarket;

import java.time.LocalDate;

/**
 * Abstract class Product reprensenting a product
 */
public abstract class Product {
	private String name;
	private double unitPrice;
	private String unit;
	private double stockQuantity;
	private LocalDate pickingDate;
	private int shelfLifeDays;
	
	/**
	 * Constructor without parameters
	 */
	public Product() {
		this.name = "";
		this.unitPrice = 0.0;
		this.unit = "individually";
		this.stockQuantity = 0;
		this.pickingDate = LocalDate.of(2025, 01, 01);
		this.shelfLifeDays = 0;
	}
	
	/**
	 * Constructor with all parameters
	 * @param name
	 * @param unitPrice
	 * @param unit
	 * @param stockQuantity
	 * @param pickingDate
	 * @param shelfLifeDays
	 */
	public Product(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate, int shelfLifeDays) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.unit = unit;
		this.stockQuantity = stockQuantity;
		this.pickingDate = pickingDate;
		this.shelfLifeDays = shelfLifeDays;
	}

	/**
	 * Get name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get unitPrice
	 * @return the unitPrice
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * Set unitPrice
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * Get unit
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * set unit
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Get stock quantity
	 * @return the stockQuantity
	 */
	public double getStockQuantity() {
		return stockQuantity;
	}

	/**
	 * Set stock quantity
	 * @param stockQuantity the stockQuantity to set
	 */
	public void setStockQuantity(double stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	/**
	 * Get picking date
	 * @return the pickingDate
	 */
	public LocalDate getPickingDate() {
		return pickingDate;
	}

	/**
	 * Set picking date
	 * @param pickingDate the pickingDate to set
	 */
	public void setPickingDate(LocalDate pickingDate) {
		this.pickingDate = pickingDate;
	}

	/**
	 * Get shelfLifeDays
	 * @return the shelfLifeDays
	 */
	public int getShelfLifeDays() {
		return shelfLifeDays;
	}

	/**
	 * Set shelfLifeDays
	 * @param shelfLifeDays the shelfLifeDays to set
	 */
	public void setShelfLifeDays(int shelfLifeDays) {
		this.shelfLifeDays = shelfLifeDays;
	}
	
	/**
	 * Abstract method to calculate the product's expiration date
	 * @return
	 */
	public abstract LocalDate calculateExpirationDate();
	
	/**
	 * Update quantity of product
	 * @param quantityToAdd : quantity to add (if negative, will instead substract the quantity)
	 */
	public void updateProductStock(double quantityToAdd) {
		this.setStockQuantity(this.getStockQuantity() + quantityToAdd);
	}
}
