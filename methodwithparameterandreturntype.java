package exercisePackage;

public class methodwithparameterandreturntype {
	int sum(int a,int b) {
		  int c;
		  c = a+b;
		  return c;
	}

	public static void main(String[] args) {
		methodwithparameterandreturntype s = new methodwithparameterandreturntype();
		System.out.println("Method with parameter and returntype:");
		System.out.println("Sum Is : "+s.sum(15, 20));

	}

}
