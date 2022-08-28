package easy;

public class Fib {
    public int fib(int n) {
        final int Mod = 1000000007;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int p = 0, q = 0 ,r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % Mod;
        }
        return r;
    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        int fib1 = fib.fib(2);
        int fib2 = fib.fib(3);
        int fib3 = fib.fib(4);
        System.out.println(fib1);
        System.out.println(fib2);
        System.out.println(fib3);

        //System.out.println(3);
    }
}
