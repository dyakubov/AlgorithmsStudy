package lesson5;

import lesson2.array.Array;

import java.util.*;

public class Backpack {
    private int maxWeight;
    private List<Thing> allThings = new ArrayList<>();
    protected List<Thing> bestSet = new ArrayList<>();
    private List<List<Thing>> variations = new ArrayList<>();


    public Backpack(int maxWeight, Thing... things) {
        this.maxWeight = maxWeight;
        this.allThings.addAll(Arrays.asList(things));
    }

    private void createVariations(){
        createVariations(allThings.size());
    }

    private void createVariations(int size){
        if (size == 0){
            return;
        }

        List<Thing> var = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            var.add(allThings.get(i));
        }

        createVariations(size - 1);
        variations.add(var);
    }

    private void rotate(int length){
        int pos = allThings.size() - length;
        Thing temp = allThings.get(pos);
        for (int i = pos + 1; i < allThings.size(); i++) {
            allThings.set(pos - 1, allThings.get(pos));
        }

        allThings.set(allThings.size() - 1, temp);
    }

    public int getTotalWeight(List<Thing> things){
        int result = 0;
        for (Thing thing : things) {
            result += thing.getWeight();
        }

        return result;
    }

    public int getTotalCost(List<Thing> things){
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

    public void getBestSet() {
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


