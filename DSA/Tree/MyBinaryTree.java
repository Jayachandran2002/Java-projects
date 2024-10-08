package exercisePackage.DSA.Tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}


public class MyBinaryTree {
    private Node root;
    public void insertData(int data){
        root = insertRec(root, data);
        }
        private Node insertRec(Node root, int data){
            if (root == null){
                root = new Node(data);
            } else if (data < root.data) {
                root.left = insertRec(root.left,data);
            }else if (data > root.data) {
                root.right = insertRec(root.right,data);

            }
            return root;
        }


        public void inorderPrint(){
        inorderRec(root);
        }
    private void inorderRec(Node root) {
        if (root != null){
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }


    public void preorderPrint(){
        preorderRec(root);
    }
    private void preorderRec(Node root) {
        if (root != null){
            System.out.println(root.data);
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }


}

