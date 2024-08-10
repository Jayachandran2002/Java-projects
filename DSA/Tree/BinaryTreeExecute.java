package exercisePackage.DSA.Tree;

public class BinaryTreeExecute {
    public static void main(String[] args) {
        MyBinaryTree binaryTree = new MyBinaryTree();
        binaryTree.insertData(8);
        binaryTree.insertData(7);
        binaryTree.insertData(12);
        binaryTree.insertData(15);
        binaryTree.insertData(2);
        binaryTree.insertData(5);

        binaryTree.inorderPrint();
        System.out.println();

        binaryTree.preorderPrint();
    }
}
