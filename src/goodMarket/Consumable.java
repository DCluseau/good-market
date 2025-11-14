package goodMarket;

import java.time.LocalDate;

/**
 * Interface Consumable
 */
public interface Consumable {
	public boolean isRipe();
	public boolean isExpired(LocalDate dateCheck);
	public int daysRemainingBeforeExpiration(LocalDate dateCheck);
}
