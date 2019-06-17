package space.eignatik;

import java.util.Arrays;
import space.eignatik.sortings.SortingChecker;
import space.eignatik.sortings.constants.Sortings;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {10, 12, 3, 6, 18, 0, -5, 11, 10, -42, 38, 151, -2, 24, 29, 8, 5, 0, -1, 257, 68, 91};
        int[] arrayTwo = {10, 0, 3, -6, 18};
        
        int[] arrayOneExpected = {-42, -5, -2, -1, 0, 0, 3, 5, 6, 8, 10, 10, 11, 12, 18, 24, 29, 38, 68, 91, 151, 257};
        int[] arrayTwoExpected = {-6, 0, 3, 10, 18};

        SortingChecker.checkSorting(arrayOne, arrayOneExpected, Sortings.BUBBLE_SORT, Sortings.INSERTION_SORT);
        SortingChecker.checkSorting(arrayTwo, arrayTwoExpected, Sortings.BUBBLE_SORT, Sortings.INSERTION_SORT);
    
    }
}
