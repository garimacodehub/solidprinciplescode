package OCP;

import java.util.Scanner;

public class NotificationMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Testing email notification");
		String message = sc.nextLine();
		Notifier emailNotifier = new Notifier(new EmailNotification());
		emailNotifier.notifyUser(message);
		
		
		System.out.println("Testing sms notification");
		String otpmessage = sc.nextLine();
		Notifier smsNotifier = new Notifier(new SMSNotification());
		smsNotifier.notifyUser(otpmessage);
	}

}
