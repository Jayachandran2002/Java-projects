package exercisePackage;
import java.util.*;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private int exp;
	
	Scanner sc = new Scanner(System.in);
	double getbacipay() {
		return basicPay;
	}
	
	void setbacipay() {
		System.out.println("Enter your basic pay: ");
		double basicPay = sc.nextDouble();
		this.basicPay = basicPay;
	}
	
	double getHra() {
		return hra;
	}
	
	void setHra() {
		System.out.println("Enter your Hra: ");
		double hra = sc.nextDouble();
		this.hra = hra;
	}
	
	int getExp() {
		return exp;
	}
	
	void setExp() {
		System.out.println("Enter your Experiance: ");
		int exp = sc.nextInt();
		this.exp = exp;
	}
	
	void calculateSalary() { 
		double per = 0;
		if( exp < 3) {
			per = (basicPay*0)/100;
		}else if (exp >=3 && exp<5) {
			per = (basicPay*5)/100;
		}else if(exp>=5 && exp<10) {
			per = (basicPay*7)/100;
		}else if(exp>=10) {
			per = (basicPay*12)/100;
		}
		salary = per + basicPay +hra;
		System.out.println("Employee Salary: "+salary);
	}
	
	void displayDetails() {
		System.out.println("----Permanent Employee----");
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee ID: "+empID);
		System.out.println("Employee Basic pay: "+basicPay);
		System.out.println("Employee HRA: "+hra);
		System.out.println("Employee Experiance: "+exp);
		
		
	}
}
