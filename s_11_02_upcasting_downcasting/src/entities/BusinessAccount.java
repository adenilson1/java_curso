package entities;

public class BusinessAccount extends Account {

	private Double laonLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double laonLimit) {
		super(number, holder, balance);
		this.laonLimit = laonLimit;
	}

	public Double getLaonLimit() {
		return laonLimit;
	}

	public void setLaonLimit(Double laonLimit) {
		this.laonLimit = laonLimit;
	}

	public void loan(Double amount) {
		if (amount <= laonLimit) {
			balance += amount - 10.00;
		}

	}

}
