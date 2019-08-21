package lesson5;

import java.util.*;

public class Backpack {
    private int maxWeight;
    private List<Thing> allThings = new ArrayList<>();
    List<Thing> bestSet = new ArrayList<>();
    private List<List<Thing>> variations = new ArrayList<>();
    private double iterations = 0;

    Backpack(int maxWeight, Thing... things) {
        this.maxWeight = maxWeight;
        this.allThings.addAll(Arrays.asList(things));
    }

    private void createVariations(){
        iterations = Math.pow(allThings.size(), allThings.size());
        createVariations(allThings.size());
    }

    private void createVariations(int size){
        if (iterations == 0){
            return;
        }

        if (size == 0){
            size = allThings.size();
        }

        List<Thing> var = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            var.add(allThings.get(i));
        }
        variations.add(var);
        iterations--;
        rotate(size);
        createVariations(size - 1);

    }

    private void rotate(int length){
        int pos = allThings.size() - length;
        Thing temp = allThings.get(pos);
        for (int i = pos + 1; i < allThings.size(); i++) {
            allThings.set(i - 1, allThings.get(i));
        }

        allThings.set(allThings.size() - 1, temp);
    }

    int getTotalWeight(List<Thing> things){
        int result = 0;
        for (Thing thing : things) {
            result += thing.getWeight();
        }

        return result;
    }

    int getTotalCost(List<Thing> things){
        int result = 0;
        for (Thing thing : things) {
            result += thing.getCost();
        }

        return result;
    }

    public void printVariations(){
        System.out.println(variations.size());
        for (List<Thing> tSet : variations) {
            for (Thing t : tSet) {
                System.out.print(t.getName() + " ");
            }
            System.out.println();
        }
    }

    void getBestSet() {
        if (allThings.size() == 1){
            bestSet.addAll(allThings);
            return;
        } else if (allThings.isEmpty()){
            throw new IllegalArgumentException("Set is empty");
        }
        int maxCost = 0;

        createVariations();
        for (List<Thing> variation : variations) {

            if (getTotalWeight(variation) <= maxWeight && getTotalCost(variation) >= maxCost) {
                maxCost = getTotalCost(variation);
                bestSet.clear();
                bestSet.addAll(variation);
            }
        }
    }
}


