import java.util.*;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Integer[] array = new Integer[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 60) - 30);
        }
        MyList myList = new MyList<Integer>();
        myList.addAll(List.of(array));

        Comparator<Integer> c = Comparator.comparing(Integer::valueOf);
        myList.sort(c);
    }
}
