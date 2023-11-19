package structures.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void size() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Assertions.assertEquals(2, list.size());
    }

    @Test
    void testAdd() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1, 22);

        Assertions.assertEquals(22, list.get(1));
    }

    @Test
    void get() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        Assertions.assertEquals(2, list.get(1));
    }

    @Test
    void set() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(1, 44);

        Assertions.assertEquals(44, list.get(1));
    }

    @Test
    void remove() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);

        Assertions.assertEquals(3, list.get(1));
    }
}