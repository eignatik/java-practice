package space.eignatik.sortings.implementations;

import java.util.StringJoiner;
import space.eignatik.sortings.exceptions.AssertionException;

public abstract class ArraysSorting {

    private static final boolean DEFAULT_INFO_ENABLED = true;

    private boolean infoEnabled = DEFAULT_INFO_ENABLED;

    public abstract void sort(int[] arrayToSort);
    
    public ArraysSorting setInfoEnabled(boolean infoEnabled) {
        this.infoEnabled = infoEnabled;
        return this;
    }

    protected boolean isInfoEnabled() {
        return this.infoEnabled;
    }

    protected void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    public void assertEquals(int[] actual, int[] expected) {
        if (actual == null || expected == null) {
            throw new IllegalArgumentException("One of the applicants is null. Actual = " + actual + ", expected = " + expected);
        }

        if (actual.length != expected.length) {
            String message = String.format("Length of the applicants is different: actual.length = %d, expected.length = %d", actual.length, expected.length);
           throw new AssertionException(message);
        }

        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) {
                String message = String.format("Elements at index %d are not equal [actual=%d, expected=%d]", i, actual[i], expected[i]);
                throw new AssertionException(message);
            }
        }

        System.out.println("TEST SUCCEDDED\n*******************\n");
    }

    public void printArray(int[] array) {
        StringJoiner sj = new StringJoiner(",\t", "[", "]");
        for (int i = 0; i < array.length; i++) {
            sj.add(String.valueOf(array[i])); 
        }
        System.out.println("Array with " + array.length +  " elements: " + sj.toString() );
    }
}
