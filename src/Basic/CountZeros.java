package Basic;

public class CountZeros {
    int c=0;
    public int countZeros(int num) {
        if(num==0)
            return 0;
        if(num%10==0)
            c++;


        countZeros(num/10);
        return c;
    }

    public static void main(String[] args) {
        CountZeros c=new CountZeros();
        System.out.println(c.countZeros(100000));

    }
}
