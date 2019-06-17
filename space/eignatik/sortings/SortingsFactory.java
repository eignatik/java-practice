package space.eignatik.sortings;

import space.eignatik.sortings.implementations.BubbleSort;
import space.eignatik.sortings.implementations.InsertionSort;
import space.eignatik.sortings.constants.Sortings;
import space.eignatik.sortings.implementations.ArraysSorting;

final class SortingsFactory {

	static ArraysSorting createSorting(Sortings type) {
		ArraysSorting sorting;
		switch(type) {
			case BUBBLE_SORT : 
				sorting = BubbleSort.getInstance();
				break;
			case INSERTION_SORT : 
				sorting = InsertionSort.getInstance();
				break;
			default: throw new IllegalArgumentException("What have you done?");
		}
		return sorting;
	}

}