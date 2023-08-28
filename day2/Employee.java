package day2;
import java.util.*;
public class Employee implements  {

	 int empid;
	 String name;
	 
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>empList=new ArrayList<Employee>();
		Employee emp1=new Employee(3,"java");
		Employee emp2=new Employee(4,"python");
		Employee emp3=new Employee(5,"ice");
	  
        empList.add(emp1);
        empList.add(emp2); 
        System.out.println("Salary collection");
//        Collections.sort( empList);
//	        
//	        for (Employee emps:empList) {
//	            System.out.println("Eid is"+emps.id+"name is"+emps.name+"salary is"+emps.salary);
//	        }

	

	
		 
		 
	}

}
