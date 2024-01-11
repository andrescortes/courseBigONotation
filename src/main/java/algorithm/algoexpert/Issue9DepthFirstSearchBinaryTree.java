package algorithm.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class Issue9DepthFirstSearchBinaryTree {

    private Issue9DepthFirstSearchBinaryTree() {

    }

    // O(v + e) time | O(v) space - where e is the number of edges and v is the number of vertices
    static class Node {
        String name;
        List<Node> children = new ArrayList<>();

        public Node(String name) {
            this.name = name;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.name);
            for (int i = 0; i < children.size(); i++) {
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }
    }
}
