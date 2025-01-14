package Basic;

/*Sum of Digits:
Write a recursive function to calculate the sum of digits of a given number
*/
public class SumOfDigits {
    int sum=0;
    public int sumOfDigits(int num){

        if(num==0)
            return 0;

        sum+=num%10;
        sumOfDigits(num/10);
        return sum;


    }

    public static void main(String[] args) {
        SumOfDigits s=new SumOfDigits();
        System.out.println(s.sumOfDigits(1234));
    }
}
