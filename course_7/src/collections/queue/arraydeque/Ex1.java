package collections.queue.arraydeque;

import java.util.ArrayDeque;

/**
 * @author cvoinea
 *
 * same methods as a linkedlist, but on an array
 */
public class Ex1 {

	public static void main(String[] args) {

		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("a");
		arrayDeque.addFirst("ff");

		arrayDeque.push("44");
		arrayDeque.offer("55");
		System.out.println(arrayDeque.poll());
		System.out.println(arrayDeque);

	}
}
