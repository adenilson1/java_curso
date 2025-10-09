package entities;

public class Account {
	private int conta;
	private String titular;
	private double value;

	public Account() {

	}

	public Account(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	public Account(int conta, String titular, double value) {
		this.conta = conta;
		this.titular = titular;
		this.value = value;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValue() {
		return value;
	}
	
	public void deposito(double value) {
		this.value += value;
	}
	
	public void saque(double value) {
		this.value -= (value + 5); 
	}
	
	public String toString() {
		return   "Account " 
	           + conta 
			   + ", Holder: "
			   + titular 
			   + String.format(", Balance: $ %.2f%n", value);
	}
}
