package exercisePackage;

import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {
        try {
//            Vector v = new Vector();
//            v.add(10);
//            v.add(20);
//            v.add(30);
//            v.add(40);
//            v.add(50);
//            v.add(60);
//            v.add(70);
//            System.out.println("Vector is\n" + v);
//            System.out.println("Vector Size:" + v.size());
//            System.out.println("Vector capacity:" + v.capacity());
//            for (Object o : v) {
//                System.out.println(o);
//
//            }
//            System.out.println("Printing using Iterator");
//            Iterator itr = v.iterator();
//            while (itr.hasNext()) {
//                System.out.print(itr.next() + " ");
//            }
//            System.out.println("\nPrinting using ListIterator");
//            ListIterator litr = v.listIterator();
//            while (litr.hasNext()) {
//                System.out.print(litr.next() + " ");
//
//            }
//            System.out.println("\nPrinting using ListIterator in reverse");
//            ListIterator llitr = v.listIterator(v.size());
//            while (llitr.hasPrevious()) {
//                System.out.print(llitr.previous() + " ");
//
//            }
//            LinkedList l = new LinkedList();
//            l.add(10);
//            l.add(20);
//            l.add(30);
//            l.add(40);
//            l.add(50);
//            l.add(60);
//            l.add(70);
//            System.out.println("\nPrinting using descending");
//            Iterator llitr1 = l.descendingIterator();
//            while (llitr1.hasNext()) {
//                System.out.print(llitr1.next() + " ");
//
//            }
            TreeSet t = new TreeSet();
            t.add(10);
            t.add(9);
            t.add(2);
            t.add(6);
            t.add(7);
            System.out.println(t);
            System.out.println(t.first());
            System.out.println(t.higher(5));
            System.out.println(t.ceiling(8));


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
