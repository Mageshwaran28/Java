package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Balaji");
        list.add("Aravind");
        System.out.println("ArrayList : " + list);

        List<String> synchronizedList = Collections.synchronizedList(list);

        System.out.println("SynchronizedArrayList : " + synchronizedList);
    }
}
