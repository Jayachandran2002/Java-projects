package exercisePackage.DSA.Searching;

public class BinarySearch {
    public  int binarySearch(int[] arr,int t){
        int start = 0;
        int end = arr.length-1;
        int steps = 0;

        while (start <= end){
            int mid = (start+end)/2;
            if (arr[mid] == t){
                System.out.println("BS-Steps: " + steps);
                return mid;
            } else if (arr[mid] < t) {
                start = mid+1;

            } else if (arr[mid] > t) {
                end = mid-1;

            }
            steps++;
        }
        System.out.println("BS_Steps: " + steps);
        return -1;
    }
}
