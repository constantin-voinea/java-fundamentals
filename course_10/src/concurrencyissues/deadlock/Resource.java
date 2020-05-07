package concurrencyissues.deadlock;

/**
 * @author cvoinea
 */
public class Resource {

    // create two objects that will be used as keys for synchronized blocks
    private final Object key1 = new Object();
    private final Object key2 = new Object();

    public void a(){
        synchronized (key1){
            System.out.println(Thread.currentThread().getName() + " running a()");
            b();
        }
    }

    public void b(){
        synchronized (key2){
            System.out.println(Thread.currentThread().getName() + " running b()");
            c();
        }
    }

    public void c() {
        synchronized (key1){
            System.out.println(Thread.currentThread().getName() + " running c()");
        }
    }
}
