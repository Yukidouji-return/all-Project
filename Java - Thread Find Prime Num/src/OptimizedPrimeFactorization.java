public class OptimizedPrimeFactorization implements Runnable {
    public OptimizedPrimeFactorization(){}
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println("Tang toc: "+i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
