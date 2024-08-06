package exercisePackage.CoreJavaPrograms;

public class Rectangle {
	private int length;
	private int breadth;
	 void calculatePerimeter(int a,int b) { 
		 length = a;
		 breadth = b;
		 System.out.println("Result: "+2*(length + breadth));
	 }
}
