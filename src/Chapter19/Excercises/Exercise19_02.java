package Chapter19.Excercises;

import java.util.ArrayList;

public class Exercise19_02 {
    public Exercise19_02() {
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<String>();
        stack.push("Arya");
        stack.push("John");
        stack.push("Grant");
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }


    // GenericStack.java: Implementing a stack using inheritance
    static class GenericStack<E> extends ArrayList<E> {
        public GenericStack() {
        }

        public int getSize() {
            return this.size();
        }

        public Object peek() {
            return this.get(this.getSize() - 1);
        }

        public Object push(E o) {
            this.add(o);
            return o;
        }

        public Object pop() {

            Object o = this.get(this.getSize() - 1);
            this.remove(getSize() - 1);
            return o;
        }

        public boolean isEmpty() {
            return super.isEmpty();
        }

        public int search(Object o) {
            return this.indexOf(o);
        }

        @Override
        public String toString() {
            return "stack: " + this.toString();
        }
    }
}
