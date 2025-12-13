package LSP;

public class MasterCard extends DebitCard{

	@Override
	public void withdraw(double amount) {
		
		System.out.println("Withdrawal of amount " + amount + " successfull by using MasterDebitCard");	
	}
	}

