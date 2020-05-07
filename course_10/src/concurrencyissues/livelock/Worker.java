package concurrencyissues.livelock;

/**
 * @author cvoinea
 */

public class Worker {
    private String name;
    private boolean isActive;

    public Worker (String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public synchronized void work (CommonResource commonResource, Worker otherWorker) {
        while (isActive) {
            if (commonResource.getOwner() != this) {
                try {
                    // wait for the resource to become available.
                    wait(10);
                } catch (InterruptedException e) {
                    //ignore
                }
                continue;
            }

            // If other worker is also active let him do the work first
            if (otherWorker.isActive()) {
                System.out.println(getName() +
                        " : handover the resource to the worker " +
                        otherWorker.getName());
                commonResource.setOwner(otherWorker);
                continue;
            }

            //now use the commonResource
            System.out.println(getName() + ": working on the common resource");
            isActive = false;
            commonResource.setOwner(otherWorker);
        }
    }

    public String getName () {
        return name;
    }

    public boolean isActive () {
        return isActive;
    }
}
