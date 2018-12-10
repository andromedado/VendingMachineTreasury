import java.util.List;

enum Coin {
	DOLLAR(1.0),
	QUARTER(0.25),
	DIME(0.10),
	NICKLE(0.05),
	PENNY(0.01),
	;

	private Double value;

	Coin(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return this.value;
	}
}

public class VendingMachineTreasury {
	//TODO - Maintain State - How many Quarters/Dimes/Nickles/Pennies do I have?

	public List<Coin> makeChange(Double price, Double payment) {
		//TODO - Implement me!
		// NOTE incoming payments are not added to disburse-able funds
		return null;
	}

}


//TODO Write a couple tests

