package lesson5;

public class BackpackTest {
    public static void main(String[] args) {
        Backpack backpack = new Backpack(8,
                new Thing("Apple", 2, 1),
                new Thing("Player", 3, 50),
                new Thing("Phone", 4, 100),
                new Thing("Knife", 5, 15));

        backpack.getBestSet();
        for (Thing thing : backpack.bestSet) {
            System.out.println(thing.getName());
        }
    }
}
