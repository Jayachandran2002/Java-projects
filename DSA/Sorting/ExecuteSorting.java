package exercisePackage.DSA.Sorting;

public class ExecuteSorting {
    public static void main(String[] args) {

        BubbleSort bSort = new BubbleSort();
        SelectionSort sSort = new SelectionSort();
        InsertionSort iSort = new InsertionSort();
        QuickSort qSort = new QuickSort();
        MergeSort mSort = new MergeSort();

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }


        System.out.println("Before Sort");
        for(int a:arr){
            System.out.println(a);
        }



        int[] res = mSort.mergeSort(arr);



        System.out.println();
        System.out.println("After sort");
        for(int a:res){
            System.out.println(a);
        }
    }
}
