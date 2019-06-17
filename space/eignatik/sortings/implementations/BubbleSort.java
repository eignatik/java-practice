package space.eignatik.sortings.implementations;

import space.eignatik.sortings.constants.Sortings;

public class BubbleSort extends ArraysSorting {

    private static BubbleSort instance;

    public static BubbleSort getInstance() {
        if (instance == null) {
            instance = new BubbleSort();
        }
        return instance;
    }
    
    @Override
    public void sort(int[] array) {
        int iterations = 0;
        int swaps = 0;
        int comparisons = 0;

        if (isInfoEnabled()) {
            System.out.println(Sortings.BUBBLE_SORT.getName());
            printArray(array);
        }

        for (int i = 0; i < array.length; i++) {
            iterations++;
            for (int j = i; j < array.length; j++) {
                iterations++;
                if (array[j] < array[i]) {
                    swap(array, i, j);
                    swaps++;
                    comparisons++;
                }
            }
        }    

        if (isInfoEnabled()) {
            String message = String.format("Overall iterations=%d, Swaps=%d, elements=%d, comparisons=%s",
                    iterations, swaps, array.length, comparisons);
            printArray(array);
            System.out.println(message);
        }
    }
}
