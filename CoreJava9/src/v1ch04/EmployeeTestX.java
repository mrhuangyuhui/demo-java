package v1ch04;

import java.util.*;

import com.sun.javafx.sg.prism.web.NGWebView;

/**
 * 4-2 P107
 * @author Yuhui Huang
 */
public class EmployeeTestX {

	public static void main(String[] args) {

		/*Employee[] staff = new Employee[3];
		staff[0] = new Employee("Ken", 75000, 1987, 12, 15);
		staff[1] = new Employee("Mike", 50000, 1989, 10, 1);
		staff[2] = new Employee("Jim", 40000, 1990, 3, 15);
		
		for (Employee employee : staff) {
			employee.raiseSalary(5);
		}
		
		for (Employee employee : staff) {
			System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary() + ",hireDay=" + employee.getHireDay());
		}*/

	}

}

/*class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}*/
