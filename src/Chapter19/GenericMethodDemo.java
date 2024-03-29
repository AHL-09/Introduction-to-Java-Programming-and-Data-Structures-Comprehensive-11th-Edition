package Chapter19;

class GenericMetjodDemo {
    public static void main(String[] args) {


        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};


        GenericMetjodDemo.<Integer>print(integers);
        GenericMetjodDemo.<String>print(strings);


    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
        System.out.println();
    }
}
