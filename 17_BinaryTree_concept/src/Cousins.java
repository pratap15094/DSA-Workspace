public class Cousins {
    static Node xParent, yParent;
    static int xLevel, yLevel;
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

        System.out.println(areCousins(root, 4, 5));
    }
    public static void cousinsHelper(Node curr, Node parent, int x, int y, int level){
      if(curr==null) return;
      if(curr.data == x) {
       xParent =parent;
       xLevel =level;
      }
      if(curr.data == y) {
        yParent =parent;
        yLevel =level;
      }
      cousinsHelper(curr.left, curr, x, y, level+1);
      cousinsHelper(curr.right, curr, x, y, level+1);
    }
    public static boolean areCousins(Node root, int x, int y){
       cousinsHelper(root,null, x, y, 0);
       boolean onSameLevel = xLevel == yLevel;
       boolean differntParent = xParent != yParent;
       return onSameLevel && differntParent;
    }
}
