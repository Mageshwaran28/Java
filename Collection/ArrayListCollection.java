package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListCollection extends ArrayList<Integer>{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);

        System.out.println("First list: " + list);
        System.out.println("Second list: " + list2);

        list.addAll(list2);
        System.out.println("Combine both lists: " + list);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list);

        list.clear(); // delete all values from the list
        System.out.println(list);

        list.addAll(list3);
        System.out.println(list);

        list2.add(49);
        list.removeAll(list2); // if exists remove that values from the list
        System.out.println("List 2 elements all are removed :" + list);

        Object clone = list.clone(); // return Object type of the list
        ArrayList<Integer> cloneList = (ArrayList<Integer>) list.clone();

        System.out.println("Clone in Object :" + clone);
        System.out.println("Clone ArrayLIst :" + cloneList);

        System.out.println("List contains 3 : "+ list.contains(3));
        System.out.println("List contains 20 : "+ list.contains(20));

        list.clear();
        list.addAll(list3);
        System.out.println(list.containsAll(list2)); // check all list2 elements exist in list
        System.out.println(list.containsAll(cloneList));

        System.out.println(list.get(2));
        list.addAll(list);

        System.out.println(list);
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));

        list.remove(15);
        System.out.println(list);

        list.remove(Integer.valueOf(15));
        System.out.println(list);

        list.removeAll(cloneList);
        System.out.println(list);
        System.out.println("List is empty : " + list.isEmpty());
        System.out.println(list.subList(3, 5));
        // System.out.println(list.subList(3, 15)); throw exception

        cloneList.retainAll(list); // if it not match from list then remove it will return common values from list
        System.out.println("RetailAll method : "+cloneList);

        list.set(2, 28);
        System.out.println(list);

        list.sort(null);
        System.out.println(list);
        Integer[] arr = new Integer[list.size()];
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(list.toString());

        ArrayListCollection classAl = new ArrayListCollection();
        classAl.addAll(list);
        System.out.println(classAl);
        classAl.removeRange(0, 3); // removeRange only accessible from subclass
        System.out.println(classAl);

        list.replaceAll(e-> e+10);
        System.out.println(list);

        list.removeIf(e-> e%2==0);
        System.out.println(list);

        list.forEach(e->{
            System.out.println(e);
        });

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
