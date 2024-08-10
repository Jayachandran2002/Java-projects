package exercisePackage.DSA.Queue;

public class QueueExecute {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue(12);
        queue.enQueue(65);
        queue.enQueue(67);
        queue.enQueue(87);
        queue.enQueue(34);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();


        System.out.println("is empty: "+queue.getSize());
        System.out.println("Size: "+queue.getSize());
        System.out.println("Empty: "+queue.isEmpty());

        queue.show();
    }

}
