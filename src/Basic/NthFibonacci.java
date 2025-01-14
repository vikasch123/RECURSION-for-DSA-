package Basic;

public class NthFibonacci {
    public int nthFibonacci(int n) {
        if (n == 1) {

            return 0;
        }
        if (n == 2) return 1;

        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        NthFibonacci f = new NthFibonacci();
        System.out.println(f.nthFibonacci(6));
    }
}
