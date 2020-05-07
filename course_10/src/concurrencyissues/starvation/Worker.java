package concurrencyissues.starvation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cvoinea
 */
public class Worker {

    public synchronized void work() {
        String name = Thread.currentThread().getName();
        String fileName = name + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Thread " + name + " wrote this message");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        while (true) {
            System.out.println(name + " is working");
        }
    }
}
