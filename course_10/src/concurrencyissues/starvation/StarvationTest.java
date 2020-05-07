package concurrencyissues.starvation;

/**
 * @author cvoinea
 * causes:
 * - threads with high priority take all CPU time from threads with lower priority
 * - threads are blocked indefinately waiting to enter a synchronized block (other threads are constantly allowed access before it)
 * - threads waiting on an object (called wait() on it) remain waiting indefinitely because other threads are constantly awakened instead of it
 * <p>
 * solution is called "fairness" - all threads are fairly granted a chance to execute
 */
public class StarvationTest {

    public static void main(String[] args) {

        Worker worker = new Worker();

        for (int i = 0; i < 10; i++) {
            new Thread(worker::work).start();
        }
    }
}
