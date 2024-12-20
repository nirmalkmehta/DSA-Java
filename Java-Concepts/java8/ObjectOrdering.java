package java8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java8.Employee;

public class ObjectOrdering {
	
	public static List<Employee> getEmpList(){
		Employee e1 = new Employee(1, "Ankit", 10300);
		Employee e2 = new Employee(2, "Dev", 10100);
		Employee e3 = new Employee(6, "Anshu", 10500);
		Employee e4 = new Employee(4, "Diwakar", 10200);
		Employee e5 = new Employee(5, "Soni", 10400);
		Employee e6 = new Employee(3, "Moni", 10600);
		List<Employee> ls = new ArrayList<>();
		ls.add(e6);
		ls.add(e5);
		ls.add(e4);
		ls.add(e3);
		ls.add(e2);
		ls.add(e1);
		
		return ls;
	}

	public static void main(String[] args) {
		
		List<Employee> ls = getEmpList();
		
		//Order by name 
		Comparator<Employee> nameComp = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(ls, nameComp);
		
		//ls.forEach(System.out::println);
		
		//Order by salary
		
		/*Approach 1 - Using Java 7 and Lambda*/
		Collections.sort(ls, (m2, m1)-> Long.compare(m1.getSalary(), m2.getSalary()));
		//to get the asc order replace lambda argument as (m1,m2)
		ls.forEach(System.out::println);
		
		/*Approach 2 - Java 8 only*/
		List<Employee> ls1 = getEmpList();
		Collections.sort(ls1, Comparator.comparingLong(Employee:: getSalary).reversed());
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Java - 8 sorting of object in reversed order wrt salary");
		System.out.println("----------------------------------------------------------");
		ls1.forEach(System.out::println);
		
		// 2nd highest salary 
		
		List<Employee> ls2 = getEmpList();
		Optional<Employee> op =  ls2.stream()
									.sorted(Comparator.comparingLong(Employee:: getSalary).reversed())
									.skip(1)
									.findFirst();
		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("2nd Highest Salary :: "+ op.get().getSalary());
		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Any one Employee name starts with A");
		List<Employee> ls3 = getEmpList();
		
		Optional<Employee> em = ls3.stream()
								   .filter(e->e.getName().startsWith("A"))
								   .findAny();
								   
		System.out.println(em.get());
		
		System.out.println("----------------------------------------------------------");
		System.out.println("All Employee name starts with A");
		List<Employee> m = ls3.stream()
				   .filter(e->e.getName().startsWith("A"))
				   .collect(Collectors.toList());
		m.forEach(System.out::println);
	}

}
