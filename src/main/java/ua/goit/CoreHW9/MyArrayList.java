package ua.goit.CoreHW9;

import java.util.Arrays;
import java.util.Objects;

class MyArrayList <E> {
    private static final int capasity = 10;

    private static final Object[] EMPTY_DATA = new Object[]{};
    private static final Object[] Default_EMPTY_DATA = new Object[]{};
    transient Object[] buffer = {};
    private int size;


    protected transient int modCount = 0;




    public MyArrayList(int initialCapacity) {
       if(initialCapacity > 0) {
       this.buffer = new Object[initialCapacity];
       } else if (initialCapacity == 0) {
           this.buffer = EMPTY_DATA;
         } else {
           throw new IllegalArgumentException("Illigal capacity" + initialCapacity);
       }
    }

    public MyArrayList() { this.buffer = Default_EMPTY_DATA; }

    public int size() {
        return size;
    }

    public E get(int index) {
        Objects.checkIndex(index, size);
        return buffer(index);
    }

    E buffer(int index) {
        return (E) buffer[index];
    }



    public void add(Object value) {

        modCount++;
        final int s;
        Object[] buffer;
        if ((s = size) == (buffer = this.buffer).length)
            buffer = grow();
       // System.arraycopy(buffer, buffer.length, buffer, index + 1,s - index);
        buffer[size] = value;
        size = s + 1;
    }


    private Object[] grow() {
        return grow(size + 1);
    }


    private Object[] grow(int minCapacity) {
        return buffer = Arrays.copyOf(buffer,
                minCapacity);
    }

    public E remove(int index) {
        Objects.checkIndex(index, size);
        final Object[] es = buffer;

        @SuppressWarnings("unchecked") E oldValue = (E) es[index];
        fastRemove(es, index);

        return oldValue;
    }

    private void fastRemove(Object[] es, int i) {
        modCount++;
        final int newSize;
        if ((newSize = size - 1) > i)
            System.arraycopy(es, i + 1, es, i, newSize - i);
        es[size = newSize] = null;
    }

    public void clear() {
        modCount++;
        final Object[] es = buffer;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }

}


class MyArrayTest {
    public static void main(String[] args) {
        MyArrayList <Integer> test = new MyArrayList<>();
        test.add(5);
        test.add(898);
        test.add(235222);

        for (int i = 0; i < test.size(); i++) {
            System.out.println("test = " + test.buffer[i]);

        }
        System.out.println("size = " + test.size());
        test.add(555555);
        System.out.println("-------------------------------");
        for (int i = 0; i < test.size(); i++) {
            System.out.println("test = " + test.buffer[i]);

        }
        System.out.println("size = " + test.size());

        test.remove(1);
        System.out.println("-------------------------------");
        for (int i = 0; i < test.size(); i++) {
            System.out.println("test = " + test.buffer[i]);

        }
        System.out.println("size = " + test.size());
        System.out.println("index (2) = " + test.get(2));

        test.clear();
        System.out.println("-------------------------------");
        for (int i = 0; i < test.size(); i++) {
            System.out.println("test = " + test.buffer[i]);

        }
        System.out.println("size = " + test.size());

    }
}