package lesson5;

import java.util.*;

public class Backpack {
    private int maxWeight;
    private List<Thing> allThings = new ArrayList<>();
    protected List<Thing> bestSet = new ArrayList<>();
    private Set<Thing[]> variations = new HashSet<>();

    public Backpack(int maxWeight, Thing... things) {
        this.maxWeight = maxWeight;
        this.allThings.addAll(Arrays.asList(things));
    }

    public void getBestSet() {
        if (allThings.size() == 1){
            bestSet.addAll(allThings);
            return;
        } else if (allThings.isEmpty()){
            throw new IllegalArgumentException("Set is empty");
        }
        createVariations(allThings.size() - 1);
        int maxCost = 0;
        Thing[] bestVar = new Thing[1];

        for (Thing[] variation : variations) {

            if (getTotalWeight(variation) <= maxWeight && getTotalCost(variation) >= maxCost) {
                maxCost = getTotalCost(variation);
                bestVar = variation;
            }
        }

        bestSet.addAll(Arrays.asList(bestVar));

    }

    private void createVariations(int count){
        if (count == 1){
            return;
        }

        for (int i = 0; i < count; i++) {
            createVariations(count - 1);
            Thing[] var = new Thing[count];
            for (int j = 0; j < count; j++) {
                var[j] = allThings.get(j);
            }
            variations.add(var);
            rotate(count);

        }
    }

    private void rotate(int count){
        int pos = allThings.size() - count;
        Thing temp = allThings.get(pos);
        for (int i = pos + 1; i < allThings.size(); i++) {
            allThings.set(pos - 1, allThings.get(pos));
        }

        allThings.set(allThings.size() - 1, temp);
    }

    private int getTotalWeight(Thing[] things){
        int result = 0;
        for (Thing thing : things) {
            result += thing.getWeight();
        }

        return result;
    }

    private int getTotalCost(Thing[] things){
        int result = 0;
        for (Thing thing : things) {
            result += thing.getCost();
        }

        return result;
    }
}


