package exercisePackage.DSA.Queue;



public class MyQueue {
    private int[] queue = new int[5];
    int front = 0;
    int rear = 0;

    public void enQueue(int data){
        if (rear>=5){
            System.out.println("Cannot enqueue: Queue is Full");
        }
        else {
            if (rear == 0) {
                queue[front] = data;
            } else {
                queue[rear] = data;
            }
            rear++;

        }
    }

    public int deQueue(){
        if (rear<=0){
            System.out.println("Cannot dequeue:  Queue is empty");
            return -1;
        }
        else {
        int data = queue[front];
        front++;
        rear--;
        return data;
        }
    }

    public boolean isEmpty(){
        if (getSize()==0){
            return true;
        }
        return false;
    }

    public int getSize (){
        return rear;
    }

    public void show()
    {
        if(rear == 0){
            System.out.println("No elements in queue");
        }else {
            for (int i = 0; i < rear; i++) {
                System.out.println(queue[front + i]);

            }
            System.out.println("Elements");
            for (int n : queue) {
                System.out.println(n);
            }
        }
    }

}
