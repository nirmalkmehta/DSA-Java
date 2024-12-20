package FactoryPattern;

public class NotificationService {

	public static void main(String[] args) {
		NotificationFactory nff = new NotificationFactory();
		Notification nf = nff.createNotification("EMAIL");
		nf.notifyUser();
	}

}
