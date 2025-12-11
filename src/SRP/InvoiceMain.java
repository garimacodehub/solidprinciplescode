package SRP;

import java.util.Scanner;

public class InvoiceMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name:: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the amount:: ");
		double amount = sc.nextDouble();
		
		Invoice invoice = new Invoice(name,amount);
		
		InvoicePrinter printer = new InvoicePrinter();
		printer.print(invoice);
		
		InvoiceRepository repository = new InvoiceRepository();
		repository.save(invoice);
		
		sc.close();
	}

}
