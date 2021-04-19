package Listing4_6;
import Listing4_7.Employee;
public class PackageTest {
	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		 
		harry.raiseSalary(5);
		 
		// because of the static import statement, we don't have to use System.out here
		System.out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());	

	}
}
