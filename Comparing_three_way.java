package exercisePackage;

public class Comparing_three_way {
	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "Sita";
		int res = s1.compareTo(s2);
		if(res==0) {
			System.out.println("Equal");
		}
		else if(res > 0){
			System.out.println("S1 is greater");
		}
		else {
			System.out.println("S2 is greater");
		}
		
	}

}
