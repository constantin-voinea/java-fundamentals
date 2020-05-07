package concurrencyissues.livelock;

/**
 * @author cvoinea
 * livelock -  two or more threads keep on transferring states between one another
 *
 * both threads need two locks to complete their work
 * each thread acquires its first lock but finds that the second lock is not available
 * in order to let the other thread complete first, each thread releases its first lock and tries to acquire both the locks again
 */
public class LivelockTest {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Worker 1 ", true);
        Worker worker2 = new Worker("Worker 2", true);

        CommonResource cs = new CommonResource(worker1);

        new Thread(() -> worker1.work(cs, worker2)).start();
        new Thread(() -> worker2.work(cs, worker1)).start();

    }
}
