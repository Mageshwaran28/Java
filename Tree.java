public class Tree {
    public static void main(String[] args) {
        int[][] tree = { { 2, 4 }, { 3, 5 }, { 5, 2 }, { 6, 3 }, { 8, 4 } };
        if (tree[0][1] == tree[1][1]) {
            System.out.println("False");
            return;
        }
        for (int i = 2; i < tree.length; i++) {
            if (tree[i][1] != tree[i - 2][0] && tree[i][1] != tree[i - 1][0]) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");

    }
}
