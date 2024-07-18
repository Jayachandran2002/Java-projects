package exercisePackage;
import java.util.*;

class Demo1 extends Thread {
    void Banking() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UserName: ");
        String uname = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        System.out.println("\nWelcome "+uname+"\nYour Password: "+pass+"\n");


    }

    void print() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println( "Pentagon  Space");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
public class ThreadsExample {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.Banking();
        d.print();
        System.out.println("Exiting Main");

    }
}
