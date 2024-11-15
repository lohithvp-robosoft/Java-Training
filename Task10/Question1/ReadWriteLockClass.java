package Task10.Question1;

public class ReadWriteLockClass {

    private int readers;
    private int writers;
    private int writeRequests;

    public synchronized void setReadLock() throws InterruptedException {
        while (writers > 0 || writeRequests > 0) {
            wait();
        }
        readers++;
    }

    public synchronized void setReadUnlock() {
        readers--;
        if (readers == 0) notifyAll();
    }

    public synchronized void setWriteLock() throws InterruptedException {
        writeRequests++;
        while (writers > 0 || readers > 0) {
            wait();
        }
        writeRequests--;
        writers++;
    }

    public synchronized void setWriteUnLock() {
        writers--;
        notifyAll();
    }
}
