package producerconsumer;

/**
 * @author cvoinea
 */

public class ProducerConsumerTest {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue(10);

        new Thread(new Producer(queue), "Producer 1").start();
        new Thread(new Producer(queue), "Producer 2").start();
        new Thread(new Consumer(queue), "Consumer 1").start();
        new Thread(new Consumer(queue), "Consumer 2").start();
    }
}
