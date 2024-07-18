package exercisePackage;

public class methodwithreturntypeandwithoutparameter {

	int sum() {
		  int a, b, c;
		  a = 10;
		  b = 70;
		  c = a+b;
		  return c;
	}

	public static void main(String[] args) {
		methodwithreturntypeandwithoutparameter s = new methodwithreturntypeandwithoutparameter();
		System.out.println("Method with returntype and without parameters:");
		System.out.println("Sum Is : "+s.sum());
		}
}
