package concurrencyissues.racecondition;

/**
 * @author cvoinea
 */
public class LongWrapper {

    private long l;
    private final Object key = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }

    // race condition
    public void incrementValue() {
        synchronized (key) { // prevents race condition
            l++; // this code is executed by one thread at a time
        }
    }
}
