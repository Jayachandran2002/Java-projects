package exercisePackage.CoreJavaPrograms;

public class StaticPratice {

    static int count;
    StaticPratice(){
        System.out.println("constructor");
        count++;
    }

    static {
        System.out.println("Static block one");
    }
    static {
        System.out.println("Static block two");
    }
    static {
        System.out.println("Static block three");
    }
    {
        System.out.println("Non-Static block one");

    }
    {
        System.out.println("Non-Static block two");

    }
    {
        System.out.println("Non-Static block three");

    }

    static void staticMethod(){
        System.out.println("Static Method");
    }
    void nonStaticMethod(){
        System.out.println("Non-Static Method");
    }

    public static void main(String[] args) {
        StaticPratice obj = new StaticPratice();
        StaticPratice obj2 = new StaticPratice();
        obj.staticMethod();
        obj.nonStaticMethod();
        obj2.staticMethod();
        obj2.nonStaticMethod();
        System.out.println("No of objects: "+StaticPratice.count);
    }

}
