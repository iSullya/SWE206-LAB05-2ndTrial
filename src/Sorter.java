public class Sorter {
    void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_element = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_element])
                    min_element = j;
            int temp = array[min_element];
            array[min_element] = array[i];
            array[i] = temp;
        }
    }

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
    // Method to print the elements of an array
    void printArray(int[] array)
    {
        for (int j : array)
            System.out.print(j + " ");
        System.out.println();
    }
    // Main Method
    public static void main(String[] args)
    {
        Sorter ob = new Sorter();
        int[] array = {15, 10, 99, 53, 36};
        int[] array2 = {2,1,4,3};

        ob.insertionSort(array2);
        ob.selectionSort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
        ob.printArray(array2);

    }
}