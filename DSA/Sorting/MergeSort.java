package exercisePackage.DSA.Sorting;

public class MergeSort {
    public int[] mergeSort(int[] arr){
        int arrLen = arr.length;
        if (arrLen < 2){
            return arr;
        }
        int mid = arrLen / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arrLen; i++) {
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        mergeArray(arr,left,right);

        return arr;

    }

    private void mergeArray(int[] arr, int[] left, int[] right) {
        int i=0, j=0, k=0;
        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
