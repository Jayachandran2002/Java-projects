package exercisePackage;
import java.util.*;

public class ContractEmployee extends Employee {
	private double wages;
	private int hrs;
	
	Scanner sc = new Scanner(System.in);
	double getwages() {
		return wages;
	}
	
	void setwages() {
		System.out.println("Enter your Wages: ");
		double wages = sc.nextDouble();
		this.wages = wages;
	}

	int getHrs() {
		return hrs;
	}
	
	void setHrs() {
		System.out.println("Enter your Working Hours: ");
		int hrs = sc.nextInt();
		this.hrs = hrs;
	}
	void calculateSalary() {
		salary = hrs*wages;
		System.out.println("Employee Salary: "+salary);
	}
	
	void displayDetails() {
		System.out.println("----Contract Employee----");
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee ID: "+empID);
		System.out.println("Employee Working Hours: "+hrs);
		System.out.println("Employee Wages: "+wages);

		
	}
}
