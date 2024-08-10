package exercisePackage.DSA.LinkedList;

public class ExecuteMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ls = new MyLinkedList();

        ls.insert(12);
        ls.insert(22);
        ls.insert(55);

        ls.insertFirst(11);
        ls.insertFirst(9);
        ls.insertFirst(91);

        ls.insertLast(2);
        ls.insertLast(10);

        ls.insertFirst(10);

        ls.insertAt(40,4);
        ls.insertAt(80,7);

        ls.deleteAt(3);

        ls.show();
    }
}
