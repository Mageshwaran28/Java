package Collection;

import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>(8, 0.6f); // 0.6f is when 60% of the set is full then double the
                                                              // size of the set

        set.add(0);
        set.add(1);
        System.out.println(set);

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(1);
        set2.add(2);
        System.out.println(set2);

        set2.addAll(set);
        System.out.println(set2);

        set2.retainAll(set);

        // get method is not there in set
        // so we can store the set in array then get the value
        Integer[] values = set.toArray(new Integer[set.size()]);
        System.out.println(values[1]);

        System.out.println(set.contains(4));
        System.out.println(set.contains(0));
        set2.addAll(set);
        System.out.println(set2.containsAll(set));

        System.out.println(set.hashCode());

        set.remove(1);
        System.out.println(set);
    }
}
