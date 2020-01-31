public class TestPrimeNumber {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new LazyPrimeFactorization());
        Thread t2 =new Thread(new OptimizedPrimeFactorization());
        t2.start();
        t1.start();
    }
}
