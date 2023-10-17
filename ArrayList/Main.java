package ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("ArrayList using Integer data type --------------------");

        Integer[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.addAtFirst(0);
        al.addAtLast(3);
        al.addAtPosition(3, 2);
        al.addAll(arr);
        al.display();

        al.deleteAtPosition(5);
        al.deleteAtFirst();
        al.deleteAtLast();
        al.display();

        al.updateValue(7, 28);
        al.display();

        System.out.println("Array size : " + al.size());
        System.out.println(al.getValue(3));

        al.display();

        System.out.println(al.contains(20));
        System.out.println("Array is empty : " + al.isEmpty());
        System.out.println(al.containsNthValue(-2, 14));

        al.deleteAll();

        System.out.println("ArrayList using String data type --------------------");
        String[] values = new String[] { "1", "2", "3", "4", "5" };

        ArrayList<String> sArrayList = new ArrayList<String>(values);

        sArrayList.display();

        sArrayList.add("a");
        sArrayList.addAtPosition(10, "Magesh");
        sArrayList.addAtFirst("first");
        sArrayList.addAtLast("Last");

        sArrayList.display();

        System.out.println(sArrayList.getValue(3));
        sArrayList.addAtPosition(4, "Magesh");
        System.out.println(sArrayList.contains("Magesh"));
        System.out.println(sArrayList.containsNthValue(2, "Magesh"));

        sArrayList.updateValue(7, "Bala");
        sArrayList.display();

        sArrayList.deleteAtPosition(8);
        sArrayList.display();

        sArrayList.deleteAll();
        System.out.println(sArrayList.isEmpty());
    }
}
