import lesson2.array.Array;
import lesson2.array.ArrayImpl;
import org.junit.Assert;
class ArrayImplTest {

    @org.junit.jupiter.api.Test
    void add() {
        Array <Integer> array = new ArrayImpl<>();
        int[] expected = new int[3];
        int[] actual = {1, 2, 3};

        array.add(1);
        array.add(2);
        array.add(3);

        for (int i = 0; i < array.size(); i++) {
            expected[i] = array.get(i);
        }
        Assert.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        Array <Integer> array = new ArrayImpl<>();
        int[] expected = new int[2];
        int[] actual = {1, 3};

        array.add(1);
        array.add(2);
        array.add(3);

        array.remove(1);

        for (int i = 0; i < array.size(); i++) {
            expected[i] = array.get(i);
        }

        Assert.assertArrayEquals(expected, actual);
    }



    @org.junit.jupiter.api.Test
    void get() {
        Array <Integer> array = new ArrayImpl<>();
        int expected = 2;


        array.add(1);
        array.add(2);
        array.add(3);

        int actual = array.get(1);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void contains() {
        Array <Integer> array = new ArrayImpl<>();

        array.add(1);
        array.add(2);
        array.add(3);

        Assert.assertTrue(array.contains(2));
        Assert.assertFalse(array.contains(0));
        Assert.assertFalse(array.contains(-1));
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        Array <Integer> array = new ArrayImpl<>();

        array.add(1);
        array.add(2);
        array.add(3);

        Assert.assertEquals(0, array.indexOf(1));
    }

    @org.junit.jupiter.api.Test
    void size() {
        Array <Integer> array = new ArrayImpl<>();

        array.add(1);
        array.add(2);
        array.add(3);

        Assert.assertEquals(3, array.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Array <Integer> array = new ArrayImpl<>();

        array.add(1);
        array.add(2);
        array.add(3);

        Assert.assertFalse(array.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void sortBubble() {
        Array <Integer> array = new ArrayImpl<>();
        int[] expected = new int[6];
        array.add(1);
        array.add(5);
        array.add(6);
        array.add(-1);
        array.add(2);
        array.add(2);

        int[] actual = {-1, 1, 2, 2, 5, 6};
        array.sortBubble();
        for (int i = 0; i < array.size(); i++) {
            expected[i] = array.get(i);
        }

        Assert.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sortSelect() {
        Array <Integer> array = new ArrayImpl<>();
        int[] expected = new int[6];
        array.add(1);
        array.add(5);
        array.add(6);
        array.add(-1);
        array.add(2);
        array.add(2);

        int[] actual = {-1, 1, 2, 2, 5, 6};
        array.sortBubble();
        for (int i = 0; i < array.size(); i++) {
            expected[i] = array.get(i);
        }

        Assert.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sortInsert() {
        Array <Integer> array = new ArrayImpl<>();
        int[] expected = new int[6];
        array.add(1);
        array.add(5);
        array.add(6);
        array.add(-1);
        array.add(2);
        array.add(2);

        int[] actual = {-1, 1, 2, 2, 5, 6};
        array.sortBubble();
        for (int i = 0; i < array.size(); i++) {
            expected[i] = array.get(i);
        }

        Assert.assertArrayEquals(expected, actual);
    }
}