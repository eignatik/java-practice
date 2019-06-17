package space.eignatik.sortings.constants;

public enum Sortings {
	BUBBLE_SORT("Bubble sort"),
	INSERTION_SORT("Insertion sort"),
	;

	private String name;

	Sortings(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}