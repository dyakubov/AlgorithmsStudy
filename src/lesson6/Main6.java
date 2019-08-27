package lesson6;

public class Main6 {

    public static void main(String[] args) {
        final int TREES_COUNT = 20;
        final int DEPTH = 6;
        int balancedTrees = 0;

        for (int i = 0; i < TREES_COUNT; i++) {
            Tree<Integer> tree = new TreeImpl<>(DEPTH);
            while (!tree.isFull()){
                tree.add((int)(Math.random()*200 - 100));
            }
            tree.display();
            if (tree.isBalanced()){
                balancedTrees++;
            }
            System.out.println("Depth: " + tree.depth(tree.getRoot()));
            System.out.println("Balanced: " + tree.isBalanced());
        }

        if (balancedTrees == 0){
            System.out.println("No balanced trees founded");
        } else System.out.println("Balanced trees: " + balancedTrees + " of " + TREES_COUNT + "(" + ((double)balancedTrees/(double)TREES_COUNT)*100 + "%)");



    }
}
