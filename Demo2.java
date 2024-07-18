package exercisePackage;

public class Demo2 extends HomeLoan{
	Demo2(){
		  tenure = 6; //reusing super class member variables
		    principal = 20000;
		    interestRate = 8.0f;
		    accountNumber = "Acc123456";
	}
	public static void main(String[] args) {
		Demo2 Gloan = new Demo2();
		System.out.println("----Home Loan---");
	    double amount1 = Gloan.calculateEMI();  
	    System.out.println("emi per year..." + amount1);
	}
}
