package 牛客算法课.初级班.课13_有序表;

/**
 * Not implemented by zuochengyun
 * <p>
 * Binary search tree implementation.
 * <p>
 * In computer science, a binary search tree (BST), which may sometimes also be
 * called an ordered or sorted binary tree, is a node-based binary tree data
 * structure which has the following properties:
 * <p>
 * a) The left subtree of a node contains only nodes with keys less than the node's key. </br>
 * b) The right subtree of a node contains only nodes with keys greater than the node's key. </br>
 * c) Both the left and right subtrees must also be binary search trees. </br>
 *
 * @author Ignas Lelys
 * @created May 6, 2011
 */
public class BinarySearchTree extends AbstractBinarySearchTree {

    @Override
    protected Node createNode(int value, Node parent, Node left, Node right) {
        return new Node(value, parent, left, right);
    }

}
