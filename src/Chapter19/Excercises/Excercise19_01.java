package Chapter19.Excercises;

import java.util.Objects;

class GenericStack<E> {
    public final static int INITIAL_SIZE = 16;
    private E[] elements;
    private int size;

    /**
     * Construct a stack with the default initial capacity
     */
    public GenericStack() {
        this(INITIAL_SIZE);
    }

    /**
     * Construct a stack with the specified initial capacity
     */
    public GenericStack(int initialCapacity) {
        elements = (E[]) new Object[initialCapacity];
    }
//    public int getSize() {
//        return list.size();
//    }
//
//    public E peek() {
//        return list.get(getSize() - 1);
//    }

    /**
     * Push a new element into the top of the stack
     */
    public E push(E value) {
        if (size > elements.length) {
            E[] temp = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        return elements[size++] = value;
    }

//    public E pop() {
//        E o = list.get(getSize() - 1);
//        list.remove(getSize() - 1);
//        return o;
//    }
//
//    public boolean isEmpty() {
//        return list.isEmpty();
//    }
//
//    @Override
//    public String toString() {
//        return "stack: " + list.toString();
//    }
}
