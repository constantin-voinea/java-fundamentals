package concurrencyissues.deadlock;

/**
 * @author cvoinea
 */
public class DeadLockTest {

    public static void main(String[] args) throws InterruptedException {

        Resource resource = new Resource();

        Runnable r1 = resource::a;
        Runnable r2 = resource::b;

        Thread t1 = new Thread(r1, "t1");
        t1.start();
        Thread t2 = new Thread(r2, "t2");
        t2.start();

        t1.join();
        t2.join();
    }
}
