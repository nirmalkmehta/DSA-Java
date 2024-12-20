package FactoryPattern;

public class NotificationFactory {

	public Notification createNotification(String s) {
		
		if(s==null || s.isEmpty()) {
			return null;
		}
		
		if("SMS".equals(s)) {
			return new MessageNotification();
		}else if("EMAIL".equals(s)) {
			return new EmailNotification();
		}
		
		return null;
	}
}
