package java8;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		
		List < Integer > list = new ArrayList < Integer > ();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        System.out.println("Unordered : "+ list);
        
        // Normal ordering of integer using java libraries
        /*
	        //Reverse order
	        Collections.reverse(list);
	        System.out.println("Reverse order : "+ list);
	
	        
	        Collections.sort(list, Comparator.reverseOrder());
	        System.out.println("Descending order : "+ list);
	       
	        //Ascending order sort
	        Collections.sort(list);
	        System.out.println("Ascending order : "+ list);
	        
	        list.sort(null);
       		System.out.println("Sorted Asc : "+list);
         
        */
        
        // Ordering using stream
        
        List <Integer> ascOrdered = list.stream()
							        	.sorted()
							        	.collect(Collectors.toList());
        
        System.out.println("ascOrdered : "+ascOrdered);
        
        
        List <Integer> descOrdered = list.stream()
						            	 .sorted(Comparator.reverseOrder())
						            	 .collect(Collectors.toList());
            
            System.out.println("Desc Ordered : "+descOrdered);
  
	}

}
