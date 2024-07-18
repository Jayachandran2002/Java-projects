package exercisePackage;

public class printSdetails {
	public static void main(String[] args)
	{
		studentDetails Stud = new studentDetails();
		Stud.name = "Reynolds";
		Stud.rollNo = 434545;
		Stud.dept =  "B.sc CS";
		
		System.out.println("Student Name: "+Stud.name);
		System.out.println("Student RollNo: "+Stud.rollNo);
		System.out.println("Student Department: "+Stud.dept);

}
}