package goodMarket;

import java.time.LocalDate;

public class Fruit extends Product implements Consumable {

	public Fruit() {
		super();
	}

	public Fruit(String name, double unitPrice, String unit, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unit, stockQuantity, pickingDate, shelfLifeDays);
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
