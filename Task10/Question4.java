//4. Implement a scenario using CountDownLatch where a main thread waits for several worker threads to complete before proceeding. There are 5 worker threads, and the main thread should wait for all to finish before printing a message.
//==================================================

package Task10;

import java.util.concurrent.CountDownLatch;

class WorkerThread implements Runnable {
    private CountDownLatch latch;
    private int id;

    WorkerThread(CountDownLatch latch, int id) {
        this.latch = latch;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker Thread " + id + " started");
            Thread.sleep(Integer.parseInt(id + "000"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Worker Thread " + id + " completed");
            latch.countDown();
        }
    }
}

public class Question4 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        for (int i = 1; i <= 5; i++) {
            new Thread(new WorkerThread(latch, i)).start();
        }
        System.out.println("All the threads have Started");
        latch.await();
        System.out.println("Completed all worker thread task");
    }
}
