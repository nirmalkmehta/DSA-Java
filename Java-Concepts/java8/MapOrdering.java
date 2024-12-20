package java8;

import java.util.*;

public class MapOrdering {
	
	public static  Map<String, Integer> getMap() {
		
        Map<String, Integer> countryPopulation = new TreeMap<>(); 
        
        countryPopulation.put("Indian", 382357386);
        countryPopulation.put("Chinese", 409900000);
        countryPopulation.put("America", 332429717);
        countryPopulation.put("Russia", 146748590);
        countryPopulation.put("Brazil", 213728559);
        countryPopulation.put("Mexico", 127792286);
        countryPopulation.put("Pakistan", 220892331);
        
        return countryPopulation;
	}

	public static void main(String[] args) {
		Map<String, Integer> cp = getMap();
		List<Map.Entry<String, Integer>> ls = new LinkedList<>(cp.entrySet());
		
		Collections.sort(ls, (m1, m2)->m1.getKey().compareTo(m2.getKey()));
		

	}

}
