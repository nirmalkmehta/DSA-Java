package Overriding;

public class OverridingTest extends Test2{

	public static void main(String... str) {
		//Test2 t = new Test1(); --->::---> ERROR
		Test1 t = new Test2();
		t.m1();
		
		t.checkOrder(0, "XXXXXXX");
		
		
	}

}
