package exercisePackage;

class task1 extends Thread{
    task1(String name){
        super(name);
        start();
    }
    public void run(){
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println( "Task1 is running");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class task2 extends Thread{
    task2(String name){
        super(name);
        start();
    }
    public void run(){
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println( "Task2 is running");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class task3 extends Thread{
    task3(String name){
        super(name);
        start();
    }
    public void run(){
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println( "Task3 is running");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ThreadsExample2{
    public static void main(String[] args) {
        task1 t1 = new task1("Task 1");
        task2 t2 = new task2("Task 2");
        task3 t3 = new task3("Task 3");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
    }
}
