package Collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeCollection {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // add will return true if it is successfully added
        // If it is failure then throw an exception
        queue.add(1);
        queue.addFirst(2);
        queue.addLast(3);

        System.out.println(queue);
        queue.clear();

        // offer will return true if it is successfully added
        // If it is failure then return false
        queue.offer(1);
        queue.offerFirst(2);
        queue.offerLast(3);

        System.out.println(queue);

        // return the element
        System.out.println("Return first ele" + queue.getFirst());
        System.out.println("Return last ele" + queue.getLast());
        // return head element

        System.out.print("Return head");
        System.out.println(queue.peek());
        System.out.println(queue.peekFirst());

        // return tail element
        System.out.println("Return tail");
        System.out.println(queue.peekLast());

        System.out.println(queue);
        ArrayDeque<Integer> queueDeque = new ArrayDeque<Integer>();
        queueDeque.addAll(queue);

        // If it is empty then throw an exception
        System.out.println("remove head");
        System.out.println(queue.remove());
        System.out.println(queue.removeFirst());

        System.out.println("remove tail");
        System.out.println(queue.removeLast());
        // System.out.println(queue.remove()); throw NoSuchElementException

        queue.addAll(queueDeque);

        // If it is empty return null
        System.out.println("remove head");
        System.out.println(queueDeque.poll());
        System.out.println(queueDeque.pollFirst());

        System.out.println("remove tail");
        System.out.println(queueDeque.pollLast());

        // System.out.println(queueDeque.poll()); return null

        System.out.println(queue);
        System.out.println("remove head" + queue.pop()); // throw NoSuchElementException when queue is empty
        System.out.println(queue);
        queue.push(2); // add at head . throw an exception if queue is full
        System.out.println(queue);

        System.out.println("Iterate in FIFO");
        Iterator<Integer> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Iterate in LIFO");
        Iterator<Integer> itr2 = queue.descendingIterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println(queue.element()); // return the head element

        System.out.println("Size : " + queue.size());
        System.out.println("Contains : " + queue.contains(3));
        System.out.println(queue.toString());
        Object[] newArray = queue.toArray(); // return object array
        System.out.println("Convert to array : ");
        for (Object object : newArray) {
            System.out.println(object);
        }

        ArrayDeque<Integer> cloneQueue = (ArrayDeque<Integer>) queue.clone();
        System.out.println("Clone : " + cloneQueue);
    }
}
