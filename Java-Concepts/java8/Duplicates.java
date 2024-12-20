package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		//Character[] numbers = new Character[] { '1', '2', '1', '3', '4', '4' };
		String s = "jdkjsajk";
		
		String x =  s.chars()
							 .mapToObj(i -> Character.valueOf((char) i))
							 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
							 .toString();
							 
							 /*.entrySet()
							 .stream()
							 .filter(m -> m.getValue()>1)
							 .map(Map.Entry:: getKey)
							 .collect(Collectors.toSet());*/
		
		System.out.println(x);
									  
		System.out.println("--------------------------------------------------"); 
		
		
		int[] numArr = { 1, 2, 1, 3, 4, 4 };
		Set<Integer> numInt = new HashSet<Integer>();
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(1);
		ls.add(3);
		ls.add(4);
		ls.add(4);
		ls.add(5);
		
		Set<Integer> duplicates = ls.stream()
								    .filter(a-> !numInt.add(a))
								    .collect(Collectors.toSet());
		
		System.out.println(duplicates);
		System.out.println("----------------------------------------------------------");
		
		
		String sentence = "I am going to school and in the school I am going to have lunch today";
		
		String[] sentArr = sentence.split(" ");
		List<String> strArray =  Arrays.asList(sentArr)
									  .stream()
									  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
									  .entrySet()
									  .stream()
									  .filter(m->m.getValue()>1)
									  .map(Map.Entry::getKey)
									  .collect(Collectors.toList());
		
		System.out.println(strArray);
		System.out.println("----------------------------------------------------------");
		
		Collections.sort(strArray, Comparator.reverseOrder());
		System.out.println(strArray);
		System.out.println("----------------------------------------------------------");
		
		

	}

}
