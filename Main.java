package hw3;

public class Main {
    public static void main(String[] args) {
        RedBlackTreeLeft<Integer> tree = new RedBlackTreeLeft<>();
        tree.add(30);
        tree.add(5);
        tree.add(7);
        tree.printTree();
        tree.add(15);
        tree.add(3);
        tree.add(1);
        tree.add(13);
        tree.add(25);
        tree.printTree();
        tree.add(20);
        tree.add(6);
        tree.add(17);
        tree.add(19);
        tree.add(4);
        tree.printTree();
    }
}
