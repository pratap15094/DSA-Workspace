import java.util.*;
public class nodeAtLevelK {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;

        n2.right = n4;
        n3.right = n5;

        ArrayList<Integer> ans= new ArrayList<>();
        nodeAtLevelK(root, 2, ans);
        System.out.println(ans);
    }
    public static void nodeAtLevelK(Node root, int level, ArrayList<Integer> ans) {
        if (root == null || level < 0) return;
        if (level == 0) {
            ans.add(root.data);
            return;
        }
        nodeAtLevelK(root.left, level - 1, ans);
        nodeAtLevelK(root.right, level - 1, ans);
    }
}
