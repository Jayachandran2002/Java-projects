package exercisePackage.CoreJavaPrograms;
class Student {
	String name;
	int rollNo;
	String dept;
	char sec;
	String adrs;
		void stud() {
		System.out.println(name+" is Studying");
	}
	void play() {
		System.out.println(name+" is Playing");
	}
	void write() {
		System.out.println(name+" is Writting");
	}
	public static void main(String[] args) {
		Student S = new Student();
		S.name = "Rama";
		S.rollNo = 234567;
		S.dept = "Computer Science";
		S.sec = 'A';
		S.adrs = "Chennai";
		System.out.println("Student Name: "+S.name);
		System.out.println("Student Roll No: "+S.rollNo);
		System.out.println("Student Department: "+S.dept);
		System.out.println("Student Section : "+S.sec);
		System.out.println("Student Address: "+S.adrs+"\n");
		S.stud();
		S.play();
		S.write();
		}
}
