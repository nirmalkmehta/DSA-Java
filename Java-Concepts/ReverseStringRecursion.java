
public class ReverseStringRecursion {

	static void revString(String str) {
		
		if(str==null || str.length()==0) {
			System.out.println(str);
		}else {
			System.out.print(str.charAt(str.length()-1));
			revString(str.substring(0,str.length()-1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revString("ABC");
	}

}
