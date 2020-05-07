package concurrencyissues.racecondition;

import java.util.stream.IntStream;

/**
 * @author cvoinea
 * classic concurrency issues:
 *   - race condition - 2 threads try to read and write the same variable at the same time (solved through synchronized blocks)
 *   - deadlock - t1 holds a key needed by t2 and vice-versa; none will release the key before aquiring the next one
 *   - livelock - two or more threads keep on transferring states between one another
 *   - starvation - when shared resources are made unavailable for long periods by "greedy" threads
 */
public class RaceConditionTest {

    public static void main(String[] args) throws InterruptedException {

        LongWrapper lw = new LongWrapper(0L);

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                lw.incrementValue();
            }
        };

        Thread[] threads = new Thread[1000];
        IntStream.range(0, 1000).forEach(i -> {
            threads[i] = new Thread(r);
            threads[i].start();
        });
        for (int i = 0; i < 1000; i++) {
            threads[i].join();
        }
        System.out.println("final value: " + lw.getValue());

    }
}
