package exercisePackage.DSA.Sorting;

public class InsertionSort {
    public  int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i-1;
            while (key < arr[j] && j >= 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =key;
        }

        return arr;
    }
}
