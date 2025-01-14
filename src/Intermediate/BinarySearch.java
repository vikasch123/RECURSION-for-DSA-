package Intermediate;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int lo=0;
        int hi=arr.length-1;
        return binsrch(arr,lo,hi,target);
    }


    public int binsrch(int[] arr, int lo, int hi, int target) {
        if(lo>hi)
            return -1;

        int mid=(lo+hi)/2;
        if(arr[mid]==   target)
            return mid;
        else if(arr[mid]>target)
            return binsrch(arr,lo,mid-1,target);
        else
            return binsrch(arr,mid+1,hi,target);
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(bs.binarySearch(arr, 5));
    }
}
