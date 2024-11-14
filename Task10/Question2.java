//2.Write a program where a thread sleeps for a while but can be interrupted by another thread. Ensure that the thread handles InterruptedException properly.
//=================================================

package Task10;

class ThreadSleep extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is currently running");
        try {
            Thread.sleep(3000);
            System.out.println("Thread is now live");
        } catch (InterruptedException e) {
            System.out.println("Thread got Interrupted Exception");
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.start();
        threadSleep.interrupt();
    }
}
