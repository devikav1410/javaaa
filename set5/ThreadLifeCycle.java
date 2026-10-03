class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(2000);
            System.out.println("Thread woke up after sleep.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread is completing.");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("Thread created (NEW state).");

        t1.start();
        System.out.println("Thread started (RUNNABLE state).");

        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Thread has terminated.");
    }
}
