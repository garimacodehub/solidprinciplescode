package SRP;

public class Invoice {
      
	public String customer;
	private double amount;
	
	
	public Invoice(String customer, double amount) {
		
		this.customer = customer;
		this.amount = amount;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Invoice [customer=" + customer + ", amount=" + amount + "]";
	}
}
