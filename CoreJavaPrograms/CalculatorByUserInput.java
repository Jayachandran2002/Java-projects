package exercisePackage.CoreJavaPrograms;
import java.util.Scanner;

public class CalculatorByUserInput {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value for number1: ");
		a = scan.nextInt();
		System.out.print("Enter value for number2: ");
		b = scan.nextInt();
		int sum = a+b;
		int sub = a-b;
		int div = a/b;
		int mul = a*b;
		System.out.println("\nThe Sum Value of Numbers:"+sum);
		System.out.println("\nThe Subtract Value of Numbers:"+sub);
		System.out.println("\nThe Multiple Value of Numbers:"+mul);
		System.out.println("\nThe Divide Value of Numbers:"+div);
		
		
	}

}
