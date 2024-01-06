package algorithm.models;

public class LevelNode {
    private BinaryTree root;
    private int depth;

    public LevelNode(BinaryTree root, int depth) {
        this.root = root;
        this.depth = depth;
    }

    public BinaryTree getRoot() {
        return root;
    }

    public void setRoot(BinaryTree root) {
        this.root = root;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
