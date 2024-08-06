package exercisePackage.CoreJavaPrograms;



public class ForLoopEx {
	public static void main(String[] args) {
		int i, j, r = 5;
		for (i=0; i<r ; i++) {
			for (j = 0;  j<i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
