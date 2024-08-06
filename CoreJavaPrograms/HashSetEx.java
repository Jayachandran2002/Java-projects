package exercisePackage.CoreJavaPrograms;

import java.util.*;

class HashSetObject{
    String name;
    int age;
    HashSetObject(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+" "+age;
    }
}





public class HashSetEx {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        LinkedHashSet lh = new LinkedHashSet();
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        while (choice==1){
            System.out.print("Enter Element: ");
            lh.add(sc.nextInt());
            System.out.print("Do you want to continue.. 1.Yes/ 2.No :");
            choice = sc.nextInt();
        }
        System.out.print(lh);
//        HashSetObject h = new HashSetObject("jai",22);
//        HashSetObject h1 = new HashSetObject("san",21);
//        HashSetObject h2 = new HashSetObject("ara",21);
//        HashSetObject h3 = new HashSetObject("sou",22);
//        HashSet hs = new HashSet();
//        hs.add(h);
//        hs.add(h1);
//        hs.add(h2);
//        hs.add(h3);
//        System.out.print(hs);


    }
}
