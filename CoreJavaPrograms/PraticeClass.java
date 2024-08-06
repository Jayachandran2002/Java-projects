package exercisePackage.CoreJavaPrograms;


record RecordClass(String name,int age){}


public class PraticeClass {
    public static void main(String[] args) {
        RecordClass r = new RecordClass("Jai",21);
        System.out.println(r.name()+" : "+r.age());

    }
}
