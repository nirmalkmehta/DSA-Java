
public class B extends A {
	int i = 20;
	B(){
        System.out.println(2);
    }
	
	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.i);
	}
}
