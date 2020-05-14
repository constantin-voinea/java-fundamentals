package producerconsumer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author cvoinea
 * shared resource
 */

public class MyQueue {

    private int capacity;
    private List<Integer> queue = new LinkedList<>();

    public MyQueue(int capacity) {
        this.capacity = capacity;
    }

    // monitor - can be any object instance, known by both threads
    // here the monitor is 'this' instance of MyQueue class
    public synchronized void enqueue(int item) throws InterruptedException {
        while (queue.size() == this.capacity) {
            wait();
        }

        System.out.println("Thread " + Thread.currentThread().getName() + " producing " + item);
        queue.add(item);

        if (queue.size() == 1) {
            notifyAll();
        }
    }

    public synchronized int dequeue() throws InterruptedException {
        int item;

        while (queue.size() == 0) {
            wait();
        }

        item = queue.remove(0);
        System.out.println("Thread " + Thread.currentThread().getName() + " consuming " + item);

        if (queue.size() == (capacity - 1)) {
            notifyAll();
        }
        return item;
    }
}
