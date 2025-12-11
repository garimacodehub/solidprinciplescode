package OCP;

public class SMSNotification implements Notification{

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		
		System.out.println("This is your SMSNotification" + message);
		
		
	}

}
