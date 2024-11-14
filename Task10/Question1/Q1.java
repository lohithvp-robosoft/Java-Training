//1.Implement a simple read-write lock that allows multiple threads to read shared data concurrently, but only one thread can write at a time. Ensure that writers are given priority.
//====================================================

package Task10.Question1;

public class Q1 {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReadWriteLock();

        for (int i = 1; i <= 3; i++) {
            new Thread(new Reader(readWriteLock, i)).start();
        }

        for (int i = 1; i <= 3; i++) {
            new Thread(new Writer(readWriteLock, i)).start();
        }
    }
}
