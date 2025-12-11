package SRP;

public class InvoiceRepository {
	
	public void save(Invoice invoice) {
		System.out.println("Saving invoice for ::" + invoice.getCustomer());
	}

}
