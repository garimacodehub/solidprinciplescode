package LSP;

public class ATMMachine {
   
	public void processTransaction(DebitCard card,double amount) {
		card.withdraw(amount);
	}
}
