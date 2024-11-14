package Task10.Question1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReadWriteLock {
    private int readerCount = 0;
    private boolean isWriting = false;
    private Lock readLock = new ReentrantLock();
    private Lock writeLock = new ReentrantLock();

    public void setReadLock() throws InterruptedException {
        synchronized (this) {
            System.out.println("Reader " + isWriting + readerCount);
            while (isWriting) {
                wait();
            }
            readerCount++;
        }
        readLock.lock();
    }

    public void setReadUnlock() {
        synchronized (this) {
            System.out.println("Reader " + isWriting + readerCount);
            readerCount--;
            if (readerCount == 0) {
                notifyAll();
            }
        }
        readLock.unlock();
    }

    public void setWriteLock() throws InterruptedException {
        synchronized (this) {
            isWriting = true;
            System.out.println("Writer " + isWriting + readerCount);
            while (readerCount > 0) {
                wait();
            }
        }
        writeLock.lock();
    }

    public void setWriteUnlock() throws InterruptedException {
        synchronized (this) {
            System.out.println("Writer " + isWriting + readerCount);
            isWriting = false;
            notifyAll();
        }
        writeLock.unlock();
    }
}
