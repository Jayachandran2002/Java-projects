package exercisePackage.CoreJavaPrograms;

import java.util.Arrays;
import java.util.OptionalInt;

public class VarargsExercise1 {
    public static int sum = 0;
    static int[] displayList(int... List){
        int[] value = new int[List.length];
        int j = 0;

        for (int i:List) {
            value[j] = i;
            sum += i;
            j++;
        }
        System.out.println("Sum is: "+sum);
       return value;

    }
    public static OptionalInt maxofList(int[] list){
        return Arrays.stream(list).max();
    }

    public static void main(String[] args)  {
        int[] list = displayList(11,2,3,4,5,6,7,8,9);
        System.out.println("List is: "+ Arrays.toString(list));
        OptionalInt maxlist = maxofList(list);
        System.out.println("Max List is: "+maxlist);
        System.out.println("Sum of  List is: "+sum);
        System.out.println("Average of List is: "+sum / (list.length));


    }
}
