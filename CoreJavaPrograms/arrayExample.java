package exercisePackage.CoreJavaPrograms;
import java.util.*;
public class arrayExample {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int j =1;
		for(int i=0; i<=4;++i) {
			System.out.print("Enter element "+j+":");
			a[i] = sc.nextInt();
			j++;
			
		}
		System.out.println("Length of array: "+a.length);
		for(int i=0; i<=4;++i) {
			System.out.print(a[i]);
	
	}
}
}
