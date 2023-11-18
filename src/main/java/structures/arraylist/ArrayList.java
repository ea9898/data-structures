package structures.arraylist;

import java.util.Arrays;

public class ArrayList<T> {

    private Object[] array;

    private int size;

    public ArrayList() {
        size = 0;
        array = new Object[10];
    }

    public void add(T value) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        array[size] = value;
        size++;
    }

    public void add(int index, T value) {
        size++;

        if (index < 0 || index >= size) {
            size--;
            throw new ArrayIndexOutOfBoundsException();
        }

        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return (T) array[index];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        array[index] = value;
    }

    public void remove(int index) {
        if (size == 0 || index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}
