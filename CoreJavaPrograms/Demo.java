package exercisePackage.CoreJavaPrograms;

class HomeLoan{
	  int tenure;
	  double principal;
	  float interestRate;
	  String accountNumber;
	  public double calculateEMI(){
	      double simpleInterest = (principal*interestRate*tenure)/100;
	      return (simpleInterest+principal)/tenure;
	  }
	}


	class Demo extends HomeLoan {
	  Demo() {
	    tenure = 5; //reusing super class member variables
	    principal = 20000;
	    interestRate = 8.5f;
	    accountNumber = "Acc12345";
	  }

	public static void main(String[] args) {
	    Demo hloan = new Demo();
	    double amount = hloan.calculateEMI();  // sub class Object
	                                            // invoking super class method
	    System.out.println("emi per year..." + amount);
	    
	  }
	}