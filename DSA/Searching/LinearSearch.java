package exercisePackage.DSA.Searching;


public class LinearSearch {
    public  int linearSearch(int[] arr, int t) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == t) {
                System.out.println("LS-Steps: " + steps);
                return i;
            }
        }
        System.out.println("LS-Steps: " + steps);
        return -1;
    }
}