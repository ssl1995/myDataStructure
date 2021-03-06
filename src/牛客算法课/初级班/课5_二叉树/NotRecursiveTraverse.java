package 牛客算法课.初级班.课5_二叉树;

import java.util.Stack;

public class NotRecursiveTraverse {
    // 先序非递归遍历
    public static void preTraverse(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        // 先序：头右左入栈
        while (!stack.isEmpty()) {
            head = stack.pop();
            System.out.print(head.value + " ");
            if (head.right != null) {
                stack.push(head.right);
            }
            if (head.left != null) {
                stack.push(head.left);
            }
        }
        System.out.println();
    }

    // 中序非递归遍历
    public static void inTraverse(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || head != null) {
            // 中序非递归遍历先把所有左子树入栈
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                // 左子树到null就出栈，操作+入右子树
                head = stack.pop();
                System.out.println(head.value + " ");
                head = head.right;
            }
        }
        System.out.println();
    }

    // 后序非递归遍历
    public static void posTraverse(Node head) {
        if (head == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(head);
        // 后序：头左右入s1的同时，弹出元素入s2
        while (!s1.isEmpty()) {
            head = s1.pop();
            s2.push(head);
            if (head.left != null) {
                s1.push(head.left);
            }
            if (head.right != null) {
                s1.push(head.right);
            }
        }
        while (!s2.isEmpty()) {
            System.out.println(s2.pop().value + "");
        }
        System.out.println();
    }
}
