package exercisePackage.CoreJavaPrograms;
import java.util.*;
public class arrayExample2D {
	public static void main(String[] args) {
		int arr[][] = new int[3][4];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element for "+i+" block:");
			for(int j=0; j<arr[0].length; j++) {
				System.out.print("Enter element :");
				arr[i][j] = s.nextInt();
			}
		}
		
	}
}
