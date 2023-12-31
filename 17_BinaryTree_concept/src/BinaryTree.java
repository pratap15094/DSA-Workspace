public class BinaryTree {
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
      preOrder(root);

    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data= data;
    }
}
