import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> tmp = new TreeMap<>();
		tmp.put(new Employee(1, "ABC"), "Bangalore");
		tmp.put(new Employee(2, "ABC"), "Bangalore");
		tmp.put(new Employee(3, "ABC"), "Bangalore");
		tmp.put(new Employee(4, "ABC"), "Bangalore");
		
		System.out.println(tmp);

	}

}
