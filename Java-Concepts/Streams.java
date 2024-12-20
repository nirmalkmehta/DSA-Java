import java.util.*;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = new ArrayList<>();
		List<Integer> evLs = new ArrayList<Integer>();
		ls.add(1);ls.add(2);ls.add(6); ls.add(3);
		//ls.stream().filter(i->i%2==0 ).forEach(j-> evLs.add(j));
		//Collections.sort(evLs, Collections.reverseOrder());
		
		evLs = ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evLs);

	}

}
