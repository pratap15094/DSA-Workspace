public class MaxMinValues {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        Node root = n1;
        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left=n6;
       System.out.println(minNodeValue(root));
       System.out.println(maxNodeValue(root));
    }
    public static int minNodeValue(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int leftMin = minNodeValue(root.left);
        int rightMin = minNodeValue(root.right);
        return Math.min(Math.min(leftMin, rightMin), root.data);
    }

    public static int maxNodeValue(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int leftMax = maxNodeValue(root.left);
        int rightMax = maxNodeValue(root.right);
        return Math.max(Math.max(leftMax, rightMax), root.data);
    }
}


