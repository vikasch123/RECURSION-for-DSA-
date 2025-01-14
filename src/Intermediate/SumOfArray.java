package Intermediate;

public class SumOfArray {

    public int sumOfArray(int[] arr) {

            return sumArray(arr,0);


    }

    private int sumArray(int[]arr,int index)
    {
        if(index==arr.length)
            return 0;

        return arr[index]+sumArray(arr,index+1);
    }

    public static void main(String[] args) {
        SumOfArray s = new SumOfArray();
        int[] arr = {1,2,3,4,5};
        System.out.println(s.sumOfArray(arr));
        
    }



}
