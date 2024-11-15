package Task10.Question1;

import java.time.LocalTime;

public class Writer implements Runnable {
    private int id;
    private ReadWriteLockClass readWriteLock;

    Writer(ReadWriteLockClass readWriteLock, int id) {
        this.id = id;
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        try {
            readWriteLock.setWriteLock();
            System.out.println("The Writer " + id + " is writing 🔴" + LocalTime.now());
            Thread.sleep(3000);
            System.out.println("The Writer " + id + " has completed writing 🟢" + LocalTime.now());
            readWriteLock.setWriteUnLock();
        } catch (InterruptedException e) {
            System.out.println("Encountered an error" + e.getMessage());
        }
    }
}
