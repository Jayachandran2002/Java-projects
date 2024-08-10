package exercisePackage.DSA.Stack;

public class MyStackExecute {
    public static void main(String[] args) {
        MyDynamicStack stack = new MyDynamicStack();

        stack.push(11);
        stack.push(45);
        stack.push(11);
        stack.push(11);
        stack.push(11);
        stack.push(11);
        stack.push(11);
        stack.push(11);
        stack.push(11);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();



        System.out.println("Peek item: "+stack.peek());
        System.out.println("Stack is Empty: "+stack.isEmpty());
        System.out.println("Stack Size: "+stack.size());
        System.out.println("Stack capacity: "+stack.getCapacity());
        stack.show();
    }

}
