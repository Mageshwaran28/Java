package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class DiffBetweenPriorityQueueAndLinkedListQueue {
    public static void main(String[] args) {
        int len = 5;
        Random random = new Random();

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(len);
        Queue<Integer> linkedList = new LinkedList<>();

        System.out.println("Random number generated:");
        for (int i = 0; i < len; i++) {
            Integer randomNumber = new Integer(random.nextInt(100));
            linkedList.add(new Integer(randomNumber));
            priorityQueue.add(new Integer(randomNumber));
            System.out.println(i + ": " + randomNumber);
        }
        
        System.out.println("Number in linkedList:");
        for (int i = 0; i < len; i++) {
            System.out.println(i + ": " + linkedList.poll());
        }

        System.out.println("Number in priorityQueue:");
        for (int i = 0; i < len; i++) {
            System.out.println(i + ": " + priorityQueue.poll());
        }
    }
}
