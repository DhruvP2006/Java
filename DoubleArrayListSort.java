import java.util.ArrayList;
import java.util.Collections;

public class DoubleArrayListSort {

    public static void main(String[] args) {
        ArrayList<Double> doubleList = new ArrayList<>();

        doubleList.add(67.8);
        doubleList.add(12.5);
        doubleList.add(99.99);
        doubleList.add(1.12);
        doubleList.add(-34.7);

        System.out.println("ArrayList before sorting: " + doubleList);

        Collections.sort(doubleList);

        System.out.println("ArrayList after sorting:  " + doubleList);
    }
}