package exercisePackage.DSA.Sorting;

public class ExecuteSorting {
    public static void main(String[] args) {

        BubbleSort bSort = new BubbleSort();
        SelectionSort sSort = new SelectionSort();
        InsertionSort iSort = new InsertionSort();
        QuickSort qSort = new QuickSort();

        int[] arr = {1,4,6,2,3,46,6,78,97,5,4,3};


        System.out.println("Before Sort");
        for(int a:arr){
            System.out.print(a+" ");
        }



        int[] res = qSort.quickSort(arr,0,arr.length-1);



        System.out.println();
        System.out.println("After sort");
        for(int a:res){
            System.out.print(a+" ");
        }
    }
}
