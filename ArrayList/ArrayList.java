package ArrayList;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class ArrayList<T> {

    private int size;
    private int capacity;
    private T[] array;

    ArrayList() {
        size = 0;
        capacity = 10;
        array = (T[]) new Object[capacity];
    }

    ArrayList(T data) {
        size = 0;
        capacity = 10;
        array = (T[]) new Object[capacity];
        array[size] = data;
        size++;
    }

    ArrayList(T[] values) {
        size = 0;
        capacity = 10;
        array = (T[]) new Object[capacity];
        addAll(values);
    }

    void add(T value) {
        checkCapacity();
        array[size++] = value;
    }

    void addAtFirst(T value) {
        checkCapacity();
        for (int i = size; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = value;
        size++;
    }

    void addAtLast(T value) {
        add(value);
    }

    void addAtPosition(int position, T value) {

        if (position > size) {

            if (position <= capacity) {
                size = position;
                array[position - 1] = value;
            } else {
                capacity = position * 2;
                array = Arrays.copyOf(array, capacity);
                size = position;
                array[position - 1] = value;
            }

            return;

        }

        checkCapacity();

        for (int i = size; i >= position; i--) {
            array[i] = array[i - 1];
        }

        array[position - 1] = value;
        size++;
    }

    void addAll(T[] values) {
        for (T i : values) {
            add(i);
        }
    }

    void deleteAtFirst() {
        deleteAtPosition(1);
    }

    void deleteAtLast() {
        deleteAtPosition(size);
    }

    void deleteAtPosition(int position) {

        if (position < 1 || position > size) {
            throw new ArrayIndexOutOfBoundsException(position - 1);
        }

        for (int i = position - 1; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        checkCapacity();
    }

    void deleteAll() {
        size = 0;
        capacity = 10;
        array = Arrays.copyOf((T[]) new Object[] { 0 }, capacity);
    }

    T getValue(int index) {

        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        return array[index];
    }

    void updateValue(int position, T value) {
        if (position < 1 || position > size) {
            throw new ArrayIndexOutOfBoundsException(position - 1);
        }
        array[position - 1] = value;
    }

    boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }

    int containsNthValue(int nthValue, T value) {
        int count = 0;
        if (nthValue > 0) {
            for (int i = 0; i < size; i++) {
                if (array[i] == value) {
                    count++;
                }
                if (count == nthValue) {
                    return i;
                }
            }
        } else if (nthValue < 0) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i] == value) {
                    count++;
                }
                if (count + nthValue == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    boolean isEmpty() {

        if (size == 0) {
            return true;
        }

        return false;
    }

    private void checkCapacity() {
        if (capacity == size) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        } else if (size > 10 && capacity > size * 3) {
            capacity -= size * 2;
            array = Arrays.copyOf(array, capacity);
        }
    }

    void display() {
        if (size == 0) {
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return this.size;
    }

}
