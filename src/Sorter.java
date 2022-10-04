import java.util.Arrays;

public class Sorter {
    void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int s[] = {2,1,4,3};
        System.out.println(Arrays.toString(s));

        Sorter is = new Sorter();
        is.insertionSort(s);
        System.out.println(Arrays.toString(s));



    }
}
