package tree;
public class Tree {
    private Node root;
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.getValue() == temp.getValue()) return false;
            if (newNode.getValue() < temp.getValue()) {
                if (temp.getLeft() == null) {
                    temp.setLeft(newNode);
                    return true;
                }
                temp = temp.getLeft();
            } else {
                if (temp.getRight() == null) {
                    temp.setRight(newNode);
                    return true;
                }
                temp = temp.getRight();
            }
        }
    }
    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp!=null) {
            if (value<temp.getValue()) {
                temp = temp.getLeft();
            } else if (value > temp.getValue()) {
                temp = temp.getRight();
            } else {
                return true;
            }
        }
        return false;
    }
}