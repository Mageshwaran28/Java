package ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        int[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

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

        al.deleteAll();

        al.display();

        System.out.println("Value 20 is exist in array" + al.contains(20));
        System.out.println("Array is empty : " + al.isEmpty());

    }
}
