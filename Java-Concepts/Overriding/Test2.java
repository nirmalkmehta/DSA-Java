package Overriding;

public class Test2 extends Test1{

	
	public void m1() {
		System.out.println("Test 2 : m1()");
	}
	
	public void m2() {
		System.out.println("Test 2 : m2()");
	}
	
	public Object checkOrder(int i, String j) {
		j = "Child class - Original";
		System.out.println(j);
		return j;
	}
	
	public Object checkOrder(String j, int i) {
		j = "Child class - Changed order of argument";
		System.out.println(j);
		
		return j;
	}
}
