//3. Create a simple program using a thread pool to handle a fixed number of threads. Submit multiple tasks (e.g., simple print statements) to the pool and ensure that only the specified number of threads are running concurrently.
//====================================================

package Task10;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task implements Runnable {
    int taskId;

    Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Task " + taskId + " is started " + LocalTime.now());
            Thread.sleep(3000);
            System.out.println("Task " + taskId + " is completed " + LocalTime.now());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class Question3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            executor.submit(new Task(i));
        }
        executor.shutdown();
    }
}
