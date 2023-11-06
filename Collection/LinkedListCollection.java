package Collection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection extends LinkedList<Integer> {
    public static void main(String[] args) {
        int[] b=new int[10];
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(0, 20);
        list.addFirst(50);
        list.addLast(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);

        list.addAll(list2);
        list.addAll(1, list2);

        System.out.println(list);

        @SuppressWarnings({"rawtypes", "unchecked"})
        LinkedList<Integer> listClone = (LinkedList) list.clone();

        list.clear();
        System.out.println(list);
        System.out.println(listClone);

        list.addAll(listClone);
        System.out.println(list.contains(100));
        System.out.println(list.containsAll(list2));

        Iterator<Integer> it = list.descendingIterator(); // reverse the list

        while(it.hasNext()){
            System.out.println(it.next());
        }

        list.forEach(e-> System.out.println(e*3)); 

        Method[] clazz = list.getClass().getDeclaredMethods();
        for(int i=0; i<clazz.length; i++){
            System.out.println(clazz[i].getName() + " ");
        }

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
        System.out.println(list.peek()); // return the first element
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.poll()); // get & remove the first element
        System.out.println(list.pollLast());
        System.out.println(list); // get & remove the last element

        System.out.println(list.indexOf(100));
        System.out.println(list.isEmpty());
        // list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        @SuppressWarnings("unused")
        Object[] ob =     list.toArray();
        
        System.out.println(list);
        for(int i=0;i<b.length;i++)
        {
            System.out.println(list.get(i));
        }
    }
}
