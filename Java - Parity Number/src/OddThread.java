public class OddThread extends Thread {
    public int number;

    public OddThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        synchronized (this) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }
            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
