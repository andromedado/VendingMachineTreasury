import java.util.List;

enum Coin {
	DOLLAR(100),
	QUARTER(25),
	DIME(10),
	NICKLE(5),
	PENNY(1),
	;

	private Integer value;

	Coin(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return this.value;
	}
}

public class VendingMachineTreasury {
	// TODO - Maintain State - How many Quarters/Dimes/Nickles/Pennies do I have?

	public List<Coin> makeChange(Integer price, List<Coin> payment) {
		// TODO - Implement me!
		return null;
	}

}


// TODO Write a couple tests

