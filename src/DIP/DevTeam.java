package DIP;

public class DevTeam {
	
	private IVersionControl versionControl;
	
	public DevTeam(IVersionControl vc) {
		this.versionControl=vc;
	}
	
	public void makecommit(String message) {
		versionControl.commit(message);
	}
	
	public void performPush() {
		versionControl.push();
	}
	
	public void performPull() {
		versionControl.pull();
	}

}
