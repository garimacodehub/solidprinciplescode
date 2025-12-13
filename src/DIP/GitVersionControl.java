package DIP;

public class GitVersionControl implements IVersionControl
{

	@Override
	public void commit(String message) {
		// TODO Auto-generated method stub
		System.out.println("Commiting changes to git " + message);
		
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		System.out.println("Pushing changes to remote git repository");		
	}

	@Override
	public void pull() {
		// TODO Auto-generated method stub
		System.out.println("Pulling changes from Remote git repository");
		
	}

}
