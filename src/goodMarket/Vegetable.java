package goodMarket;

import java.time.LocalDate;

public class Vegetable extends Product implements Consumable {

	public Vegetable() {
		// TODO Auto-generated constructor stub
	}

	public Vegetable(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isRipe() {
		return (this.getPickingDate().equals(LocalDate.now()) ? true : false);
	}

	@Override
	public boolean isExpired(LocalDate dateCheck) {
		return (this.getPickingDate().plusDays(this.getShelfLifeDays()).isAfter(LocalDate.now()) ? true : false);
	}

	@Override
	public int daysRemainingBeforeExpiration(LocalDate dateCheck) {
		return 0;
	}

	@Override
	public LocalDate calculateExpirationDate() {
		return this.getPickingDate().plusDays(this.getShelfLifeDays());
	}

}
