package exercisePackage.CoreJavaPrograms;

public interface interface3 extends interface1,interface2{
    default void add(){
        System.out.println("Addition Block");
    }
    default void sub(){
        System.out.println("Sub Block");
    }
}
