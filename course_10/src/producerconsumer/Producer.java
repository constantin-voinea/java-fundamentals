package producerconsumer;

import java.util.Random;

/**
 * @author cvoinea
 */
public class Producer implements Runnable {

    private MyQueue queue;
    private Random random = new Random();

    public Producer(MyQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (; ; ) {
                queue.enqueue(random.nextInt());
                Thread.sleep((int) (Math.random() * 3000) + 1000);
            }
        } catch (InterruptedException ex) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
    }
}