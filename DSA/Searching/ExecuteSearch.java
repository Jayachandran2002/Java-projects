package exercisePackage.DSA.Searching;


public class ExecuteSearch {
    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();
        BinarySearch bs = new BinarySearch();

        int[] arr = {2,3,5,6,7,8,9,10,12,13,14,15,16,19};

        int res = ls.linearSearch(arr,19);
        int res2 = bs.binarySearch(arr,19);
        System.out.println("LS-Index: "+res);
        System.out.println("BS-Index: "+res2);

    }
}
