import SingletonPattern.Singleton;

public class CheckSingleton {

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		
		if(x==y) {
			System.out.println(" X == Y");
		}else {
			System.out.println(" X != Y");
		}

	}

}
