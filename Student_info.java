package exercisePackage;

public class Student_info {
	
	int studentID;
    String name;
	float qualifyingExamMark;
	char residentialStatus;
	int yearofEngg;
	
    int getStudentID() {
		return studentID;
	}
	void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	float getqualifyingmarkdetails() {
		return qualifyingExamMark;
	}
	void setqualifyingmarkdetails(float qualifyingExamMark) {
		this.qualifyingExamMark = qualifyingExamMark;
	}
	
	char getResidentialstatus() {
		return residentialStatus;
	}
	void setResidentialstatus(char residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	
	int getYearofengg() {
		return yearofEngg;
	}
	void setYearofengg(int yearofEngg) {
		this.yearofEngg = yearofEngg;
	}
	
	public static void main(String[] args) {
		Student_info stu = new Student_info();
		stu.setName("jacob");
		stu.setStudentID(1001);
		stu.setqualifyingmarkdetails(80f);
		stu.setResidentialstatus('H');
		stu.setYearofengg(3);
		System.out.println("Student Name: "+stu.getName());
		System.out.println("Student ID: "+stu.getStudentID());
		System.out.println("Qualifying Mark: "+stu.getqualifyingmarkdetails());
		System.out.println("Residential Status: "+stu.getResidentialstatus());
		System.out.println("Year of Engg: "+stu.getYearofengg());
	}
	
	
	

}
