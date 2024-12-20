package Overriding;

public class Test1 {

	public void m1() {
		System.out.println("Test 1 : m1()");
	}
	
	private void m2() {
		System.out.println("Test 1 : m2()");
	}
	
	public Object checkOrder(int i, String j) {
		j="Overriding";
		System.out.println("Parent : Check Order");
		return j;
	}
}

