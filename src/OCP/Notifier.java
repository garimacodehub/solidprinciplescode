package OCP;

public class Notifier {
	
	private Notification notification;
	
	public Notifier(Notification notification) {
		this.notification = notification;
	}
	
	public void notifyUser(String message) {
		notification.send(message);
		
	}

}
