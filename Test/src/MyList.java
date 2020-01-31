class Task {
    private Object key1 = new Object();
    private Object key2 = new Object();
    public void task1() {
        synchronized (key1) {
            System.out.println("["+ Thread.currentThread().getName() + "]" + "I am doing task1");
            task2();
        }
    }
    public void task2() {
        synchronized (key2) {
            System.out.println("["+ Thread.currentThread().getName() + "]" + "I am doing task2");
            task3();
        }
    }
    public void task3() {
        synchronized (key1) {
            System.out.println("["+ Thread.currentThread().getName() + "]" + "I am doing task3");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Runnable runable1 = () -> task.task1();
        Runnable runable2 = () -> task.task2();
        Thread thread1 = new Thread(runable1);
        thread1.start();
        Thread thread2 = new Thread(runable2);
        thread2.start();
        thread1.join();
        thread2.join();
    }
}