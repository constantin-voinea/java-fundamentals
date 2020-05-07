package concurrencyissues.livelock;

/**
 * @author cvoinea
 */

public class CommonResource {

    private Worker owner;

    public CommonResource (Worker d) {
        owner = d;
    }

    public synchronized void setOwner (Worker d) {
        owner = d;
    }

    public Worker getOwner () {
        return owner;
    }
}
