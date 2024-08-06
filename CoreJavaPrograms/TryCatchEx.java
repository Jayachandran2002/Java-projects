package exercisePackage.CoreJavaPrograms;
class function1 extends function2{
   public void fun1(){
       try {


           System.out.println("Entering function 1");
           fun2();
       }
       catch (Exception e){
           System.out.println("mistake in function 1 ");
           throw e;
       }
    }
}

class function2{
  public void fun2(){
      try {
          System.out.println("Entering function 2 ");
          int a = 10, b = 0, c = a / b;
          System.out.println("Result: " + c);
      }
      catch (Exception e){
          System.out.println("mistake in function 2");
          throw e;

      }

    }
}

public class TryCatchEx {
    public static void main(String[] args) {
        try {
            System.out.println("Entering main normally");
            function1 f = new function1();
            f.fun1();
        }
        catch (Exception e){
            System.out.println("mistake in main");
        }

        System.out.println("Exiting main normally");
    }
}
