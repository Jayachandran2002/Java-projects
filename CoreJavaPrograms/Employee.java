package exercisePackage.CoreJavaPrograms;
import java.util.Scanner;

public class Employee {
	int empID;
	String Name;
	double salary;
	
	Scanner sc = new Scanner(System.in);
	
	int getimpID() {
		return empID;
	}
	
	void setimpID() {
		System.out.println("Enter Employee ID: ");
		int impID = sc.nextInt();
		this.empID = impID;
	}
	
	String getName() {
		return Name;
	}
	
	void setName() {
		System.out.println("Enter Employee Name: ");
		String Name = sc.nextLine();
		this.Name = Name;
	}
	

	

}
