package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        addNode(5, root);
        addNode(8, root);
        addNode(150, root);
        addNode(27, root);
        addNode(24, root);
        addNode(23, root);
        addNode(22, root);
        addNode(18, root);
        addNode(17, root);
        addNode(16, root);
        addNode(15, root);
        addNode(14, root);
        addNode(11, root);
        dfs(root);
    }

    public static void addNode(int value, Node node) {
        if (value < node.value) {
            if (node.leftChild == null) {
                node.leftChild = new Node(value);
            } else {
                addNode(value, node.leftChild);
            }
        } else {
            if (node.rightChild == null) {
                node.rightChild = new Node(value);
            } else
                addNode(value, node.rightChild);
        }

    }

    public static void dfs(Node root) {
        if (root != null) {
            dfs(root.leftChild);
            System.out.println(root.value);
            dfs(root.rightChild);
        }
    }
}