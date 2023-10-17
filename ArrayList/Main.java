package ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        ArrayList al = new ArrayList(arr);
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

        System.out.println("Value 20 is exist in array" + al.contains(20));
        System.out.println("Array is empty : " + al.isEmpty());
        System.out.println(al.containsNthValue(-2, 14));

        al.deleteAll();

    }
}
