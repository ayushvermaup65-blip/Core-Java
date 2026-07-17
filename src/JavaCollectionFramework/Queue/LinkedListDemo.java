package JavaCollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    static void main() {
        Queue<Integer> q = new LinkedList<>();

        // offer() -> Inserts the specified element into the queue. If the  task is successful, offer() returns true, if not it returns false.
        // we use offer() instead of add() because in add(), if task is unsuccessful it throws an exception.
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);

        // don't use this ->  element() -> Returns the head of the queue. Throws an exception if the queue is empty.
        // use this -> peek() -> Returns the head of the queue. Returns null if the queue is empty.
        System.out.println("Peek element : " + q.peek());

        // don't use this -> remove() -> Returns and removes the head of the queue. Throws and exception if the queue is empty.
        // use this -> poll() -> Returns and removes the head of the queue. Returns null if the queue is empty.
        System.out.println("Removing : " + q.poll());

        System.out.println(q);
    }
}
