package exercisePackage.CoreJavaPrograms;

enum Grades{
    A,B,C,D,E

}
class StudentDetail {
    int sid;
    String name;
    Grades grades;
    int scholarshipAmount;
    int totalMarks;

    void setDetails(String name, int sid, int totalMarks) {
        this.name = name;
        this.sid = sid;
        this.totalMarks = totalMarks;
        calculateGrade();
    }

    public void calculateGrade() {
        if (totalMarks >= 250) {
            grades = Grades.A;
        } else if (totalMarks >= 200 && totalMarks < 250) {
            grades = Grades.B;
        } else if (totalMarks >= 175 && totalMarks < 200) {
            grades = Grades.C;
        } else if (totalMarks >= 150 && totalMarks < 175) {
            grades = Grades.D;
        } else {
            grades = Grades.E;
        }
        calculateScholarship();
    }

    public void calculateScholarship() {
        switch (grades) {
            case A:
                scholarshipAmount = 5000;
                break;
            case B:
                scholarshipAmount = 4000;
                break;

            case C:
                scholarshipAmount = 3000;
                break;
            case D:
                scholarshipAmount = 2000;
                break;
            default:
                scholarshipAmount = 0;
                break;
        }

    }
    void printDetais(){
        System.out.println("Student Details");
        System.out.println("-----------------");
        System.out.println("Student Name :"+name);
        System.out.println("Student ID :"+sid);
        System.out.println("Student Grade :"+grades);
        System.out.println("ScholarShip Amount :"+scholarshipAmount);

    }
}

class EnumExercise {
    public static void main(String[] args) {
        StudentDetail s = new StudentDetail();
        s.setDetails("jai",1001,100);
        s.printDetais();
    }
}