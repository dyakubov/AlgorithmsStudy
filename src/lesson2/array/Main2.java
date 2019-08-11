package lesson2.array;

public class Main2 {
    public static void main(String[] args) {
        final int CAPACITY = 20;
        long startTime;
        Array<Integer> array1 = new ArrayImpl<>();
        Array<Integer> array2 = new ArrayImpl<>();
        Array<Integer> array3 = new ArrayImpl<>();

        for (int i = 0; i < CAPACITY ; i++) {
            int randInt = (int)(Math.random()*CAPACITY);
            array1.add(randInt);
            array2.add(randInt);
            array3.add(randInt);
        }
        System.out.println("Arrays ready");

        System.out.println("Start Bubble sorting");
        startTime = System.currentTimeMillis();
        array1.sortBubble();
        System.out.println("Bubble sort completed in " + (System.currentTimeMillis() - startTime) + " ms");

        System.out.println("Start Insert sorting");
        startTime = System.currentTimeMillis();
        array2.sortInsert();
        System.out.println("Insert sort completed in " + (System.currentTimeMillis() - startTime)  + " ms");

        System.out.println("Start Select sorting");
        startTime = System.currentTimeMillis();
        array3.sortSelect();
        System.out.println("Select sort completed in " + (System.currentTimeMillis() - startTime) + " ms");
    }


}
