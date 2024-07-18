package exercisePackage;

class Deadlock implements Runnable{
    String r1 = "Oracle";
    String r2 = "MongoDB";
    String r3 = "MySQL";


    public void run(){

            System.out.println(Thread.currentThread().getName());
            if (Thread.currentThread().getName().equals("Process 1")){
                process1();
            }else{
                process2();
            }


    }

    void process1(){
        synchronized (r1){
            System.out.println("Process 1 has r1");
            synchronized (r2){
                System.out.println("Process 1 has r2");
                synchronized (r3){
                    System.out.println("Process 1 has r3");
                }
            }
        }
    }
    void process2(){
        synchronized (r3){
            System.out.println("Process 2 has r3");
            synchronized (r2){
                System.out.println("Process 2 has r2");
                synchronized (r1){
                    System.out.println("Process 2 has r1");


                }
            }
        }
    }

}


public class DeadLockEx {
    public static void main(String[] args) {
        Deadlock d = new Deadlock();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
       t1.setName("Process 1");
       t2.setName("Process 2");
       t1.start();
       t2.start();
    }
}
