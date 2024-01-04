package algorithm.models;

public class BST {

    private int value;
    private BST left;
    private BST right;

    public BST(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BST getLeft() {
        return left;
    }

    public void setLeft(BST left) {
        this.left = left;
    }

    public BST getRight() {
        return right;
    }

    public void setRight(BST right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BST{" + "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
