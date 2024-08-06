package exercisePackage.CoreJavaPrograms;

class count{
    static int count;
    count(){
        count++;
    }
    {
        System.out.println("non static block");
    }
    static {
        System.out.println(" static block");
    }
    }


public class Staticexample {
    public static void main(String[] args) {
        count obj = new count();
        count obj2 = new count();
        count obj3 = new count();
        System.out.println("No.of object: "+count.count);

    }
}
