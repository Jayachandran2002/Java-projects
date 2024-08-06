package exercisePackage.DSA.Sorting;

public class SelectionSort {
    public int[] selectionSort(int[] arr){
        int min;
        int size = arr.length;


        for (int i = 0; i < size-1; i++) {
            min = i;
            for (int j = i+1; j < size ; j++) {

                if (arr[j] < arr[min]) {
                    min = j;

                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }
}
