package exercisePackage.DSA.Stack;

public class MyDynamicStack {
    private int capacity = 1;
    private int[] stack = new int[capacity];
    private int top = 0;

public void push ( int data)
{
    if (size() == capacity){
        expand();
    }
    stack[top] = data;
    top++;
}

    private void expand() {
        int len = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,len);
        stack = newStack;
        capacity *= 2;
    }
    public int getCapacity(){
    return capacity;
}

    public int pop(){
    if (isEmpty()){
        System.out.println("Cannot pop: Stack is empty");
        return -1;
    }else {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        shrink();

        return data;
    }
}

    private void shrink() {
    int len = size();
    if(len <=(capacity/2)/2){
        capacity /= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,len);
        stack = newStack;
    }
    }

    public int peek(){
    if (top == 0){
        System.out.println("Stack is Empty");
        return -1;
    }
    int data;
    data = stack[top-1];
    return data;
}

public int size(){
    return top;
}

public boolean isEmpty(){
    return top <= 0;
}
public void show()
{
    for (int i = 0; i < top; i++) {
        System.out.println(stack[i]);

    }
}

}
