package exercisePackage;

class database implements Runnable{
    database(){
        Thread t1 = new Thread(this);
        Thread t2 = new Thread(this);
        Thread t3 = new Thread(this);
        t1.setName("Boy");
        t2.setName("Girl");
        t3.setName("Others");
        try {
            t1.start();
            t2.start();
            t3.start();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public synchronized void run(){
        try {
            System.out.println(Thread.currentThread().getName()+" has entered bathroom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" has closed bathroom");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" has left bathroom");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}


public class SynchronizeEx {
    public static void main(String[] args) {
         new database();
    }
}
