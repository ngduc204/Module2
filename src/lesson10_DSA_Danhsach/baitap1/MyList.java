package lesson10_DSA_Danhsach.baitap1;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        Object newArray[] = new Object[newCapacity];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E element = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
        return element;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }
}