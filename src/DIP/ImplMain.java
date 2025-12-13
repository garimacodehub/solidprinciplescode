package DIP;

public class ImplMain {
	
	public static void main(String[] args) {
		
		GitVersionControl git = new GitVersionControl();
		DevTeam dev = new DevTeam(git);
		
		dev.makecommit("InitialCommit");
		dev.performPull();
		dev.performPush();
	}

}
