import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestCode {

	//Overloading
	public static void foo(Object o) {
		System.out.println("Object argument");
	}
	public static void foo(String s) {
		System.out.println("String argument");
	}
	
	//
	
	public static void reverseString() {
		String s = "edc212b2a";
		String revString = new StringBuilder(s).reverse().toString();
		System.out.println("Reverse string : "+revString);
		List<String> ls = Arrays.asList(s.split(""));
		Collections.sort(ls);
		System.out.println(ls);
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls);
		String reSt="";
		for(String a : ls) {
			reSt=reSt.concat(a);
		}
		String digitPattern = "[^\\pN]";
		String strPattern = "[^\\pL]";
		System.out.println(reSt.replaceAll(strPattern,"")+reSt.replaceAll(digitPattern,""));
		//System.out.println(reSt.replaceAll(digitPattern,""));
		//System.out.println(reSt.split(0,reSt.replaceAll(digitPattern,"").length()).);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		foo(null);
		System.out.println(0.1*7==0.7);
		System.out.println(0.1*4==0.4);
		
		Integer num1 = 1000, num2 = 1000;  
	    System.out.println(num1 == num2);//1
	    Integer num3 = 20, num4 = 20;  
	    System.out.println(num3 == num4);//2
	    
	    //Infinity test
	    System.out.println(1.0/0.0);
	    System.out.println(1.0/0);
	    System.out.println(1/0.0);
	   // System.out.println(1/0);//Exception
	    
	    char[] chars = new char[] {'\u0097'}; 
	    String str = new String(chars); 
	    byte[] bytes = str.getBytes(); 
	    System.out.println(Arrays.toString(bytes));

	    reverseString();
	}

}
