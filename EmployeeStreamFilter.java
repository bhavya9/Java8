package Java8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStreamFilter {

	public static void main(String[] args) {
		List<EmployeeFilter> empList = new ArrayList<>();
        empList.add(new EmployeeFilter("Nataraja G", "Accounts", 8000));
        empList.add(new EmployeeFilter("Nagesh Y", "Admin", 15000));
        empList.add(new EmployeeFilter("Vasu V", "Security", 2500));
        empList.add(new EmployeeFilter("Amar", "Entertinment", 12500));
 
        // find employees whose salaries are above 10000
        empList.stream().filter(emp->emp.getSalary() > 10000).forEach(System.out::println);
 
	}

}
