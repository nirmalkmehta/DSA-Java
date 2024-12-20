import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BalancedBarckets {
	
	
	public static boolean checkBalancedBrackets(String str) {
		
		Deque<Character> stack = new ArrayDeque<Character>(); 
		
		for(int i=0;i<str.length(); i++) {
			char expr = str.charAt(i);
			if(expr=='{' || expr=='(' || expr=='[') {
				stack.push(expr);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			
			char check;
			
			switch(expr) {
			
			case ')':
				check = stack.pop();
				if(check=='}' || check==']') {
					return false;
				}
				break;
				
				
			case '}':
				check = stack.pop();
				if(check==')' || check==']') {
					return false;
					}
				break;
				
			
			case ']':
				check = stack.pop();
				if(check=='}' || check==')') {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkBalancedBrackets("(])"));

	}

}
