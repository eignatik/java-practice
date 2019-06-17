package space.eignatik.sortings;

import java.util.Random;
import java.util.Arrays;
import space.eignatik.sortings.constants.Sortings;
import space.eignatik.sortings.implementations.ArraysSorting;

public final class SortingChecker {

	private static final Random random = new Random();

	public static void checkSorting(int arraySize, Sortings...sortingType) {
		int[] actual = createArray(arraySize);
		int[] expected = copyArray(actual);
		Arrays.sort(expected);

		check(actual, expected, sortingType);
	}

	public static void checkSorting(int[] actual, int[] expected, Sortings...sortingType) {
		check(actual, expected, sortingType);
	}

	public static void checkSorting(int[] actual, Sortings...sortingType) {
		int[] expected = copyArray(actual);
		Arrays.sort(expected);
		check(actual, expected, sortingType);
	}

	private static void check(int[] actual, int[] expected, Sortings...sortingTypes) {
		for (Sortings type : sortingTypes) {
			assertion(actual, expected, SortingsFactory.createSorting(type));
		}
	}

	private static int[] createArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(100) - 100;
		}
		return array;
	}

	private static void assertion(int[] actual, int[] expected, ArraysSorting sorting) {
        int[] copiedArray = copyArray(actual);
        sorting.sort(copiedArray);
        sorting.assertEquals(copiedArray, expected);
    }

	private static int[] copyArray(int[] array) {
    	int[] destArray = new int[array.length];
    	System.arraycopy(array, 0, destArray, 0, array.length);
    	return destArray;
    }

}