
import java.util.HashMap;
import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of pairs");
        int numberOfPairs = scanner.nextInt();

        int[][] tree = new int[numberOfPairs][2];
        HashMap<Integer, Integer> treeMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < numberOfPairs; i++) {

            tree[i][0] = scanner.nextInt();
            tree[i][1] = scanner.nextInt();

            if(!treeMap.containsKey(tree[i][1])) {
                treeMap.put(tree[i][1], 1);
            }
            else{
                int value = treeMap.get(tree[i][1])+1;
                if(value>2){
                    System.out.println("False");
                    scanner.close();
                    return;
                }
                treeMap.put(tree[i][1],value);
            }

        }
        
        scanner.close();
        System.out.println("True");
    }
}
