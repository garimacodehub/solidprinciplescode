package LSP;

public class ATMMain {
	public static void main(String[] args) {
	
	ATMMachine machine = new ATMMachine();
	
	DebitCard visacard = new VisaCard();
	DebitCard mastercard = new MasterCard();
	
	machine.processTransaction(visacard,2000);
	machine.processTransaction(mastercard,4000);
	

}
}
