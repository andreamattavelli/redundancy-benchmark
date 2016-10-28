package sorting.bubblesort;

public class BubbleSort5 {
	
	private int array[];
	
	public BubbleSort5(int array[]) {
		this.array = array;
	}

	public int[] sort() {
		int newLowest = 0; // index of first comparison
		int newHighest = array.length - 1; // index of last comparison
		while (newLowest < newHighest) {
			int highest = newHighest;
			int lowest = newLowest;
			newLowest = array.length; // start higher than any legal index
			for (int i = lowest; i < highest; i++) {
				if (array[i] > array[i + 1]) {
					// exchange elements
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					if (i < newLowest) {
						newLowest = i - 1;
						if (newLowest < 0) {
							newLowest = 0;
						}
					} else if (i > newHighest) {
						newHighest = i + 1;
					}
				}
			}
		}
		return array;
	}
	
}
