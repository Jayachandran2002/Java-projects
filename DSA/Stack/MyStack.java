package exercisePackage.DSA.Stack;


public class MyStack {
    private int[] stack = new int[5];
    private int top = 0;

        public void push ( int data)
        {
            if (top >= 5){
                System.out.println("Cannot push: Stack is Full");
            }else {
                stack[top] = data;
                top++;
            }
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

                return data;
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
