package Chapter19.Excercises;

public class Exercise19_05 {
    public Exercise19_05() {
    }

    public static void main(String[] args) {

    }

    public static <E extends Comparable<E>> E max(E[] list) {
E max = list[0];
        for (int i = 1; i <list.length ; i++) {
            if (max.compareTo(list[i])<0){
            max = list[i];
            }
        }
        return max;
        }
    }
