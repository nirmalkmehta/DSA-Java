package FactoryPattern;

public class MessageNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending a message..");
	}

}
