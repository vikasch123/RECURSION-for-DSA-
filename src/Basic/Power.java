package Basic;/*
Basic.Power Calculation:

Implement a recursive function to calculate
𝑥
𝑛
x
n
  (where
𝑥
x is the base and
𝑛
n is the exponent).
 */


public class Power {

    public int power(int x, int n) {
        if(n==0)
            return 1;

        return x*power(x,n-1);
    }


    public static void main(String[] args) {
        Power p = new Power();
        System.out.println(p.power(2,3));
    }
}
