package space.eignatik.sortings.implementations;

import space.eignatik.sortings.constants.Sortings;

public class InsertionSort extends ArraysSorting {

	private static InsertionSort instance;

    public static InsertionSort getInstance() {
        if (instance == null) {
            instance = new InsertionSort();
        }
        return instance;
    }

	@Override
	public void sort(int[] array) {
		int iterations = 0;
        int swaps = 0;
        int comparisons = 0;

        if (isInfoEnabled()) {
        	System.out.println(Sortings.INSERTION_SORT.getName());
            printArray(array);
        }

        int min = 0;
        int in;
        int out;

        for (out = 0; out < array.length; out++) {
        	min = out;
        	iterations++;
        	for (in = out + 1; in < array.length; in++) {
        		iterations++;
        		if (array[in] < array[min]) {
        			min = in;
        			comparisons++;
        		}
        	}
        	swap(array, out, min);
        	swaps++;
        }

        if (isInfoEnabled()) {
            String message = String.format("Overall iterations=%d, Swaps=%d, elements=%d, comparisons=%d",
                    iterations, swaps, array.length, comparisons);
            printArray(array);
            System.out.println(message);
        }
	} 

}