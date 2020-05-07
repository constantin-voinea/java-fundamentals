package producerconsumer;

/**
 * @author cvoinea
 */
public class Consumer implements Runnable {

    private MyQueue queue;

    public Consumer(MyQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (; ; ) {
                queue.dequeue();
                Thread.sleep((int) (Math.random() * 5000) + 3000);
            }
        } catch (InterruptedException ex) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
    }
}
