package CustomException;

public class TestCustomException {

	public static void testMethod(int i) throws MyCustomException {
		if(i<0) {
			throw new MyCustomException("Invalid number !!");
		}else {
			System.out.println("Valid number.");
		}
	}
	
	public static void main(String[] args) throws MyCustomException {
		//testMethod(-1);
		try {
			testMethod(-1);
			testMethod(4);
		}catch(MyCustomException e) {
			e.printStackTrace();
		}

	}

}
