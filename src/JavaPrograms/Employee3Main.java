package JavaPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Employee3Main {
	public static void main(String[] args) {
		
		List<Employee3> list = new ArrayList<>();
		list.add(new Employee3(111, "Ravikanth", 19, "male", "Developer", 2011, 22000.0));
		list.add(new Employee3(121, "Gnd", 26, "male", "Tester", 2013, 52000.0));
		list.add(new Employee3(133, "Chaitanya", 24, "male", "Tester", 2012, 50000.0));
		list.add(new Employee3(144, "Rakul", 33, "female", "Developer", 2010, 43000.0));
		list.add(new Employee3(154, "Mrunal", 31, "female", "HR", 2013, 52000.0));
		list.add(new Employee3(127, "Ramcharan", 35, "male", "Developer", 2015, 66000.0));
		list.add(new Employee3(129, "Pavan", 38, "male", "Tester", 2011, 69000.0));
		list.add(new Employee3(120, "Kohli", 33, "male", "Developer", 2011, 66000.0));
		list.add(new Employee3(135, "Anuska", 31, "female", "HR", 2011, 63000.0));
		
		System.err.println("Male and Female Employees Counting_______");
		Map<String, Long>listEmp = list.stream().collect(Collectors.groupingBy(Employee3::getGender, Collectors.counting()));
		System.out.println(listEmp);
		
		System.err.println("maximum Salary of employee_____");
		 Optional<Employee3> maxSal = list.stream().max(Comparator.comparingDouble(Employee3::getSalary));
		 System.out.println(maxSal.get().getName() +"____"+maxSal.get().getSalary());
		 
		 System.err.println("All Department Names ----");
		System.err.println("------------------");
		list.stream().map(Employee3::getDepartment).distinct().forEach(n->{
			System.out.println(n);
		});
		
		System.err.println("Average Age of male and female Employees");
		Map<String, Double> avgAge = list.stream().collect(Collectors.groupingBy(Employee3::getGender, Collectors.averagingInt(Employee3::getAge)));
		System.out.println(avgAge);
		
		System.err.println("Highest paid Employee in Organization:_____");
		Optional<Employee3> max = list.stream().max(Comparator.comparing(Employee3::getSalary));
		System.out.println(max.get().getSalary());
		
		System.err.println("Get the Name of employee join after 2011");
		list.stream().filter(n -> n.getDateOfJoining()>2011).map(Employee3::getName).forEach(n -> {
			System.out.println(n);
		});
		
	}

}
