package tree;

/**
 * Created by amour on 10.05.2017.
 */
class Node {
    public Node(int number) {
        this.number = number;
        sons = new Node[10];
    }

    private Node[] sons;
    private int number;
    private int sonNumber = 0;

    public void addSon(Node node) {
        sons[sonNumber] = node;
        sonNumber++;
    }
}

