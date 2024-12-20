package SingletonPattern;

public class Singleton {
	private static Singleton single_instance = null;
	//make constructor private
	private Singleton() {}
	
	//static method that has return type object of this singleton class
	public static Singleton getInstance() {
		if(single_instance==null) {
			single_instance = new Singleton();
		}
		
		return single_instance;
	}
}
