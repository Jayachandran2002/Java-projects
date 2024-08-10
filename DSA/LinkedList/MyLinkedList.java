package exercisePackage.DSA.LinkedList;

public class MyLinkedList {
    private Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else {
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertLast(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        while (n.next!=null){
            n= n.next;
        }
        n.next = node;
    }

    public void insertAt(int data, int index){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0){
            insertFirst(data);
        }
        else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteAt(int index){
        Node n = head;

        if(index == 0){
            head = n.next;
        }else {
            for (int i = 0; i < index-1; i++) {
                n = n.next;
            }
            Node n1 = n.next;
            n.next = n1.next;
        }
    }

    public void show(){
        Node n = head;
        while (n.next!=null){
            System.out.println(n.data);
            n= n.next;
        }
        System.out.println(n.data);
    }

}
