package lesson5;

public class BackpackTest {
    public static void main(String[] args) {
        Backpack backpack = new Backpack(100,
                new Thing("Apple", 2, 15),
                new Thing("Player", 3, 50),
                new Thing("Phone", 4, 60),
                new Thing("Knife", 5, 15),
                new Thing("Book", 4, 3)
                );

        backpack.getBestSet();
        System.out.println("Total sum: " + backpack.getTotalCost(backpack.bestSet));
        System.out.println("Total weight: " + backpack.getTotalWeight(backpack.bestSet));
        System.out.println("Things: ");
        for (Thing t : backpack.bestSet) {
            System.out.println("  - " + t.getName());
        }
    }
}
