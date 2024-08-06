package exercisePackage.CoreJavaPrograms;

import java.util.*;

public class MapsEx {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("jai","age:21, address:chennai\n");
        hm.put("sam","age:21, address:mumbai\n");
        hm.put("ram","age:21, address:delhi\n");
        hm.put("abdul","age:21, address:chennai\n");
        hm.put("patel","age:21, address:kerala\n");
        System.out.println(hm);


        TreeMap tm = new TreeMap();
        tm.put("jai","age:21, address:chennai\n");
        tm.put("sam","age:21, address:mumbai\n");
        tm.put("ram","age:21, address:delhi\n");
        tm.put("abdul","age:21, address:chennai\n");
        tm.put("patel","age:21, address:kerala\n");
        System.out.println(tm);
        System.out.println(tm.firstKey());
        System.out.println(tm.firstEntry());
        System.out.println(tm.floorKey("jai"));
        System.out.println(tm.floorEntry("jai"));


    }
}
