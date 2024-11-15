package Task10.Question1;

import java.time.LocalTime;

public class Reader implements Runnable {
    private int id;
    private ReadWriteLockClass readWriteLock;

    Reader(ReadWriteLockClass readWriteLock, int id) {
        this.id = id;
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        try {
            readWriteLock.setReadLock();
            System.out.println("The Reader " + id + " is reading 🔴" + LocalTime.now());
            Thread.sleep(3000);
            System.out.println("The Reader " + id + " has completed reading 🟢" + LocalTime.now());
            readWriteLock.setReadUnlock();
        } catch (InterruptedException e) {
            System.out.println("Encountered an error" + e.getMessage());
        }
    }
}
