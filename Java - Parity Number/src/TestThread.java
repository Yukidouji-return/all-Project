public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        int num = 10;
        Thread t1 = new OddThread(num);
        Thread t2 = new EvenThread(num);
        t1.start();
        t1.join();
        t2.start();
    }
}