package exercisePackage.CoreJavaPrograms;
import java.util.*;

public class EmployeeRecords {
	public static void main(String[] args) {
		PermanentEmployee Pemp = new PermanentEmployee();
		ContractEmployee Cemp = new ContractEmployee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Know your Salary");
		System.out.println("----------------");
		System.out.println("Select option \n1.Permanent Employee\n2.Contact Employee");
		System.out.print("Enter Option: ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			Pemp.setName();
			Pemp.setimpID();
			Pemp.setbacipay();
			Pemp.setHra();
			Pemp.setExp();
			Pemp.displayDetails();
			Pemp.calculateSalary();
			break;
			
		case 2:
			Cemp.setName();
			Cemp.setimpID();
			Cemp.setwages();
			Cemp.setHrs();
			Cemp.displayDetails();
			Cemp.calculateSalary();
			break;
			
		default:
			System.out.println("-----Enter Valid Option-----");
		}
		
	}
}
