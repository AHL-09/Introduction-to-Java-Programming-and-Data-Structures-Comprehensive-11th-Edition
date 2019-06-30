package Chapter19.Excercises;

import java.util.ArrayList;

public class Exercise19_03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Arya");
        list.add("John");
        list.add("Grant");
        list.add("Susan");
        list.add("Arya");
        list.add("John");

        ArrayList<String> newList = removeDuplicates(list);

        System.out.println(newList);

    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<E>();
        for (E e : list) {
            if (!result.contains(e))
                result.add(e);
        }
        return result;
    }
}
