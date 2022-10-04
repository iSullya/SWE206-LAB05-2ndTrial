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
        ob.selectionSort(array);
        System.out.println("Sorted array");
        ob.printArray(array);
    }
}